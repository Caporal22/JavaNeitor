public class Matrices {
    public static void main(String[] args) {
        //Definir constantes
        final int RENGLONES = 2;
        final int COLUMNAS = 3;
        // Definir la matriz
        int[][] matriz = new int[RENGLONES][COLUMNAS];
        // Llenar la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Accedemos a los valores de la matriz
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);
    }
}
