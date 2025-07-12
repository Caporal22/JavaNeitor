/*
Se solicita introducir la información del siguiente libro
- proporcionar el titulo
- proporcionar el autor
mandar a imprimir <titulo> fue escrito por <autor>
*/

import java.util.Scanner;

public class DetalleLibro {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el nombre del titulo del libro: ");
        var nombre = consola.nextLine();
        System.out.println("Ingresa el nombre del autor del libro: ");
        var autor = consola.nextLine();
        System.out.println(nombre + " fue escrito por " + autor);
    }
}
