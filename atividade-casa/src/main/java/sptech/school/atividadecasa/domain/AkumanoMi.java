package sptech.school.atividadecasa.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class AkumanoMi {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String localDeEncontro;

  @NotBlank private String nome;

  @NotBlank private String poder;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLocalDeEncontro() {
    return localDeEncontro;
  }

  public void setLocalDeEncontro(String localDeEncontro) {
    this.localDeEncontro = localDeEncontro;
  }

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
}
