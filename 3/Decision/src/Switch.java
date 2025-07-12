import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al sistema de calendario ***");
        System.out.print("Ingresa el día de la semana: ");
        var diaSemana = Math.abs(Integer.parseInt(new Scanner(System.in).nextLine()));
        // Switch mejorada
        switch (diaSemana){
            case  1 -> System.out.println("Lunes");
            case  2 -> System.out.println("Martes");
            case  3 -> System.out.println("Miércoles");
            case  4 -> System.out.println("Jueves");
            case  5 -> System.out.println("Viernes");
            case  6 -> System.out.println("Sábado");
            case  7 -> System.out.println("Domingo");
            default -> System.out.println("Ingresa un dia valido");
        }
    }
}
