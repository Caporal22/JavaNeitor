import java.util.Scanner;

public class UsuarioPassword {
    public static void main(String[] args) {
        // Revisar si el usuario y password son correctos
        var console = new Scanner(System.in);
        System.out.print("Ingresa el nombre de usuario: ");
        var nombreUsuario = console.nextLine();
        System.out.print("Ingresa tu contrasena: ");
        var password = console.nextLine();
        // Revisamos usuario = admin y password = 123
        var usuario_valid = "admin";
        var password_valid = "123";
        if (nombreUsuario.equals(usuario_valid) && password.equals(password_valid)){
            System.out.println("*** Ingresando al sistema");
        } else if (nombreUsuario.equals(usuario_valid) && !password.equals(password_valid)) {
            System.out.println("Password incorrecto...");
        } else if (!nombreUsuario.equals(usuario_valid) && password.equals(password_valid)) {
            System.out.println("Nombre de usuario incorrecto...");
        } else {
            System.out.println("Acceso denegado...");
        }

    }
}
