package app;

import model.*;
import utils.GestorArchivo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorArchivo gestor = new GestorArchivo("datos.obj"); // Aqui creamos el archivo de datos.obj cuando iniciamos el main

        List<Object> personas = new ArrayList<>();
        personas.add(new Estudiante("Desarrollo de Software", "Danielini", 22));
        personas.add(new Estudiante("tecnologias de Software", "juan", 44));
        personas.add(new Profesor("Química", "Medel", 40));
        personas.add(new Profesor("Fisica", "jorge", 50));
        personas.add(new Administrativo("Ciencias Administrativas", "Javier", 55));
        personas.add(new Administrativo("Ciencias ", "marco", 66));


        gestor.guardarObjetos(personas); // Mandamos nuestra lista
        List<Object> leidos = gestor.leerObjetos();
        for (Object obj : leidos) {  // forEach para recorrer los elementos
            System.out.println(obj); // imprimimos nuestros elementos leidos
        }

    }
}
