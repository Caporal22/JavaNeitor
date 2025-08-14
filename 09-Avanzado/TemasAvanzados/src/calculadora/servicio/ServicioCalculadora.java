package calculadora.servicio;

public class ServicioCalculadora implements IServicioCalculadora {


    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if(a == 0) throw new ArithmeticException("División por 0");
        return a / b;
    }

    @Override
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    @Override
    public double raiz(double valor) {
        if(valor < 0) throw new ArithmeticException("Raíz de un número negativo");
        return Math.sqrt(valor);
    }

    @Override
    public double modulo(double a, double b) {
        return a % b;
    }
}
