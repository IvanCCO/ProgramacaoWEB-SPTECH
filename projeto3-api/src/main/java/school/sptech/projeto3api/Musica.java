package school.sptech.projeto3api;

public class Musica {

    private String nome;
    private int anoLancamento;
    private boolean nacional;

    public Musica(String nome, int anoLancamento, boolean nacional) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.nacional = nacional;
    }

    public Musica() {
        // Crei o vazio pq o Spring pode dar erro com o construtor cheio
        // Nem precisava desse construtor
        // O spring utiliza só esse, mas se nao declarar o cheio esse é default
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }
}
