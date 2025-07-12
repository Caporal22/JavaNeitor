import java.util.Scanner;

public class ConversionDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el primer dato: ");
        var dato1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el segundo dato: ");
        var dato2 = Integer.parseInt(consola.nextLine());
        var resultados = dato1 + dato2;
        System.out.println("resultados = " + resultados);
        
    }
}
