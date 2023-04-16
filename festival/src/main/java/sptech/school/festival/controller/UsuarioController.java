package sptech.school.festival.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.festival.model.Usuario;
import sptech.school.festival.service.UsuarioControllerService;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    UsuarioControllerService usuarioControllerService;

    @PostMapping
    public ResponseEntity<Usuario> createUser(
            @RequestBody Usuario user
    ){
        return ResponseEntity.ok(this.usuarioControllerService
                .createUser(user));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return ResponseEntity.ok(this.usuarioControllerService
                .listarUsuario());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Usuario> getUserByName(
            @PathVariable String nome
    ){
        return ResponseEntity.ok(this.usuarioControllerService.getUsuarioPorNome(nome));
    }





}
