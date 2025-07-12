public class Unarios {
    public static void main(String[] args) {
        // Operadores unarios
        int a = 3, b = -2, resultado = 0;
//        var c = true;
        // Operador unario a negativo
        resultado = -a;
        System.out.println("-a = " + resultado);
        resultado = -b;
        System.out.println("-b = " + resultado);
        //Operador unario ++ (incremento en uno)
        a = 3;
        resultado = ++a; // pre-incremento
        System.out.println("Pre-incremento +aa = " + resultado);
        a = 3;
        resultado = a++; //post-incremeneto
        System.out.println("Post-incremento a++ = " + resultado);
        System.out.println("a = " + a);
        // Operador unario -- (decrementa en uno)
        b= -2;
        resultado = --b; // Pre-decremento
        System.out.println("Pre-decremento de -bb= " + resultado);
        b = -2;
        resultado = b--; // Post-decremento
        System.out.println("Post-decremento b-- = " + resultado);
        System.out.println("b = " + b);
        // Negación ! (invierte el valor lógico)
        var c = true;
        var resultado2 = !c;
        System.out.println("Negación !c = " + resultado2);

    }
}
