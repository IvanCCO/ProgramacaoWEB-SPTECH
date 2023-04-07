package sptech.school.projetoaula3;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme, Id> {

    Optional<Filme> findById(int index);
    Optional<Filme> findByNome(String nome);
    List<Filme> findByDiretorIgnoreCase(String diretor);
    List<Filme> findByDataLancamentoLessThanEqual(LocalDate date);

    List<Filme> findByIndicacaoOscarTrue();
    Integer countByIndicacaoOscarFalse();

    List<Filme> findByCustoProducaoGreaterThanEqual(double custo);
}
