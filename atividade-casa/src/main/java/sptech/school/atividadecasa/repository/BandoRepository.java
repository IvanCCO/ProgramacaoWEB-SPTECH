package sptech.school.atividadecasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sptech.school.atividadecasa.domain.Bando;

import java.util.Optional;

@Repository
public interface BandoRepository extends JpaRepository<Bando, Long> {

    Optional<Bando> findByNomeContainsIgnoreCase(String nome);
}
