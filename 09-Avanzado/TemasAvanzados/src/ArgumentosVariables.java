public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1, 2, 3, 4, 5);
        variosParametros("Juan", 10, 20,30,40,50);
    }

    static void imprimirNumeros(int... numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
}
