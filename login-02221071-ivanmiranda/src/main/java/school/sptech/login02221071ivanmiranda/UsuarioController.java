package school.sptech.login02221071ivanmiranda;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarioList = new ArrayList<>();


    // Funcionou
    @GetMapping()
    public List<UsuarioDto> listarDto(){
        return usuarioList.stream().map(UsuarioDto::new).collect(Collectors.toList());
    }

    @PostMapping()
    public UsuarioDto cadastrarUsuario(
            @RequestBody Usuario usuario
    ){
        this.usuarioList.add(usuario);
        return new UsuarioDto(usuario);
    }


    @PostMapping("/autentificacao/{usuario}/{senha}")
    public UsuarioDto autentificarUsuario (
            @PathVariable String usuario,
            @PathVariable String senha
    ){
        Optional<Usuario> first = usuarioList.stream()
                .filter(u -> u.getUsuario().equalsIgnoreCase(usuario) && u.getSenha().equals(senha))
                .findFirst();
        if (first.isPresent()) {
            Usuario usr = first.get();
            usr.setAutentificado(true);
            return new UsuarioDto(usr);
        } else {
            return null;
        }

    }

    @DeleteMapping("/autentificacao/{usuario}")
    public String logoffUsuario(
            @PathVariable String usuario
    ){
        Optional<Usuario> first= usuarioList.stream()
                .filter(u -> u.getUsuario().equals(usuario))
                .findFirst();
        if(first.isPresent()){
            Usuario usr = first.get();
            if(usr.isAutentificado()){
                usr.setAutentificado(false);
                return "Logoff do usuário " + usr.getNome() + " concluido";
            }else return "Usuário " + usr.getNome() + " não está autentificado";
        }
        return "Usuário " + usuario + " não encontrado ";
    }


    // Método GetUsuários com senha Fraca
    @GetMapping("low-pass")
    public Stream<Usuario> weakPassword(){
        return usuarioList.stream().filter(usr -> usr.getSenha().length() <= 8);
    }


}
