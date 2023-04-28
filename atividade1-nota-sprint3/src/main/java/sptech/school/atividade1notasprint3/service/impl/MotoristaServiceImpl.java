package sptech.school.atividade1notasprint3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.school.atividade1notasprint3.domain.Motorista;
import sptech.school.atividade1notasprint3.repository.MotoristaRepository;
import sptech.school.atividade1notasprint3.service.MotoristaService;
import sptech.school.atividade1notasprint3.service.exception.BadRequest;
import sptech.school.atividade1notasprint3.service.exception.NoContent;
import sptech.school.atividade1notasprint3.service.exception.NotFound;

import java.util.List;

@Service
public class MotoristaServiceImpl implements MotoristaService {

    @Autowired
    private MotoristaRepository motoristaLista;

    @Override
    public boolean hasViagemEmAndamento(Motorista motorista) {
        return false;
    }

    public List<Motorista> listAllMotorista(){
        if(motoristaLista.findAll().isEmpty()){
            throw new NoContent("Lista de usuário está vazia");
        }
        return motoristaLista.findAll();
    }


    @Override
    public Motorista getMotoristaPorId(long id){
        return this.motoristaLista.findById(id).orElseThrow(() -> new NotFound(
                String.format("Motorista com ID não encontrado ID:%d", id)
        ));
    }



}