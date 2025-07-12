import java.util.Scanner;

public class Or {
    public static void main(String[] args) {
        // Sentencia if y operaod logico or
        // Sergio quiere asistir al juego de su hijo
        // Pero solo puede asistir si tiene vacaciones o es un día de descanso
        var diaDescanso = false;
        var vacaciones = false;
        var console = new Scanner(System.in);
        if(diaDescanso || vacaciones){
            System.out.println("Sergio puede asistir al juego de su hijo");
        }
        else {
            System.out.println("Sergio esta ocupado... no puede asistir al juego... ");
        }
    }
}
