import java.util.Locale;
import java.util.Scanner;

/*  Generador de Emails
    Se solicita crear un programa generador de Emails. El programa debe solicitar:
    Nombre: convertirlo a minisculas
    Apellido: convertirlo a minusculas
    Concatenar todo en un último email
    Ej: daniel.sanchez@caporal.com
* */
public class GeneradorEmails {
    public static void main(String[] args) {
        generador();
    }
    static void generador(){
        var console = new Scanner(System.in);
        String nombre, apellido;
        var dominio = "@caporal.com";
        System.out.print("Ingresa tu nombre: ");
        nombre = console.nextLine().toLowerCase(Locale.ROOT);
        System.out.print("Ingresa tu apellido: ");
        apellido = console.nextLine().toLowerCase(Locale.ROOT);
        var correo = nombre + "." + apellido + dominio;
        System.out.println("Tu nuevo email es: " + correo);
    }
}
