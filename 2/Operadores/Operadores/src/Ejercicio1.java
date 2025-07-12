import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Definimos las variables limites
        final int MINIMO = 0;
        final int MAXIMO = 10;
        // Solicitamos un valor entre 0 y 10
        var console = new Scanner(System.in);
        System.out.print("Ingresa un valor entre 0 y 10: ");
        var valor = Integer.parseInt(console.nextLine());
        var rango = valor >= MINIMO && valor <= MAXIMO;
        System.out.println("Rango = " + rango);

    }
}
