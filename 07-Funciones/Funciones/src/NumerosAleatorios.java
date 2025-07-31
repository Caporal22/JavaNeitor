import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Función de números aleatorios
        var aleatorio = new Random();
        // Generar los valores entre el 0 y el 100 (no se incluye el valor limite)
        int valorAleatorio = aleatorio.nextInt(0, 100 + 1);
        System.out.println("valorAleatorio = " + valorAleatorio);
        // Valor aleatorio entre el 100 y 200
        int valorAleatorio2 = aleatorio.nextInt(100, 200 + 1);
        System.out.println("valorAleatorio2 = " + valorAleatorio2);
    }
}
