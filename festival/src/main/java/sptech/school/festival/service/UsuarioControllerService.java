package sptech.school.festival.service;

import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import sptech.school.festival.model.Usuario;
import sptech.school.festival.repository.UsuarioRepository;
import sptech.school.festival.service.exception.ApiBadRequestError;
import sptech.school.festival.service.exception.ApiNoContentError;
import sptech.school.festival.service.exception.ApiNotFoundError;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioControllerService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario createUser(@Valid Usuario user) {

        Optional<Usuario> userEmail = this.usuarioRepository.findByEmail(user.getEmail());

        if(userEmail.isPresent()){
            throw new DataIntegrityViolationException("E-mail already exists.");
        }

        return usuarioRepository.save(user);
    }


    public List<Usuario> listarUsuario(){

        List<Usuario> list = usuarioRepository.findAll();

        if(list.isEmpty()){
            throw new ApiNoContentError("There's no user on the system");
        }
        return list;
    }

    public Usuario getUsuarioPorNome(
            String nome
    ){
     return this.usuarioRepository.findByNome(nome)
             .orElseThrow(() -> new ApiNotFoundError("Was not possible find user with name: " + nome));

    }


}
