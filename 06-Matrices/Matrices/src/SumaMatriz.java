import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class SumaMatriz {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        int columnas, filas, resultado = 0;
        System.out.println("*** Bienvenido al sistema de suma de matrices ***");
        System.out.print("Ingresa las filas de la matriz: ");
        filas = Integer.parseInt(console.nextLine());
        System.out.print("Ingresa las columnas de la matriz: ");
        columnas = Integer.parseInt(console.nextLine());
        int[][] matriz = new int[filas][columnas];
        // Obtención de datos
        for(int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("Ingresa el valor [" + i + "][" + j + "] : ");
                matriz[i][j] = Integer.parseInt(console.nextLine());
            }
        }
        // Proceso de suma
        for(int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                if(j == i){
                    resultado += matriz[i][j];
                }
            }
        }
        // Impresión de resultado
        System.out.println("El resultado de la suma es: " + resultado);

    }
}
