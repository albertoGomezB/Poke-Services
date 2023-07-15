# Proyecto Microservicios Pokemon 🐸



Este proyecto consta de **dos subproyectos** 🚀:


El primer proyecto se llama **PokeApi**,  se compone de cuatro microservicios : un **pokeServer** 🛫 que se comunica con el api de pokemon pública, un **pokeClient** 🛬 que se comunica con el servidor para obtener desde otro endpoint distinto sus datos, un **pokebd** para obtener los datos desde una **base de datos mysql** 🦈, y por último un microservicio llamado **pokeEurekaServer** 🌐 : para que se conozcan e interactúen entre sí el resto de los microservicios.

El segundo proyecto se llama **PokeGitFiles**📁, consta de dos microservicios : **pokeServer**🛫 el cual se comunica con un **repositorio de git**🦉, en donde se encuentran las stats de los pokemons, y el **pokeClient**🛬 se conecta a ese servidor para obtener los datos del repositorio git.

## Pasos a ejecutar Proyecto PokeApi  🔧

- ` Iniciar microservicios `  **pokeEurekaServer** -> **pokeServer** -> **pokeClient**
- ` Testear endpoints ` **pokeServer** -> **pokeClient**
- ` Iniciar microservicios `  **pokeBd**
- ` Testear endpoints `  **pokeBd**

## Pasos a ejecutar Proyecto PokeGitFiles  🔧

- ` Iniciar microservicios `  **PokeServer** -> **PokeClient**
- ` Testear endpoints `   **PokeClient** `

## Tecnologías Utilizadas ☕

  - `Java 17`
  - `SpringBoot3`
  - `SpringCloud`
  - `Maven`
  - `Mysql`
  - `PostMan`

## Puertos ⚓

- PokeEurekaServer **8761** 
- PokeServer **8500**
- PokeClient **8501**
- PokeBd **8080**

- PokeServerGit **8888**
- PokeClientGit **8080**


## Autores 🧙‍♂️

 ~ **Alberto Gómez Barral**
