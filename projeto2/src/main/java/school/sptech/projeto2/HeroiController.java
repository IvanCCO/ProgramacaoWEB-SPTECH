package school.sptech.projeto2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {

    List<Heroi> heroisList = new ArrayList<>();

    @GetMapping
    public List<Heroi> listarHerois(){
        heroisList.add(new Heroi("Flash", "COrrer", 18, 12.2, true));
        return heroisList;
    }

    @GetMapping("/{i}")
    public Heroi recuperarHeroi(@PathVariable int i){

        if(i >= 0 && i <= heroisList.size()){
            return heroisList.get(i);
        }
        return null;
    }

    @GetMapping("/cadastrar/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public Heroi cadastrarHeroi(
            @PathVariable String nome,
            @PathVariable String habilidade,
            @PathVariable int idade,
            @PathVariable double forca,
            @PathVariable boolean vivo){


        Heroi novoHeroi =  new Heroi(nome, habilidade, idade, forca, vivo);
        heroisList.add(novoHeroi);
        return novoHeroi;
    }

    @GetMapping("atualizar/{indice}/{nome}/{habilidade}/{idade}/{forca}/{vivo}")
    public Heroi atualizarHeroi(
            @PathVariable int indice,
            @PathVariable String nome,
            @PathVariable String habilidade,
            @PathVariable int idade,
            @PathVariable double forca,
            @PathVariable boolean vivo
    ){

        Heroi novoHeroi =  new Heroi(nome, habilidade, idade, forca, vivo);
        heroisList.set(indice,novoHeroi);
        return novoHeroi;
    }


    @GetMapping("remover/{indice}")
    public String removeHeroi(@PathVariable int indice){

        if(indice >= 0 && indice <= heroisList.size()){
            heroisList.remove(indice);
            return "Heroi removido";
        }else{
            return "Heroi não encontrado";
        }

    }

    @GetMapping("/consulta/{nome}")
    public List<Heroi> chamarHeroi(@PathVariable String nome){


        List<Heroi> listaNova = new ArrayList<>();

        for(Heroi h: heroisList){

            if(h.getNome().toLowerCase().contains(nome.toLowerCase())){

                listaNova.add(h);

            }

        }

        return listaNova;
    }

}
