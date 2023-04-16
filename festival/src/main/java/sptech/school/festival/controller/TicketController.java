package sptech.school.festival.controller;


import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.festival.model.Ticket;
import sptech.school.festival.service.TicketControllerService;

import java.util.List;

@RestController
@RequestMapping("tickets")
public class TicketController {


    @Autowired
    private TicketControllerService ticketControllerService;

    @GetMapping
    public ResponseEntity<List<Ticket>> listarTickets(){
        return ResponseEntity.ok(this.ticketControllerService.listarTickets());
    }

    @PostMapping
    public ResponseEntity<Ticket> gerarTicket(
            @RequestBody @Valid Ticket ticket
    ){
        return ResponseEntity.ok(this.ticketControllerService
                .gerarTicket(ticket));

    }

}
