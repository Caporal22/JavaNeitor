/* Cáculo Área de un Rectángulo
*  Realizar un programa para realizar el cálculo del área de un rectángulo
*   Fórmula ----    area = base * altura
* */

import java.util.Scanner;

public class AreaDeRectangulo {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("*** Bienvenido al sistema de cálculo de área ***");
        System.out.print("Ingresa la base del rectángulo: ");
        var base = Float.parseFloat(console.nextLine());
        System.out.print("Ingresa la altura del rectángulo: ");
        var altura = Float.parseFloat(console.nextLine());
        var area = base * altura;
        System.out.print("\n--- El área del rectangulo es: " + area);
    }
}
