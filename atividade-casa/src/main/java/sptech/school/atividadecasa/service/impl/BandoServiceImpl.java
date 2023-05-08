package sptech.school.atividadecasa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.school.atividadecasa.domain.Bando;
import sptech.school.atividadecasa.domain.Personagem;
import sptech.school.atividadecasa.repository.BandoRepository;
import sptech.school.atividadecasa.repository.PersonagemRepository;
import sptech.school.atividadecasa.service.BandoService;
import sptech.school.atividadecasa.service.PersonagemService;
import sptech.school.atividadecasa.service.exception.NoContentApiError;
import sptech.school.atividadecasa.service.exception.NotFoundApiError;

import java.util.List;

@Service
public class BandoServiceImpl implements BandoService {


    @Autowired
    private  BandoRepository bandoRepository;


    @Override
    public List<Bando> listarBandos() {
        List<Bando> bandoAchado = bandoRepository.findAll();

        if(bandoAchado.isEmpty()){
            throw new NoContentApiError("Não existe nenhum bando cadastrado");
        }
        return bandoAchado;
    }

    @Override
    public Bando getBandoPorNome(String nome) {
    return this.bandoRepository
        .findByNomeContainsIgnoreCase(nome)
        .orElseThrow(() -> new NotFoundApiError("Não foi encontrado nenhum bando com o nome : " + nome));
    }

    @Override
    public Bando mudarCapitao(long idBando, long idCapitao) {
        return null;
    }

    @Override
    public Bando findBandoPorId(long id) {
        return this.bandoRepository.findById(id).orElseThrow( () -> new NotFoundApiError("Não foi possível encontrar nenhum bando com id: " + id));
    }

}
