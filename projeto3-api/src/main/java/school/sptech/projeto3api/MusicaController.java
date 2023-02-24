package school.sptech.projeto3api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    private List<Musica> musicaList;
    public MusicaController() {

        this.musicaList = new ArrayList();
        this.musicaList.add(new Musica("Banho de Lula", 1923, true));
        this.musicaList.add(new Musica("Pipokinha", 2023, true));
        this.musicaList.add(new Musica("Rap do Naruto", 2016, true));
        this.musicaList.add(new Musica("Liniker", 2022, true));
    }

    @GetMapping()
    public List<Musica> listar(){
        return musicaList;
    }

    @GetMapping("/{i}")
    public Musica buscarPorIndice(@PathVariable int i){

        if(i > 0 && i < musicaList.size()){
            return musicaList.get(i);
        }
        return null;
    }

    @DeleteMapping("/{i}")
    public void removerPorIndice(@PathVariable int i){

        if(i > 0 && i < musicaList.size()){
            musicaList.remove(i);
        }

    }

    @PostMapping
    public Musica cadastrarMusica(@RequestBody Musica musiquinha){

        this.musicaList.add(musiquinha);
        return musiquinha;
    }

    @PutMapping("/{i}")
    public Musica atualizar(
            @PathVariable int i,
            @RequestBody Musica musiquinha
    ){

        if(i > 0 && i < musicaList.size()){

            this.musicaList.set(i, musiquinha);
            return musiquinha;
        }

        return null;

    }

}
