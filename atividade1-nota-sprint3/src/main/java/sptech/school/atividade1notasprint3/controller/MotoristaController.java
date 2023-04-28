package sptech.school.atividade1notasprint3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.atividade1notasprint3.domain.Motorista;
import sptech.school.atividade1notasprint3.service.MotoristaService;
import sptech.school.atividade1notasprint3.service.impl.MotoristaServiceImpl;

@RestController
public class MotoristaController {


    @Autowired
    private MotoristaService motoristaService;

    @GetMapping
    public ResponseEntity<Motorista> x(long id){
        return ResponseEntity.status(200).body(this.motoristaService.getMotoristaPorId(id));
    }

    

}
