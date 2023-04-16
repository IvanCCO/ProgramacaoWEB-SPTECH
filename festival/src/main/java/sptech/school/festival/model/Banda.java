package sptech.school.festival.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import sptech.school.festival.model.enums.GeneroType;

import java.util.List;

@Entity
public class Banda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 3, max = 30)
    private String nome;
    @NotNull
    private GeneroType genero;
    @Size(min = 10, max = 90)
    private String descricao;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public GeneroType getGenero() {
        return genero;
    }

    public String getDescricao() {
        return descricao;
    }

}
