package calculadora.presentacion;

import calculadora.servicio.IServicioCalculadora;
import calculadora.servicio.ServicioCalculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        calculadoraOperacion();
    }

    public static void calculadoraOperacion(){
        var exit = false;
        var console = new Scanner(System.in);
        IServicioCalculadora servicioCalculadora = new ServicioCalculadora();

        System.out.println("*** Calculadora express ***");

    while(!exit){
        try{
            var option = mostrarMenu(console);
            exit = ejecutarOpciones(option, console, servicioCalculadora);
        }catch (Exception e){
            System.out.println("Ocurrio un error: " + e.getMessage());
//            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println(); // Salto de línea
        }
    }
    }


    private static int mostrarMenu(Scanner console){
        System.out.println("""
                Menu: 
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Potencia
                6. Raiz
                7. Modulo
                8. Salir
                Elige una opción:\s""");
        // Leemos y retornamos la opción seleccionada
        return Integer.parseInt(console.nextLine());
    }

    private static boolean ejecutarOpciones(int option, Scanner console, IServicioCalculadora servicioCalculadora){
        var exit = false;
        switch (option){
            case 1 -> {
                var a = pedirNumero(console, "Ingresa el primer valor: ");
                var b = pedirNumero(console, "Ingresa el segundo valor: ");
                System.out.println("Resultado de la suma: " + servicioCalculadora.sumar(a, b));
            }
            case 2 -> {
                var a = pedirNumero(console, "Ingresa el primer valor: ");
                var b = pedirNumero(console, "Ingresa el segundo valor: ");
                System.out.println("Resultado de la resta: " + servicioCalculadora.restar(a, b));
            }
            case 3 -> {
                var a = pedirNumero(console, "Ingresa el primer valor: ");
                var b = pedirNumero(console, "Ingresa el segundo valor: ");
                System.out.println("Resultado de la multiplicación: " + servicioCalculadora.multiplicar(a, b));
            }
            case 4 -> {
                var a = pedirNumero(console, "Ingresa el primer valor: ");
                var b = pedirNumero(console, "Ingresa el segundo valor: ");
                System.out.println("Resultado de la división: " + servicioCalculadora.dividir(a, b));
            }
            case 5 -> {
                var a = pedirNumero(console, "Ingresa el valor base: ");
                var b = pedirNumero(console, "Ingresa el valor del exponente: ");
                System.out.println("Resultado de la potencia: " + servicioCalculadora.potencia(a, b));
            }
            case 6 -> {
                var a = pedirNumero(console, "Ingresa el valor: ");
                System.out.println("Resultado de la raiz: " + servicioCalculadora.raiz(a));
            }
            case 7 ->{
                var a = pedirNumero(console, "Ingresa el primer valor: ");
                var b = pedirNumero(console, "Ingresa el segundo valor: ");
                System.out.println("Resultado del módulo: " + servicioCalculadora.modulo(a, b));
            }
            case 8 ->{
                System.out.println("Finalizando la calculadora....");
                return true;            }
            default -> System.out.println("Opción invalida");
        }
        return false;
    }

    private static double pedirNumero(Scanner console, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(console.nextLine());
    }
}
