package school.sptech.projeto2;

public class FrutaSimples {

    private String nome;
    private double preco;

    public FrutaSimples(Fruta fruta) {
        this.nome = fruta.getNome();
        this.preco = fruta.getPreco();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
