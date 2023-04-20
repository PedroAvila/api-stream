package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe García", "Paco Gonzalez", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();
        String resultado = nombres.reduce("resultado contatenación ", (a, b) -> a + ", " + b);
        System.out.println(resultado);
    }
}
