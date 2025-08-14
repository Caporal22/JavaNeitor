package calculadora.servicio;

public interface IServicioCalculadora {
    double sumar(double a, double b);
    double restar(double a, double b);
    double multiplicar(double a, double b);
    double dividir(double a, double b);
    double potencia(double base, double exponente);
    double raiz(double valor);
    double modulo(double a, double b);
}
