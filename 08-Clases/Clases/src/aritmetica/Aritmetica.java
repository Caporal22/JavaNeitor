package aritmetica;

public class Aritmetica {
    private int operando1, operando2;

    // Constructor
//    public aritmetica.Aritmetica(){
//
//    }

    public Aritmetica(int op1, int op2){
        this.operando1 = op1;
        this.operando2 = op2;
//        System.out.println("Diracción de memoria this: " + this);
    }

    public void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("Resultado suma: " + resultado);
    }

    public void restar(){
        int resultado = operando1 - operando2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    public int getOperando1(){ return this.operando1; }
    public void setOperando1(int operando1) { this.operando1 = operando1; }

    public int getOperando2(){ return this.operando2; }
    public void setOperando2(int operando2){ this.operando2 = operando2; }
}
