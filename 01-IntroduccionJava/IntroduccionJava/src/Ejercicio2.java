import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.print("*** Registro de empleados ***\n");
        System.out.print("Proporciona tu nombre: ");
        var nombre = console.nextLine();
        System.out.print("Proporciona tu edad: ");
        var edad = Integer.parseInt(console.nextLine());
        System.out.print("Proporciona tu sueldo (USD): ");
        var sueldo = Float.parseFloat(console.nextLine());
        System.out.print("Eres un empleado de confianza (true/false): ");
        var empleadoConfianza = Boolean.parseBoolean(console.nextLine());

        System.out.println("--- Resultados ---\n");
        System.out.print("Nombre: " + nombre);
        System.out.print("\nEdad: " + edad);
        System.out.print("\nSueldo: $" + sueldo);
        System.out.print("\nEmpleado de confianza? : " + empleadoConfianza);

    }
}
