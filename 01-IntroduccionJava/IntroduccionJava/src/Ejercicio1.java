import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = console.nextLine();
        System.out.print("Ingresa tu edad: ");
        var age = Integer.parseInt(console.nextLine());
        System.out.print("Eres hijo único (true/false): ");
        var child =  Boolean.parseBoolean(console.nextLine());
        System.out.print("Ingresa tu bebida favorita: ");
        var bebidaFavorita = console.nextLine();
        System.out.print("Precio de tu bebida favorita: ");
        var precioBebidaFavorita = Float.parseFloat(console.nextLine());
        System.out.println("\n\n---Nombre: " + nombre +
                "\n---Hijo único: " + child +
                "\n---Bebida favorita: " + bebidaFavorita +
                "\n---Precio bebida favorita: " + precioBebidaFavorita);
    }
}