public class TamañoArreglo {

    public static void main(String[] args) {
        // Obtener el largo de una cadena
        var cadena = "Hola Mundo";
        System.out.println("Largo de cadena : " + cadena.length());

        // Recorrer cadena
        for (int i = 0; i < cadena.length(); i++){
            System.out.println(i + " " + cadena.charAt(i));
        }
    }
}
