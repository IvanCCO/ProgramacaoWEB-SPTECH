package sptech.school.festival.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.festival.model.Festival;

import java.util.List;

public interface FestivalRepository extends JpaRepository<Festival, Integer> {

    List<Festival> findAllOrderByDataDesc();

}
