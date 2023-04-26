package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Factura;
import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        var u1 = new Usuario("John", "Doe");
        var u2 = new Usuario("Pepe", "Pérez");

        u1.addFactura(new Factura("compras tecnologias"));
        u1.addFactura(new Factura("compras mueble"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        usuarios.stream().flatMap(u-> u.getFacturas().stream())
                .forEach(f-> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));


        /*for(Usuario u : usuarios) {
            for (Factura f : u.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        }*/


    }
}
