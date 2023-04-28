package sptech.school.atividade1notasprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sptech.school.atividade1notasprint3.domain.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {




}
