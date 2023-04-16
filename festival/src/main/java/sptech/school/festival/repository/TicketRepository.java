package sptech.school.festival.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.festival.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
