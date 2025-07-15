import java.util.Scanner;

public class Arreglos3 {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        // Introducir valores a un arreglo
        System.out.print("Proporciona la dimensión del arreglo: ");
        // Declarar un arreglo
        var longitudArreglo = Integer.parseInt(console.nextLine());
        // Creamos de manera dinamica el arreglo
        int[] enteros = new int[longitudArreglo];
        // Solicitamos los valores del arreglo
        for (int i = 0; i < longitudArreglo; i++){
            System.out.print("Proporciona los valores enteros [" + i + "] : ");
            enteros[i] = Integer.parseInt(console.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del arreglo: ");
        for(int i = 0; i < longitudArreglo; i++ ){
            System.out.println("Enteros [" + i + "] = " + enteros[i]);
        }
    }
}
