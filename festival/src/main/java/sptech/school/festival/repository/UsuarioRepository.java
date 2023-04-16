package sptech.school.festival.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.festival.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNome(String nome);

    Optional<Usuario> findByEmail(String email);
}
