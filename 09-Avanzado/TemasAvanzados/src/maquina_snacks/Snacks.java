package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks { // No se usa Java Beans
    private static final List<Snack> snacks; // No se utiliza constructor para inicializar esta variable

    // Bloque estatico inicializador
    static{
        snacks = new ArrayList<>(); // Ya no podemos asignar una lista distinta pero el contenido si
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for(var snack: snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }


}
