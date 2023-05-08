package sptech.school.atividadecasa.domain.dto;

import sptech.school.atividadecasa.domain.AkumanoMi;

public class AkumanoMiDto {

    private String nome;
    private String poder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public AkumanoMiDto(AkumanoMi akumanoMi) {
        this.nome = akumanoMi.getNome();
        this.poder = akumanoMi.getPoder();
    }
}
