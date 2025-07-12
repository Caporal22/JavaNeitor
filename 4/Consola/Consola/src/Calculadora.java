import java.util.Scanner;

/* Aplicación Calculadora
 *   Se debe crear la aplicación de una calculadora
 *   Las funciones principales de una calculadora son
 *   - sumar, restar, multiplicar, dividir
 *
 *
 * */
public class Calculadora {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var opcion = false; // Opcion auxiliar para el ciclo while
        double resultado = 0.0, num1 = 0.0, num2 = 0.0;
        System.out.println("*** Calculadora ***");
        // Ciclo while
        while(!opcion){
            System.out.print("""
                Menu: 
                1. Sumar
                2. Restar
                3. Multiplicar 
                4. Dividir
                5. Salir
                Selecciona una opción:\s""");
            var aux = Integer.parseInt(console.nextLine());
            if (aux >=1 && aux <=4 ){   // Comprobación de datos
                System.out.print("\nIngresa el primer valor: ");
                num1 = Double.parseDouble(console.nextLine());
                System.out.print("Ingresa el segundo valor: ");
                num2 = Double.parseDouble(console.nextLine());
            }
            // Uso de switch case
            switch (aux) {
                case 1 -> { // Sumar
                    resultado = num1 + num2;
                    System.out.println("\n --- El resultado de la suma es: " + resultado + "\n");
                }
                case 2 -> { // Restar
                    resultado = num1 - num2;
                    System.out.println("\n --- El resultado de la resta es: " + resultado + "\n");
                }
                case 3 -> { // Multiplicar
                    resultado = num1 * num2;
                    System.out.println("\n --- El resultado de la multiplicación es: " + resultado + "\n");
                }
                case 4 -> { // Dividir
                    resultado = num1 / num2;
                    System.out.println("\n --- El resultado de la división es: " + resultado + "\n");
                }
                case 5 -> opcion = true; // Salir
                default -> System.out.println("\n--- Ingresa una opción válida (1-5) ---"); // Caso erroneo
                }
        }
    }
}
