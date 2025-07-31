import java.text.DecimalFormat;

public class Redondeo {
    public static void main(String[] args) {
        // Redondeo
        // Mayor a .5 redondea hacia arriba
        var numero = 8.5;
        var redondeo = Math.round(numero);
        System.out.println("redondeo = " + redondeo);
        // Formato
        var patron = "#.#";
        var decimalFormat = new DecimalFormat(patron);
        var numeroFormato = decimalFormat.format(numero);
        System.out.println("numeroFormato = " + numeroFormato);

    }
}
