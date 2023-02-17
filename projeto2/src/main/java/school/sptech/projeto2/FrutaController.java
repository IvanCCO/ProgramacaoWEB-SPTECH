package school.sptech.projeto2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/frutas")
public class FrutaController {

    private List<Fruta> frutasList = new ArrayList<>();

    @GetMapping("/listar")
    public List<Fruta> listar(){

        return frutasList;
    }

    // Cadastra uma fruta
    @GetMapping("/adicionar/{nome}/{preco}/{quantidade}/{hasSemente}")
    public String cadastrarFruta(@PathVariable String nome, @PathVariable double preco, @PathVariable int quantidade, @PathVariable boolean hasSemente){

        Fruta fr = new Fruta(nome, preco, quantidade, hasSemente);

        frutasList.add(fr);

        return "Fruta cadastrada";
    }

    // recuperar pelo indice

    @GetMapping("recuperar/{i}")
    public Fruta recuperarFruta(@PathVariable int i){

        if(i >= 0 && i < frutasList.size()){

            Fruta fruta = frutasList.get(i-1);
            return fruta;

        }else{
            return null;
        }


    }

    @GetMapping("/atualizar/{i}/{nome}/{preco}/{quantidade}/{hasSemente}")
    public String atualizar(@PathVariable int i,
                            @PathVariable String nome,
                            @PathVariable double preco,
                            @PathVariable int quantidade,
                            @PathVariable boolean hasSemente){

        Fruta frutaNova = new Fruta(nome, preco, quantidade, hasSemente);
        frutasList.set(i, frutaNova);

        return "fruta atualizada";
    }

    @GetMapping("excluir/{indice}")
    public String excluirPorIndice(@PathVariable int indice){

        frutasList.remove(indice);

        return "Fruta excluido";
    }

}
