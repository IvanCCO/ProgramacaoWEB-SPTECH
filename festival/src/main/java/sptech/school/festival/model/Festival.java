package sptech.school.festival.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Size(min = 3, max = 20)
    private String nome;
    @FutureOrPresent
    private LocalDate data;

    @ManyToMany
    private List<Banda> lineUp;

    @Size(min = 3, max = 90)
    private String descricao;

    @NotNull
    private List<String> regras;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }


    public List<Banda> getLineUp() {
        return lineUp;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getRegras() {
        return regras;
    }
}
