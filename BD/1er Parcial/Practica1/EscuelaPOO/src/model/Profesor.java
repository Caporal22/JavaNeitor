package model;

public class Profesor extends Persona{
    private String materia;

    public Profesor(String materia, String nombre, int edad){
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                '}';
    }
}
