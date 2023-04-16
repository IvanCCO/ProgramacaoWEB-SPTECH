package sptech.school.festival.service;


import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import sptech.school.festival.model.Banda;
import sptech.school.festival.model.Festival;
import sptech.school.festival.model.Ticket;
import sptech.school.festival.model.Usuario;
import sptech.school.festival.repository.BandaRepository;
import sptech.school.festival.repository.FestivalRepository;
import sptech.school.festival.service.exception.ApiBadRequestError;
import sptech.school.festival.service.exception.ApiNoContentError;
import sptech.school.festival.service.exception.ApiNotFoundError;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FestivalControllerService {

    @Autowired
    private FestivalRepository festivalRepository;
    @Autowired
    private BandaRepository bandaRepository;

    public Festival getFestivalPorId(
            int id
    ){
        return this.festivalRepository
                .findById(id).orElseThrow(() -> new ApiNotFoundError("Was not possible find Festival for Id: " + id));
    }

    public List<Festival> listarTodos(){

        List<Festival> festivals = festivalRepository.findAll();

        if(festivals.isEmpty()){
           throw new ApiNoContentError("Não existe nenhum festival cadastrado");
        }
        return festivals;
    }

    public void deletarFestivalPorId(int id){
        festivalRepository.delete(getFestivalPorId(id));
    }


    //  TODO Como fazer esse result aqui
    public Festival cadastrarFestival(
            Festival festival
    ){
        return this.festivalRepository.save(festival);
    }

    public Festival atualizarLineUp(
            String nomeBanda,
            int idFestival
    ){
        Festival festivalAchado = getFestivalPorId(idFestival);
        Banda bandaAchada = this.bandaRepository.findByNome(nomeBanda)
                        .orElseThrow(() -> new ApiNotFoundError("Was not possible find Band with name : " + nomeBanda));
        festivalAchado.getLineUp().add(bandaAchada);
        return festivalAchado;
    }

    public List<Festival> getFestivaisMaisProximos(){
        return this.festivalRepository.findAllOrderByDataDesc();
    }

}
