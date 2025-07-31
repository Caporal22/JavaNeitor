package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;


    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido
//                + ", Dirección de memoria: " + super.toString()
                + ",\tId: " + this.idPersona;
    }
    public String getNombre(){ return this.nombre; }
    public void setNombre(String nombre){ this.nombre = nombre; }

    public String getApellido(){ return this.apellido; }
    public void setApellido(String apellido){ this.apellido = apellido; }

    void mostrarPersona(){
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido() + "\tID: " + this.idPersona);
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }


}
