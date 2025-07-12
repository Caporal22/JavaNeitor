/*  Ejercicio Acumulador Suma
    Realiza la suma de los primeros 5 números utilizando un ciclo for
* */

public class AcumuladorSuma {
    public static void main(String[] args) {
        final int VALOR_MAXIMO = 5;
        var contador = 0;
        for(var i = 1; i <= VALOR_MAXIMO; i++){
            contador += i;
            System.out.println("-- Vuelta: " + i + " y su valor -> " + contador);
        }
        System.out.println("Suma de todos los números: " + contador);
    }
}
