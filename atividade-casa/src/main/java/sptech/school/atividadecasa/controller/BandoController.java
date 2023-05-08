package sptech.school.atividadecasa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.atividadecasa.domain.Bando;
import sptech.school.atividadecasa.service.BandoService;

import java.util.List;

@RestController
@RequestMapping("bandos")
public class BandoController {

    @Autowired
    private BandoService bandoService;

    @GetMapping
    public ResponseEntity<List<Bando>> listarBandos(){
        return ResponseEntity.ok(this.bandoService.listarBandos());
    }

    @GetMapping("bando")
    public ResponseEntity<Bando> bandoPorNome(
            @RequestParam String nome
    ){
        return ResponseEntity.ok(this.bandoService.getBandoPorNome(nome));
    }


    @PutMapping("/{idBando}/{idPersonagem}")
    public ResponseEntity<Bando> mudarCapitao(
            @PathVariable int idBando,
            @PathVariable int idPersonagem

    ){
        return ResponseEntity.ok(this.bandoService.mudarCapitao(idBando, idPersonagem));
    }

}
