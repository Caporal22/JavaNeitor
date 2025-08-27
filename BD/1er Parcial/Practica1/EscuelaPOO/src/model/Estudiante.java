package model;

public class Estudiante extends Persona {
    private String carrea;

    public Estudiante(String carrera, String nombre, int edad){
        super(nombre, edad);
        this.carrea = carrera;
    }

    public String getCarrea() {
        return carrea;
    }

    public void setCarrea(String carrea) {
        this.carrea = carrea;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrea='" + carrea + '\'' +
                '}';
    }
}
