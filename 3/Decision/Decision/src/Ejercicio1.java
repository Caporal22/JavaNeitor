/*  Identificar la estación del año
*   Se solicita proporcionar el valor de un mes (valor numerico entre 1 y 12)
*   e indicar la estación del año según lo siguiente
*   - Meses 1,2, o 12 --> Invierno
*   - Meses 3,4, o 5 --> Primavera
*   - Meses 6,7 u 8 --> Verano
*   - Meses 9, 10, u 11 --> Otoño
*   Cualquier otro valor debe mandar estación desconocida
* */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("*** Bienvenido a las estaciones del año ***");
        System.out.print("Ingresa el valor numerico del mes en que te encuentras actualmente: ");
        var mes = Math.abs(Integer.parseInt(console.nextLine()));
        var estacion = "Estación desconocida";
        // Switch
        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Estación desconocida...";
                break;
        }
        System.out.println("Estacion = " + estacion);
        // IF
//        if (mes < 3 || mes == 12){
//            System.out.println("--- La estación es: Invierno");
//        } else if(mes > 8 && mes < 12){
//            System.out.println("--- La estación es: Otoño");
//        } else if (mes > 5 && mes < 9) {
//            System.out.println("--- La estación es: Verano");
//        } else if (mes >2 && mes < 6) {
//            System.out.println("--- La estación es: Primavera");
//        } else {
//            System.out.println("Ingresa valores del 1 al 12 plebe...");
//        }
    }
}
