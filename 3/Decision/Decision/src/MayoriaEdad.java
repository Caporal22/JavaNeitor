import java.util.Scanner;

public class MayoriaEdad {
    public static void main(String[] args) {
        final int MAYOR_EDAD = 18;
        System.out.println("*** Bienvenido al sistema de mayoría de edad ***");
        System.out.print("Ingresa tu edad: ");
        var edad = Math.abs(Integer.parseInt( new Scanner(System.in).nextLine()));
        // If
        if(edad >= MAYOR_EDAD){
            System.out.println("La persona con [" + edad + "] años es mayor de edad");
        } else {
            System.out.println("La persona con [" + edad + "] años es menor de edad");
        }
    }
}
