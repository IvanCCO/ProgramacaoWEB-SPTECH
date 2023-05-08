package sptech.school.atividadecasa.domain.dto;

import sptech.school.atividadecasa.domain.Personagem;

public class PersonagemDto {

    private String nome;
    private int idade;

    private AkumanoMiDto akumanoMiDto;

    public PersonagemDto(Personagem personagem, AkumanoMiDto akumanoMiDto) {
        this.nome = personagem.getNome();
        this.idade = personagem.getIdade();
        this.akumanoMiDto = akumanoMiDto;
    }

    public AkumanoMiDto getAkumanoMiDto() {
        return akumanoMiDto;
    }

    public void setAkumanoMiDto(AkumanoMiDto akumanoMiDto) {
        this.akumanoMiDto = akumanoMiDto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
