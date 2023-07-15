package com.agb.pokedex.dao;

import com.agb.pokedex.entity.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokeRepository extends CrudRepository<Pokemon, Integer> {


}
