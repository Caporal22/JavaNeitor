import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "Diego");
        persona.put("Apellido", "Flores");
        persona.put("Edad", "22");
//        persona.put("Edad", "22");
        System.out.println("Valores del mapa: ");
        // Sin orden de inserción
        persona.entrySet().forEach(System.out::println);
        persona.put("Edad", "35"); // Modificar el valor de la llave existente
        persona.remove("Apellido"); // Eliminar la llave y el valor
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar los valores del mapa por separada
        System.out.println("\nIterando los elementos (llave/valor)");
        persona.forEach((k, v) ->
            System.out.println("Llave: " + k + ",\tValor: " + v));

    }
}
