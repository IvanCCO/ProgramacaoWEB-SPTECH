package sptech.school.atividadecasa.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.atividadecasa.domain.Personagem;
import sptech.school.atividadecasa.domain.dto.AkumanoMiDto;
import sptech.school.atividadecasa.domain.dto.PersonagemDto;
import sptech.school.atividadecasa.service.PersonagemService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("personagens")
public class PersonagemController {


    @Autowired
    private PersonagemService personagemService;

    @GetMapping
    public ResponseEntity<List<PersonagemDto>> listarPersonagensCompletos(){
        return ResponseEntity.ok(this.personagemService
                .listarPersonagens()
                .stream()
                .filter(p-> p.getAkumanoMi() != null && p.getBando() != null)
                .map(p -> new PersonagemDto(p, new AkumanoMiDto(p.getAkumanoMi())))
                .collect(Collectors.toList())
        );
    }


    @PostMapping
    public ResponseEntity<Personagem> createPersonagem(
            @RequestBody @Valid Personagem personagem
            ){

        return ResponseEntity.ok(personagemService.createPersonagem(personagem));

    }

    @PutMapping("comer/{id}")
    public ResponseEntity<Personagem> comerAkumanoMi(
            @PathVariable long id,
            @RequestBody AkumanoMiDto akumanoMiDto
    ){

        return ResponseEntity.ok(this.personagemService.comerAkumanoMi(id, akumanoMiDto));
    }



    @GetMapping("bando")
    public ResponseEntity<List<Personagem>> getPersonagensDeBandoEspecico(
            @RequestParam String nome
    ){
        return ResponseEntity.ok(this.personagemService.getPersonagemPorBando(nome));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deletarPersonagemPorId(
            @PathVariable long id
    ){
        this.personagemService.deletarPersonagem(id);
        return ResponseEntity.status(200).build();
    }



}
