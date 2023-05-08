package sptech.school.atividade1notasprint3.service;


import sptech.school.atividade1notasprint3.domain.Motorista;

public interface MotoristaService {

    public boolean hasViagemEmAndamento(Motorista motorista);
    public Motorista getMotoristaPorId(long id);

}
