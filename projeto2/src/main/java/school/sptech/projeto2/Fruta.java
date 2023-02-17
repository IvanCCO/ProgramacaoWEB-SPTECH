package school.sptech.projeto2;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Fruta {

    private String nome;
    private Double preco;

    private int quantidade;

    private boolean hasSemente;


    public Fruta(String nome, Double preco, int quantidade, boolean hasSemente) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.hasSemente = hasSemente;
    }


    public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isHasSemente() {
        return hasSemente;
    }

    public void setHasSemente(boolean hasSemente) {
        this.hasSemente = hasSemente;
    }

    public String getPrecoDescricao(){
        return preco > 10?"cainho":"ded";
    }


}
