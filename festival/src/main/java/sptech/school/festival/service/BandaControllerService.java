package sptech.school.festival.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.school.festival.model.Banda;
import sptech.school.festival.repository.BandaRepository;
import sptech.school.festival.service.exception.ApiNotFoundError;

@Service
public class BandaControllerService {

    @Autowired
    private BandaRepository banda;

    public Banda getBandaById(Integer id){
        return this.banda.findById(id)
                .orElseThrow(() -> new ApiNotFoundError("It was not possible found driver by ID: " + id));
    }

}
