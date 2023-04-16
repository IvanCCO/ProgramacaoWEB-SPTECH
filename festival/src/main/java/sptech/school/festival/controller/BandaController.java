package sptech.school.festival.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.festival.model.Banda;
import sptech.school.festival.repository.BandaRepository;
import sptech.school.festival.service.BandaControllerService;

@RestController
@RequestMapping("bandas")
public class BandaController {

    @Autowired
    private BandaRepository bandaRepository;
    @Autowired
    private BandaControllerService bandaControllerService;

    @GetMapping("/{id}")
    public ResponseEntity<Banda> getBandaPorId(
            @PathVariable int id
    ){
        return ResponseEntity.ok(this.bandaControllerService.getBandaById(id));
    }


}
