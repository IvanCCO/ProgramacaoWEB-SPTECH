package sptech.school.projetoaula3;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/filmes")
public class FilmeController {


    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public ResponseEntity<List<Filme>> listarFilmes(){

        List<Filme> all = this.filmeRepository.findAll();
        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(200).body(all);
    }

    @GetMapping("/{index}")
    public ResponseEntity<Filme> getPorId(
            @PathVariable int index
    ) {
        return ResponseEntity.of(this.filmeRepository.findById(index));
    }

    @GetMapping("/titulo")
    public ResponseEntity<Filme> getPorNomeFilme(
            @RequestParam String nome
    ){
        return ResponseEntity.of(this.filmeRepository.findByNome(nome));
    }

    @GetMapping("/diretor")
    public ResponseEntity<Filme> getPorNomeDiretor(
            @RequestParam String nome
    ){

        List<Filme> filmeAchado = this.filmeRepository.findByDiretorIgnoreCase(nome);

        if(!filmeAchado.isEmpty()){
            return ResponseEntity.status(203).build();
        }

        return ResponseEntity.status(200).build();
    }

    @GetMapping("/periodo")
    public ResponseEntity<List<Filme>> getPorPeriodo(
            @RequestParam LocalDate data
            ){

        List<Filme> filmeAchado = this.filmeRepository.findByDataLancamentoLessThanEqual(data);

        if(!filmeAchado.isEmpty()){
            return ResponseEntity.status(203).build();
        }
            return ResponseEntity.status(200).body(filmeAchado);
    }

    @GetMapping("/indicados/nao-indicados/quantidade")
    public ResponseEntity<Integer> getPorNaoIndicacaoQuantidade(
    ){
        return ResponseEntity.status(200)
                .body(this
                .filmeRepository
                .countByIndicacaoOscarFalse());
    }

    @GetMapping("/indicados")
    public ResponseEntity<List<Filme>> getPorIndicacao(
    ){

        List<Filme> filmes = this.filmeRepository
                .findByIndicacaoOscarTrue();

        if(!filmes.isEmpty()){
        return ResponseEntity.status(200).body(filmes);
        }

        return ResponseEntity.status(204).build();
    }


    @GetMapping("/indicados/custo-producao/{custo}")
    public ResponseEntity<List<Filme>> getPorCustoMaiorOuIgual(
            @PathVariable double custo
    ){

        List<Filme> filmesCusto = this.filmeRepository
                .findByCustoProducaoGreaterThanEqual(custo);

        if(!filmesCusto.isEmpty()){
            return ResponseEntity.status(200).body(filmesCusto);
        }

        return ResponseEntity.status(204).build();
    }

    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(
            @RequestBody @Valid Filme filme
    ){

        try{
            Filme filminho = this.filmeRepository.save(filme);
            return ResponseEntity.status(201).body(filminho);
        }catch (Exception ex){
            return ResponseEntity.status(403).build();
        }

    }

}
