public interface Traductor {
    // public y abstract
    void traducir();

    // Metodos con implementación por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor {

    @Override
    public void traducir(){
        System.out.println("Traduzco a inglés");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a Francés");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Francés");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();
        // Traductor en Frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}