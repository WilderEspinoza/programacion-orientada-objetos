package pe.edu.isil;

public class Persona {

    protected String nombre;
    protected int edad;

    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad= edad;
    }

    public String ficha(){
        return nombre + " edad: " +  edad;
    }


}
