package pe.edu.isil;

public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String leerRegistro(){
        return nombre + " | S/. " + sueldo;
    }

}
