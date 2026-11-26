package pe.edu.isil;

public class Cliente extends Persona{
    private double credito;

    Cliente(String nombre, int edad, double credito){
        super(nombre, edad);
        this.credito = credito;
    }

    @Override
    public String ficha(){
        return super.ficha() + " credito: " + credito;
    }
}
