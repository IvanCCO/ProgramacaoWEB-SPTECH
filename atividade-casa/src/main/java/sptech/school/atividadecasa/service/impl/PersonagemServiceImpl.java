package sptech.school.atividadecasa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.school.atividadecasa.domain.Personagem;
import sptech.school.atividadecasa.domain.dto.AkumanoMiDto;
import sptech.school.atividadecasa.repository.PersonagemRepository;
import sptech.school.atividadecasa.service.PersonagemService;
import sptech.school.atividadecasa.service.exception.NoContentApiError;
import sptech.school.atividadecasa.service.exception.NotFoundApiError;

import java.util.List;

@Service
public class PersonagemServiceImpl implements PersonagemService {


    @Autowired
    private  PersonagemRepository personagemRepository;

    @Override
    public List<Personagem> listarPersonagens() {

        List<Personagem> list = this.personagemRepository.findAll();

        if(list.isEmpty()){
            throw new NoContentApiError("Não existe nenhum personagem cadastrado");
        }

        return list;

    }
    @Override
    public Personagem createPersonagem(Personagem personagem) {

        try{
            personagemRepository.save(personagem);
            return personagem;
        }catch (Exception ex){
            throw ex;
        }

    }

    @Override
    public Personagem comerAkumanoMi(long id, AkumanoMiDto akumanoMi) {

        Personagem personagem = this.personagemRepository.findById(id).orElseThrow();
        personagem.setAkumanoMi(akumanoMi);
        return personagem;
    }

    @Override
    public List<Personagem> getPersonagemPorBando(String bando) {
        List<Personagem> listaAchada = this.personagemRepository.findAllByBandoNome();
        return listaAchada;
    }

    @Override
    public void deletarPersonagem(long id) {
        this.personagemRepository.delete(getPersonagemPorId(id));
    }

    @Override
    public Personagem getPersonagemPorId(long idCapitao) {
        return personagemRepository.findById(idCapitao)
                .orElseThrow(() -> new NotFoundApiError("Não foi possível encontrar nenhum personagem com id " + idCapitao));
    }

    @Override
    public List<Personagem> listarCapitaesBando() {
        return this.personagemRepository.findAllPersonagensCapitao();
    }

}

