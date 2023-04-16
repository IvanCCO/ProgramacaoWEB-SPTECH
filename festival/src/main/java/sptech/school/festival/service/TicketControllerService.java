package sptech.school.festival.service;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.school.festival.model.Ticket;
import sptech.school.festival.repository.TicketRepository;
import sptech.school.festival.service.exception.ApiNoContentError;

import java.util.List;

@Service
public class TicketControllerService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> listarTickets(){

        List<Ticket> ticketList= this.ticketRepository.findAll();
        if(ticketList.isEmpty()){
            throw new ApiNoContentError("Não existe nenhum ticket no sistema");
        }
        return ticketList;
    }
    public Ticket gerarTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

}
