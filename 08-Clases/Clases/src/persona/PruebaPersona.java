package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo persona ***");
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());
        var persona = new Persona("Danielni", "Caporal");
//        persona.getNombre();
//        persona.getApellido();
//        persona.mostrarPersona();
//        System.out.println("Persona (objeto): " + persona); // De manera automática se llama el método toString()
        System.out.println(persona);

        System.out.println("Variable estática después de crear un objeto: " + Persona.getContadorPersonas());
        var persona2 = new Persona("Kaze", "Gamaru");
//        System.out.println("persona2 = " + persona2.);
        System.out.println("Variable estática: " + Persona.getContadorPersonas()  );
        System.out.println(persona2);
        System.out.println("Contador de personas: " + Persona.getContadorPersonas());
    }
}
