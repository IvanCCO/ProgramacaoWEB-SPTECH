package sptech.school.novotema;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("musicas")
public class MusicaController {


    @Autowired
    private MusicaRepository musicaRepository;


    @GetMapping
    public ResponseEntity<List<Musica>> listarMusicas(){

        List<Musica> musicas = this.musicaRepository.findAll();

        if(musicas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(musicas);
    }

    @PostMapping
    public ResponseEntity<Musica> novaMusica(
            @RequestBody @Valid Musica musica
    ){

        if(musica != null){
            Musica musicaRegistrada = this.musicaRepository.save(musica);
            return ResponseEntity.ok().body(musicaRegistrada);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> musicaPorIndice(
            @PathVariable  int id
    ){

        Optional<Musica> musicaAchada = this.musicaRepository.findById(id);

        if(musicaAchada.isPresent()){
            Musica musica = musicaAchada.get();
            return ResponseEntity.status(200).body(musica);
        }

        return ResponseEntity.status(404).build();
    }




    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualizaPorId(

            @RequestBody Musica musica,
            @PathVariable Integer id
    ){


        if(this.musicaRepository.existsById(id)){
            musica.setId(id);
            Musica mus = this.musicaRepository.save(musica);
            ResponseEntity.status(200).body(mus);
        }

        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deletarPorIndice(
            @PathVariable Integer id
    ){

        if(this.musicaRepository.existsById(id)){
            musicaRepository.deleteById(id);
            ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }


}
