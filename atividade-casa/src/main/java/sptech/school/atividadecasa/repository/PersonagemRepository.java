package sptech.school.atividadecasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sptech.school.atividadecasa.domain.Personagem;

import java.util.List;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

    @Query(value = "SELECT * FROM BANDO", nativeQuery = true)
    List<Personagem> findAllByBandoNome();


    @Query(value = "SELECT PERSONAGEM.* FROM PERSONAGEM INNER JOIN BANDO WHERE PERSONAGEM.ID = BANDO.CAPITAO_ID", nativeQuery = true)
    List<Personagem> findAllPersonagensCapitao();
}
