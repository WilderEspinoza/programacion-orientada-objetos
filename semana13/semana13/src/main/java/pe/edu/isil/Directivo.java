package pe.edu.isil;

public class Directivo extends Empleado{

    public String departamento;

    public Directivo(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String leerRegistro(){
        return super.leerRegistro() + " | " + departamento;
    }
}
