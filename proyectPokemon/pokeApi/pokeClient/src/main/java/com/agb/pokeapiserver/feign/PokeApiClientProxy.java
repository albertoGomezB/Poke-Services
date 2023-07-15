package com.agb.pokeapiserver.feign;

import com.agb.pokeapiserver.entity.Pokemon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="pokeserver" , url="http://localhost:8500")
public interface PokeApiClientProxy {

    @GetMapping("/pokeserver/byname/{name}")
    Pokemon getPokemonByName(@PathVariable("name") String name);

    @GetMapping("/pokerserver/byid/{id}")
    Pokemon getPokemonById(@PathVariable("id") int id);

}
