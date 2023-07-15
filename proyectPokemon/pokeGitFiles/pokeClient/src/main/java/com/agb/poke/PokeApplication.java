package com.agb.poke;

import com.agb.poke.config.PokeConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PokeConfiguration.class)
public class PokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokeApplication.class, args);
    }

}
