package sptech.school.atividadecasa.service;

import sptech.school.atividadecasa.domain.AkumanoMi;
import sptech.school.atividadecasa.domain.Personagem;
import sptech.school.atividadecasa.domain.dto.AkumanoMiDto;

import java.util.List;

public interface PersonagemService {

    List<Personagem> listarPersonagens();

    Personagem createPersonagem(Personagem personagem);

    Personagem comerAkumanoMi(long id, AkumanoMiDto akumanoMi);

    List<Personagem> getPersonagemPorBando(String bando);

    void deletarPersonagem(long id);

    Personagem getPersonagemPorId(long idCapitao);

    List<Personagem> listarCapitaesBando();

}
