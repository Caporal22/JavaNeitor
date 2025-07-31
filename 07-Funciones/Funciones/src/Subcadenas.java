public class Subcadenas {
    public static void main(String[] args) {
        // Subcadenas
        var cadena = "Hola Mundo";
        // Subcadena Hola y Mundo
        // Substring(indice_inicio, indice_fin + 1)
        var subcadena1 = cadena.substring(0,4);
        System.out.println("subcadena  = " + subcadena1);
        var subcadena2 = cadena.substring(5, 10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
