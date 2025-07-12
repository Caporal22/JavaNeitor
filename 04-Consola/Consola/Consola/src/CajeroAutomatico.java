/* Aplicación Cajero Automático
*   Se debe crear la aplicación de cajero automático
*   Las funciones principales de un cajero automatico son
*   - depositar, retirar, y consultar el saldo
*   El saldo puede tener un valor inicial por ej. $1000.00
*   Si hacer un retiro se resta de tu saldo y si haces un deposito se suma a tu saldo
* */

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var opcion = false; // Opcion auxiliar para el ciclo while
        var saldo = 2000; // Saldo inicial
        System.out.println("*** Cajero Automatico ***");
        // Ciclo while
        while(!opcion){
            System.out.print("""
                Menu: 
                1. Consultar Saldo
                2. Retirar
                3. Depositar 
                4. Salir
                --- Selecciona una opción:\s""");
            var aux = Integer.parseInt(console.nextLine());

            switch (aux){
                case 1 -> System.out.println("\nTu saldo actual es: " + saldo + "\n");
                case 2 -> {
                    System.out.print("\nIngresa la cantidad a retirar: ");
                    var retiroSaldo = Integer.parseInt(console.nextLine());
                    if (saldo <= retiroSaldo){
                        System.out.println("Fondos insuficientes...");
                    } else{
                        saldo -= retiroSaldo;
                    }
                }
                case 3 -> {
                    System.out.print("\nIngresa la cantidad a depositar: ");
                    var depositoSaldo = Integer.parseInt(console.nextLine());
                    saldo += depositoSaldo;
                }
                case 4 -> opcion = true;
                default -> System.out.println("\nIngrese una opción valida plebe... (1-4)");
            }
        }

    }
}
