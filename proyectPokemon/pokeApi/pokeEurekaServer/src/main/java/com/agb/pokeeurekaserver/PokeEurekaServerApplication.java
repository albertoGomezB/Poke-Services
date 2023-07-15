package com.agb.pokeeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PokeEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokeEurekaServerApplication.class, args);
    }

}
