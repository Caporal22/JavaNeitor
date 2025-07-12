import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        // Introducir valores por la consola
        var consola = new Scanner(System.in); // input -- entrada de datos
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
