import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        // Declarar un arreglo
        int[] enteros;
        // Inicializamos
        enteros = new int[5]; // Cantidad de elementos
        // Declarar e inicializarlo
        int[] numeros = new int[3];
        // Modificar elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;
        // Leer los elementos del arreglo
        System.out.println("Valor 1 = " + enteros[0]);  // Valor 1
        System.out.println("Valor 2 = " + enteros[1]);  // Valor 2
        System.out.println("Valor 3 = " + enteros[2]);  // Valor 3
        System.out.println("Valor 4 = " + enteros[3]);  // Valor 4
        System.out.println("Valor 5 = " + enteros[4]);  // Valor 5
        // Sintaxis simplificada
        int [] enteros2 = {100,200,300,400,500};
        System.out.println("\nValor 1 = " + enteros2[0]); // Valor 1
        System.out.println("Valor 2 = " + enteros2[1]); // Valor 2
        System.out.println("Valor 3 = " + enteros2[2]); // Valor 3
        System.out.println("Valor 4 = " + enteros2[3]); // Valor 4
        System.out.println("Valor 5 = " + enteros2[4]); // Valor 5
        // Imprimir la dirección de memoria del arreglo
        System.out.println(enteros2);
    }
}
