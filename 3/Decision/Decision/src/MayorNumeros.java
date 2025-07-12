import java.util.Scanner;

/*
*   Se solicita hacer un programa que solicite dos números e identifique el
*   mayor de ellos
*
*   Eje num1 = 5
*       num2 = 20
*   out --- "El número mayor es: 20"
* */
public class MayorNumeros {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.print("Ingresa el numero 1: ");
        var num1 = Integer.parseInt(console.nextLine());
        System.out.print("Ingresa el numero 2: ");
        var num2 = Integer.parseInt(console.nextLine());

        if (num1 > num2){
            System.out.println("El numero con mayor ponderacion es Numero1: "+ num1);
        } else {
            System.out.println("El numero con mayor ponderacion es Numero2: "+ num2);
        }

        //Operador ternario
        System.out.print(num1 > num2 ? num1 : num2 );
    }
}
