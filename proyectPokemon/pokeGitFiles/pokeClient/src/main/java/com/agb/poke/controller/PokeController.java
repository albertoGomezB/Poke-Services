package com.agb.poke.controller;

import com.agb.poke.config.PokeConfiguration;
import com.agb.poke.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pokemon")
public class PokeController {

    // import the PokeConfiguration dependency
    private final PokeConfiguration pokeconfig;

    @Autowired
    public PokeController(@Qualifier("pokeConfiguration") PokeConfiguration pokeconfig) {
        this.pokeconfig = pokeconfig;
    }

    @GetMapping("/git")
    public Pokemon getPokeStats() {

        // returns a new object with the PokeConfiguration class properties

        return new Pokemon(pokeconfig.getName(),pokeconfig.getAttack(), pokeconfig.getDef(),
                pokeconfig.getPs(), pokeconfig.getSpecial_attack(),
                pokeconfig.getSpecial_def(), pokeconfig.getSpeed());
    }

    @GetMapping("/properties")
    public PokeConfiguration getPokemon() {
        return pokeconfig;
    }


}
