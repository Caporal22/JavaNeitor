public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {{100,200,300}, {400,500,600}};
        // Recorrer todos los renglones
        for(int ren = 0; ren < matriz.length; ren++){
            // Recorrer las columnas (del renglon que estan como povote)
            for (int col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
