import java.util.Scanner;
public class SentenciaDecisionIf {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
//        var llueve = true;
//        var nublado = true;
//        if(llueve){
//            System.out.println("Llevar paraguas");
//        }
//        else if(nublado){
//            System.out.println("Llevar impermeable");
//        }
//        else {
//            System.out.println("Dejar paraguas e impermeable en casa");
//        }
        // Revisar si un número es positivo / negativo / cero
        System.out.print("Ingresa un valor: ");
        var valor = Integer.parseInt(console.nextLine());
        if(valor > 0){
            System.out.println("Es positivo: " + valor);
        }
        else if (valor < 0 ){
            System.out.println("Es negativo: " + valor);
        }
        else{
            System.out.println("Es '0' cero : "+ valor);
        }

    }
}
