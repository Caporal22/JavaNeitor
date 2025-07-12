public class Logicos {
    public static void main(String[] args) {
        // Operadores lógicos
        boolean a = true, b= false;
        // and (regresar true si ambos valores son true)
        var resultado = a && b;
        System.out.println("Resultado: a&&b = " + resultado);
        // or (resgresa true si cualquier valor es true)
        resultado = a || b;
        System.out.println("Resultado: a||b = " + resultado);
        //  (!) not (Invierte el valor lógico)
        resultado = !a;
        System.out.println("Resultado: !a = " + resultado);
        resultado = !b;
        System.out.println("Resultado: !b = " + resultado);
    }
}
