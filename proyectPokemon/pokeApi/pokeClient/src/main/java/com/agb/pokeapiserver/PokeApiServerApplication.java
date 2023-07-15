package com.agb.pokeapiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokeApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokeApiServerApplication.class, args);
    }

}
