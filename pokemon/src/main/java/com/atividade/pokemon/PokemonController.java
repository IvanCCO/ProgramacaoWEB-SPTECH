package com.atividade.pokemon;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private List<String> listaPokemon = new ArrayList<>();

    @GetMapping
    public String getQtd(){
        return "Total de Pokemons cadastrados: " + listaPokemon.size();

    }

    @GetMapping("/cadastrar/{pokemon}")
    public String cadastrarPokemon(@PathVariable String pokemon){
        listaPokemon.add(pokemon);
        return "Pokemon cadastrado";
    }

    @GetMapping("/recuperar/{i}")
    public String recuperarPokemon(@PathVariable int i){

        int j = i-1;

        if(i <= 0 || listaPokemon.size() <= j){
            return "Pokemon não encontrado";
        }else{
            return "Pokemon: " + listaPokemon.get(j);
        }
    }


    @GetMapping("/excluir/{i}")
    public String excluirPokemon(@PathVariable int i){

        int j = i-1;

        if(i <= 0 || listaPokemon.size() <= j){
            return "Pokemon não encontrado";
        }else{
            return "Pokemon removido :" + listaPokemon.remove(j);
        }

    }

    @GetMapping("/atualizar/{i}/{nome}")
    public String atualizarPokemon(@PathVariable int i, @PathVariable String nome){

        if(i > listaPokemon.size() || i<=0 ){
            return "Pokemon não encontrado";
        }else{

            int j = i -1;

            listaPokemon.set(j, nome);

            return "Novo nome do Pokemon é " + nome;
        }

    }

    @GetMapping("listar")
    public List<String> listarPokemon(){

        return listaPokemon;

    }

}

