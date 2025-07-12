import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de cadenas en Java
        var console = new Scanner(System.in);
        var cadena = "Daniel";
        var cadena2 = "Daniel";
        System.out.print("Ingresa una cadena de texto: ");
        var cadena3 = console.nextLine();
        if(cadena == cadena3){
            System.out.println("** Las cadenas son iguales (en referencia de memoria)");
        }
        else {
            System.out.println("-- Las cadenas son distintas...");
        }
        // Comparación usando el metodo equals
        if(cadena.equalsIgnoreCase(cadena3)){ // No le da importancia si son mayúsculas o minusculas
            System.out.println("** Las cadenas son iguales (en contenido)");
        }
        else {
            System.out.println("-- Las cadenas son distintas (en contenido)");
        }
    }
}
