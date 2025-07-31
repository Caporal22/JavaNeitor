import javax.sql.rowset.FilteredRowSet;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
Crear una función para crear un ID Unico con las siguientes caracteristicas
- Nombre --> tomar los 2 primeros caracteres (Convertir a mayúsculas)
- Apellido --> tomar los 2 primeros caracteres (Convertir a mayúsculas)
- Año de nacimiento de 4 digitos (YYYY) --> 2 últimos caracteres
Valor aleatorio de 4 digitos y dar formato "####"
*/

public class GeneradorIdUnico {
    public static void main(String[] args) {
       generacionID();
    }

    // Función de generacion de ID
    public static void generacionID(){
        var console = new Scanner(System.in);
        var aleatorio = new Random().nextInt(0, 9999);
        var decimalFormat = new DecimalFormat("####").format(aleatorio);
        String nombre, apellido, anio;

        System.out.println("*** Generador de ID Único ***");
        System.out.print("Ingresa tu nombre: ");
        nombre = console.nextLine().substring(0, 2).toUpperCase(Locale.ROOT);
        System.out.print("Ingresa tu apellido: ");
        apellido = console.nextLine().substring(0, 2).toUpperCase(Locale.ROOT);
        System.out.print("Ingresa tu año de nacimiento (YYYY): ");
        anio = console.nextLine().substring(2, 4);

        var idUnico = nombre + apellido + anio + decimalFormat;
        System.out.println("El código del usuario es: " + idUnico);
    }
}
