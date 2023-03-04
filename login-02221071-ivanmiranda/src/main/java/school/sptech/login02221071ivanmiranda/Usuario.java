package school.sptech.login02221071ivanmiranda;

public class Usuario {

    private String usuario;
    private String senha;
    private String nome;

    private boolean isAutentificado;

    public Usuario() {
        this.isAutentificado = false;
    }

    public boolean isAutentificado() {
        return isAutentificado;
    }

    public void setAutentificado(boolean autentificado) {
        isAutentificado = autentificado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
