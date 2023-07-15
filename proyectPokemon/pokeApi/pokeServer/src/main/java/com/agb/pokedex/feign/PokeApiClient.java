package com.agb.pokedex.feign;

import com.agb.pokedex.entity.Pokemon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// connect feign interface with controller

@FeignClient(name ="pokeServer", url = "https://pokeapi.co/api/v2")
public interface PokeApiClient {

    @GetMapping("/pokemon/{name}")
    Pokemon getPokemonByName(@PathVariable("name") String name);

    @GetMapping("/pokemon/{id}")
    Pokemon getPokemonById(@PathVariable("id") int id);

}


