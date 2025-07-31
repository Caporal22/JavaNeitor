package animales;

public class Animal {
    public void comer(){
        System.out.println("Como muchas veces al día");
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    //@Override
//    public void dormir(){
//        System.out.println("Duermo muchas horas");
//    }

}// fin Clase Animal

class Perro extends Animal{

    @Override
    public void hacerSonido(){
        System.out.println("Puedo ladrar wuaf");
    }
//    public void dormir(){
//        System.out.println("Duermo 15 horas al día");
//        System.out.println("Método de la clase padre: ");
//        super.dormir();
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Polimorfismo ***");
        //var animal = new Animal();
        Animal animal = new Gato(); //Polimorfismo
        animal.hacerSonido();

    }
}

class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}