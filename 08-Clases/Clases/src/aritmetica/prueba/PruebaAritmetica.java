package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo aritmetica ***");
        var aritmetica = new Aritmetica(5,7);
        //aritmetica.operando1 = 5;
        //aritmetica.operando2 = 7;
        aritmetica.sumar();
        aritmetica.restar();
        aritmetica.getOperando1();
        System.out.println("Valor de operando1: " + aritmetica.getOperando1());
        aritmetica.setOperando1(9);
        System.out.println("Nuevo valor de operando1: " + aritmetica.getOperando1());
        aritmetica.sumar();

        var aritmetica2 = new Aritmetica(12, 16);
        //aritmetica2.operando1 = 12;
        //aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();

//        System.out.println("Dirección de memoria de aritmetica2: " + aritmetica2);
    }
}
