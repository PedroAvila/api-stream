package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        var lista = new ArrayList<Usuario>();
        lista.add(new Usuario("Andrés", "Guzmán"));
        lista.add(new Usuario("Luci", "Martinez"));
        lista.add(new Usuario("Pepe", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("bruce", "Willis"));

        // convertir una lista a un stream
        Stream<String> nombres = lista.stream().map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("bruce".toUpperCase())){
                    return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println("Nombres: " + nombres.count());
    }
}
