package archivos;

import java.io.File; //input-output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe!!");
            } else {
                //Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                // Se guarda el archivo a disco
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        }catch(IOException e){
            System.out.println("Error al crear archivo: " + e.getMessage());
            e.printStackTrace(); //Traza de cada uno de los errores (muestra todo el detalle)
        }
    }
}
