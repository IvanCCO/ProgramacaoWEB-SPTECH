package sptech.school.atividadecasa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.school.atividadecasa.domain.AkumanoMi;
import sptech.school.atividadecasa.repository.AkumanoMiRepository;
import sptech.school.atividadecasa.service.AkumanoMiService;
import sptech.school.atividadecasa.service.exception.NoContentApiError;
import sptech.school.atividadecasa.service.exception.NotFoundApiError;
import java.util.List;



@Service
public class AkumanoMiServiceImpl implements AkumanoMiService {


    @Autowired
    private AkumanoMiRepository akumanoMiRepository;

    @Override
    public List<AkumanoMi> listarAkumanoMi() {
        List<AkumanoMi> akumanoMiList = akumanoMiRepository.findAll();

        if(akumanoMiList.isEmpty()){
            throw new NoContentApiError("Não existe nenhuma akumanomi cadastrada");
        }

        return akumanoMiList;
    }

    @Override
    public AkumanoMi akumanoMiPorPersonagem(long id) {
    return
        this.akumanoMiRepository
            .findAkumanoMiPorPersonagemId(id)
            .orElseThrow(() -> new NotFoundApiError("Não existe nenhuma Akumano-mi para esse personagem com id: " + id));
    }

    @Override
    public AkumanoMi cadastrarAkumanoMi(AkumanoMi akumanoMi) {

        try{
        this.akumanoMiRepository.save(akumanoMi);
        return akumanoMi;
        }catch (Exception ex){
            throw ex;
        }

    }

    @Override
    public AkumanoMi atualizarLocalDeEncontro(
            long id,
            String localDeEncontro
    ) {

        AkumanoMi akumanoMi = this.akumanoMiRepository
                .findById(id).orElseThrow(
                        () -> new NotFoundApiError("Não foi encontrado AkumanoMi com ID: " + id));

        akumanoMi.setLocalDeEncontro(localDeEncontro);

        return akumanoMi;
    }
}
