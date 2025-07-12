public class Not {
    public static void main(String[] args) {
       // Sentencias de decision y operador !
        System.out.println("*** Bienvenidos al Sistema Bancario ***");
        var salirSistema = false;
        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema...");
        } else {
            System.out.println("--- Saliendo del sistema. Saludos! ");
        }
        // Otra lógica aplicada sin el operador not !
        if(salirSistema){
            System.out.println("Saliendo del sistema...");
        } else {
            System.out.println("Continuamos dentro del sistema...");
        }
    }
}
