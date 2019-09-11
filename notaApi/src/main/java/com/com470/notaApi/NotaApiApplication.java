package com.com470.notaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotaApiApplication.class, args);
        //primitivos
        int a = 5;
        int b = 5;
        /// int b = 5;
        System.out.println("Primitivos-->" + (a == b));
        //objetos
        Persona personaA = new Persona("Juan", "Perez");
        Persona personaB = new Persona("Juan", "Perez");
       System.out.println("Objetos-->"+(personaA==personaB));
       System.out.println("Objetos-->"+(personaA.equals(personaB)));
    }

}
