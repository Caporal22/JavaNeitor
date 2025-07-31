import java.util.Scanner;

public class ValoresMatriz {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        // Definir la matriz
        System.out.print("Proporciona los renglones de la matriz: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas de la matriz: ");
        columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz = new int[renglones][columnas];
        // Solicitar los valores
        for(int ren = 0; ren < renglones; ren++){
            for (int col = 0; col < columnas; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // Iterar los valores de la matriz
        System.out.println();
        for (int ren = 0; ren < renglones; ren++){
            for (int col = 0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
