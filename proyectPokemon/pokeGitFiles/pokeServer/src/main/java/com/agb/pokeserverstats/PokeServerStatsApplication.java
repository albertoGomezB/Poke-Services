package com.agb.pokeserverstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PokeServerStatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokeServerStatsApplication.class, args);
    }

}
