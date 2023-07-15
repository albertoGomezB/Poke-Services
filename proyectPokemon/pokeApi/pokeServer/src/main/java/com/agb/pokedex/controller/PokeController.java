package com.agb.pokedex.controller;

import com.agb.pokedex.entity.Pokemon;
import com.agb.pokedex.feign.PokeApiClient;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
@RequestMapping("/pokeserver")
public class PokeController {

    private final PokeApiClient pokemonApiClient;

    @Autowired
    public PokeController(PokeApiClient pokemonApiClient) {
        this.pokemonApiClient = pokemonApiClient;
    }

    @GetMapping("/byname/{name}")
    public Pokemon getPokemonByName(@PathVariable("name") String name) {
        return pokemonApiClient.getPokemonByName(name);
    }

    @GetMapping("/byid/{id}")
    public Pokemon getPokemonById(@PathVariable("id") int id) {
        return pokemonApiClient.getPokemonById(id);
    }

    @GetMapping("/pokedex")
    public void getAllPokemons(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://pokeapi.co/api/v2/pokemon?limit=151");
    }
}
