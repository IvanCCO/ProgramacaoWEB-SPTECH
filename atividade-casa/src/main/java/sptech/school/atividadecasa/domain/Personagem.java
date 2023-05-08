package sptech.school.atividadecasa.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import sptech.school.atividadecasa.domain.dto.AkumanoMiDto;

@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String nome;

    @NotNull
    int idade;

    @OneToOne
    private AkumanoMi akumanoMi;

    @ManyToOne
    private Bando bando;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bando getBando() {
        return bando;
    }

    public void setBando(Bando bando) {
        this.bando = bando;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public AkumanoMi getAkumanoMi() {
        return akumanoMi;
    }

    public void setAkumanoMi(AkumanoMi akumanoMi) {
        this.akumanoMi = akumanoMi;
    }


    public void setAkumanoMi(AkumanoMiDto akumanoMiDto){
        this.akumanoMi.setNome(akumanoMiDto.getNome());
        this.akumanoMi.setPoder(akumanoMiDto.getPoder());
    }




}
