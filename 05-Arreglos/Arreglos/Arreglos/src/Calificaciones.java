/*  Calificaciones promedio []
*   Promedio de calificaciones que ingresa el usuario.
* */


import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var aux = 0;
        var promedio = 0.0;

        System.out.println("*** Promedio de Calificaciones ***");
        System.out.print("Cuantas calificaciones deseas agregar: ");
        var cantidadCalificaciones = Integer.parseInt(console.nextLine());
        int[] calificaciones = new int[cantidadCalificaciones];
        for(int i = 0; i < cantidadCalificaciones; i++){
            System.out.print("Ingresa la calificacion " + (i + 1) + " -->\s");
            calificaciones[i] = Integer.parseInt(console.nextLine());
            aux += calificaciones[i];
        }
        promedio = aux / cantidadCalificaciones;
        System.out.println("\n*** El promedio de las calificaciones es: " + promedio);
    }
}
