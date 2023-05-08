package sptech.school.atividadecasa.service;

import sptech.school.atividadecasa.domain.Bando;

import java.util.List;

public interface BandoService {

    List<Bando> listarBandos();

    Bando getBandoPorNome(String nome);

    Bando mudarCapitao(long idBando, long idCapitao);

    Bando findBandoPorId(long id);

}
