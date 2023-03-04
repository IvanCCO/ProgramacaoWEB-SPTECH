package school.sptech.login02221071ivanmiranda;

public class UsuarioDto {


    private String usuario;
    private String nome;
    private boolean isAutentificado;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutentificado(boolean autentificado) {
        isAutentificado = autentificado;
    }

    public UsuarioDto(Usuario user) {
        this.usuario = user.getUsuario();
        this.nome = user.getNome();
        this.isAutentificado = user.isAutentificado();
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAutentificado() {
        return isAutentificado;
    }
}
