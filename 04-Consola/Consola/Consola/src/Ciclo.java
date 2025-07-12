public class Ciclo {
    public static void main(String[] args) {
        // Ciclo while
        var contador = 1;
        final int VALOR_MAXIMO = 5;
        while (contador < VALOR_MAXIMO){
            System.out.println("Valor = " + contador);
            contador++;
        }
        contador = 1;
        System.out.println("");
        // Ciclo do while
        do {
            System.out.println("-- Valor do while = " + contador);
            contador++;
        } while (contador <= VALOR_MAXIMO);
        System.out.println("");
        // Ciclo for
        for (var i = 1; i <= VALOR_MAXIMO; i++ ){
            System.out.println("El valor de i: " + i);
        }
    }
}
