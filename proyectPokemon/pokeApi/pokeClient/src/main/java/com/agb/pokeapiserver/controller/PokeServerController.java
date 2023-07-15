package com.agb.pokeapiserver.controller;

import com.agb.pokeapiserver.entity.Pokemon;
import com.agb.pokeapiserver.feign.PokeApiClientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokeclient")
public class PokeServerController {

    @Autowired
    private PokeApiClientProxy pokeApiClientProxy;

    @GetMapping("/pokeserver/byname/{name}")
    public Pokemon getPokemonByName(@PathVariable("name") String name) {
        return pokeApiClientProxy.getPokemonByName(name);
    }


}
