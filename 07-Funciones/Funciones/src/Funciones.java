public class Funciones {

    // Definimos la función saludar
    static void saludarDesdeJava(String mensaje){
        System.out.println("Mensaje" + mensaje);
    }
    // Función recursiva
    static void funcionRecursiva(int numero) {
        // Caso Base
        if(numero == 1)
            System.out.println(numero);
        else {
            System.out.print(numero + "\t");
            funcionRecursiva(numero - 1);
        }
    }
    public static void main(String[] args) {
        saludarDesdeJava("Hola");
        funcionRecursiva(5);
    }
}
