package sptech.school.atividadecasa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sptech.school.atividadecasa.domain.AkumanoMi;

import java.util.Optional;


@Repository
public interface AkumanoMiRepository extends JpaRepository<AkumanoMi, Long> {

    @Query(value = "SELECT AKUMANO_MI.* FROM AKUMANO_MI INNER JOIN PERSONAGEM WHERE PERSONAGEM.AKUMANO_MI_ID = AKUMANO_MI.ID AND AKUMANO_MI.ID = :personagemId", nativeQuery = true)
    Optional<AkumanoMi> findAkumanoMiPorPersonagemId(@Param("personagemId") Long personagemId);
}
