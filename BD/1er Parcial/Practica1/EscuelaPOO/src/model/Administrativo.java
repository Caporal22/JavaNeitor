package model;

public class Administrativo extends Persona{
    private String departamento;

    public Administrativo(String departamento, String nombre, int edad){
        super(nombre, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
