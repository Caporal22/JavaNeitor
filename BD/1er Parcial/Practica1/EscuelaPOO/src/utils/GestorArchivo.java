package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivo {
    private final String nombreArchivo;

    public GestorArchivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    public void guardarObjetos(List<Object> objetos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(objetos);
            System.out.println("-- Objeto guardado => " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo => " + e.getMessage());
        }
    }

    public List<Object> leerObjetos() {
        List<Object> objetos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            objetos = (List<Object>) ois.readObject();
            System.out.println("-- Objetos recuperados desde => " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer archivo =>  " + e.getMessage());
        }
        return objetos;
    }

}
