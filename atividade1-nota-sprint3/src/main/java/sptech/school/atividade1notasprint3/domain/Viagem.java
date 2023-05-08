package sptech.school.atividade1notasprint3.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Min(3)
    @Max(20)
    private String localInicio;

    @NotBlank
    @Min(3)
    @Max(20)
    private String localFinal;


    private LocalDate dataSaida;

    private LocalDate dataChegada;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocalInicio() {
        return localInicio;
    }

    public void setLocalInicio(String localInicio) {
        this.localInicio = localInicio;
    }

    public String getLocalFinal() {
        return localFinal;
    }

    public void setLocalFinal(String localFinal) {
        this.localFinal = localFinal;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }
}
