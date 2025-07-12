import java.util.Scanner;

/*
*
* */
public class MenuIterativo {
    public static void main(String[] args) {
        System.out.println("*** Sitema de administracion de cuentas ***");
        var salir = false;
        while(!salir){
            System.out.print("""
                    Menu: 
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir del sistema
                    ** Selecciona una opción:\s""");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...");
                case 2 -> System.out.println("Eliminando tu cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema hasta pronto...!");
                    salir = true;
                }
                default -> System.out.println("Opción invalida: " + opcion);
                }
            }
        }

    }
