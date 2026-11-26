package pe.edu.isil;

public class JefeArea extends Directivo{
    public double movilidad;

    JefeArea(String nombre, double sueldo, String departamento, double movilidad){
        super(nombre, sueldo, departamento);
        this.movilidad = movilidad;
    }

    @Override
    public String leerRegistro(){
        return super.leerRegistro() + " | " + movilidad;
    }
}
