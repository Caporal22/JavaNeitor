public class MatricesRecorrido {
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
        // Recorrer todos los renglones
        for(int ren = 0; ren < RENGLONES; ren++){
            // Recorrer las columnas (del renglon que estan como povote)
            for (int col = 0; col < COLUMNAS; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
