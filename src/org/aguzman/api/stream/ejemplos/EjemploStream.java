package org.aguzman.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("************************ arr ********************************");

        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        Arrays.stream(arr).forEach(System.out::println);

        Stream<String> nombres2 = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        nombres2.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepe");
        Stream<String> nombres3 = lista.stream();
        nombres3.forEach(System.out::println);

        lista.stream().forEach(System.out::println);

        System.out.println(" ");
        System.out.println("*************************** Colores *********************************");
        List<String> colores = List.of("Azul", "Rojo", "Amarillo", "Verde");
        colores.stream().forEach(System.out::println);




    }
}
