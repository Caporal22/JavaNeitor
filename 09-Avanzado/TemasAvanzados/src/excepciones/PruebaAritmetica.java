package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado = " + resultado);
        }catch (Exception e) {
            System.out.println("Excepción registrada: " + e);
        }
        finally { // Bloque que siempre se va a ejecutar (se ejecuta siempre aunque no exista algun error)
            System.out.println("Se reviso la división entre 0");
        }
    }
}