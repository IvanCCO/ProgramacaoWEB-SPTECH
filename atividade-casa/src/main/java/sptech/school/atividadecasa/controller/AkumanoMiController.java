package sptech.school.atividadecasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.atividadecasa.domain.AkumanoMi;
import sptech.school.atividadecasa.service.impl.AkumanoMiServiceImpl;

import java.util.List;

@RestController
@RequestMapping("frutas")
public class AkumanoMiController {

  @Autowired
  private AkumanoMiServiceImpl akumanoMiService;

  @GetMapping
  public ResponseEntity<List<AkumanoMi>> listarAkumanomis() {
    return ResponseEntity.ok(this.akumanoMiService.listarAkumanoMi());
  }

  @GetMapping("/{id}")
  public ResponseEntity<AkumanoMi> akumanoMiPorPersonagem(@PathVariable long id) {
    return ResponseEntity.ok(this.akumanoMiService.akumanoMiPorPersonagem(id));
  }

  @PostMapping
  public ResponseEntity<AkumanoMi> cadastrarAkumanoMi(@RequestBody AkumanoMi akumanoMi) {
    return ResponseEntity.ok(this.akumanoMiService.cadastrarAkumanoMi(akumanoMi));
  }

  @PutMapping("/{id}")
    public ResponseEntity<AkumanoMi> atualizarLocalDeEncontro(
            @PathVariable long id,
            @RequestParam String nome
  ){
    return ResponseEntity.ok(this.akumanoMiService.atualizarLocalDeEncontro(id, nome));
  }

}
