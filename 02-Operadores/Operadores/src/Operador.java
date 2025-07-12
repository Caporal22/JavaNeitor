public class Operador {
    public static void main(String[] args) {
        // Operadores Aritmerico
        int a = 3, b = 2, resultado = 0;
        float aux;
        // Suma
        resultado = a + b;
        System.out.println("Suma = " + resultado);
        // Resta
        resultado = a - b;
        System.out.println("Resta = " + resultado);
        // Multiplicación
        resultado = a * b;
        System.out.println("Multiplicación = " + resultado);
        //División
        aux = a / b;
        System.out.println("División = " + aux);
        // Módulo (Residuo de división)
        resultado = a % b;
        System.out.println("Módulo = " + resultado);
    }
}
