/*  Crear un programa para convertir una calificación númerica (entre 0 y 10)
    a una letra (De la F a la A)
    CONDICIONES
    Si el valor es mayor a igual a 9 y menor o igual a 10 es una A
    Si el valor proporcionado es mayor o igual a 8 y menor a 9 es una B
    Si el valor es mayor o igual a 7 y menor a 8 es una C
    Si el valor es mayor o igual a 6 y menor a 7 es una D
    Si el valor es mayor o igual a 0 y menor a 6 es una F
    En otro caso, imprimir: --Valor desconocido--
* */

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al sistema de calificaciones ***");
        System.out.print("Ingresa tu calificación: ");
        var calificacion = Integer.parseInt(new Scanner(System.in).nextLine());
        if (calificacion >= 9 && calificacion <=10 ){
            System.out.println("Calificación obtenida: A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Calificación obtenida: B");
        } else if (calificacion >= 7 && calificacion < 8){
            System.out.println("Calificación obtenida: C ");
        } else if (calificacion >= 6 && calificacion < 7){
            System.out.println("Calificación obtenida: D ");
        } else if (calificacion >= 0 && calificacion < 6){
            System.out.println("Calificación obtenida: F ");
        } else {
            System.out.println("--- Valor desconocido --- ");
        }
    }
}
