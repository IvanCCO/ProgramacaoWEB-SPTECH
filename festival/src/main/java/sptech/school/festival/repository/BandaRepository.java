package sptech.school.festival.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.festival.model.Banda;

import java.util.Optional;

public interface BandaRepository extends JpaRepository<Banda, Integer> {

    Optional<Banda> findByNome(String nomeBanda);



}
