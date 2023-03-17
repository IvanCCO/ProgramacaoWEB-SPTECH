package school.sptech.projeto6;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    private List<Musica> musicaList = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Musica>> listar(){
        if(musicaList.isEmpty()){ return ResponseEntity.status(204).build(); }
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/i")
    public ResponseEntity<Musica> buscarPorIndice(@PathVariable int i){

        if(i >= 0 && i < musicaList.size()){
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    @PostMapping
    public ResponseEntity<Musica> cadastrar(
            @RequestBody Musica musica
    ){
        try{
            this.musicaList.add(musica);
            return ResponseEntity.status(201).build();
        }catch (Exception ex){
            return ResponseEntity.status(400).build();
        }
    }

    @PutMapping("/i")
    public ResponseEntity<Musica> atualizar(
            @PathVariable int i,
            @RequestBody Musica musica
    ){
        if(i >= 0 && i < musicaList.size()){
            musicaList.set(i, musica);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/i")
    public ResponseEntity<Musica> remover(
            @PathVariable int i
    ){
        if(i >= 0 && i < musicaList.size()){
            musicaList.remove(i);
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(404).build();
    }

}
