package sptech.school.festival.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.festival.model.Festival;
import sptech.school.festival.repository.FestivalRepository;
import sptech.school.festival.service.FestivalControllerService;

import java.util.List;


@RestController
@RequestMapping("festivais")
public class FestivalController {

    @Autowired
    private FestivalRepository festivalRepository;

    @Autowired
    private FestivalControllerService festivalControllerService;

    @GetMapping
    public ResponseEntity<List<Festival>> listarFestivais(){
        return ResponseEntity.ok(this.festivalControllerService.listarTodos());
    }

    @PatchMapping("/atualizar/{nomeBanda},{idFestival} ")
    public ResponseEntity<Festival> atualizarLineUp(
            @PathVariable String nomeBanda,
            @PathVariable int idFestival
    ){
        return ResponseEntity.ok(this.festivalControllerService.atualizarLineUp(nomeBanda, idFestival));
    }

    @DeleteMapping("/{id")
    public ResponseEntity<Void> deletarFestival(
            @PathVariable int id
    ){
        this.festivalControllerService.deletarFestivalPorId(id);
        return ResponseEntity.status(200).build();
    }

    @PostMapping
    public ResponseEntity<Festival> cadastrarFestival(
            @Valid @RequestBody Festival festival
    ){
        return ResponseEntity
                .ok(this.festivalControllerService.cadastrarFestival(festival));
    }
    @GetMapping("listar-proximos")
    public ResponseEntity<List<Festival>> getFestivalMaisProximos(){
        return ResponseEntity.ok(this.festivalControllerService.getFestivaisMaisProximos());
    }
}
