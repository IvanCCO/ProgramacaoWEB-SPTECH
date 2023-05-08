package sptech.school.atividadecasa.service;


import sptech.school.atividadecasa.domain.AkumanoMi;
import java.util.List;


public interface AkumanoMiService {

    List<AkumanoMi> listarAkumanoMi();

    AkumanoMi akumanoMiPorPersonagem(long id);

    AkumanoMi cadastrarAkumanoMi(
            AkumanoMi akumanoMi
    );

    AkumanoMi atualizarLocalDeEncontro(
            long id,
            String localDeEncontro
    );



}
