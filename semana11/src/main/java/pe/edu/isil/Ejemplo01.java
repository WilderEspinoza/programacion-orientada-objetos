package pe.edu.isil;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {

    public static void main(String[] args){
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pedro", 50));
        estudiantes.add(new Estudiante("Fatima", 30));
        estudiantes.add(new Estudiante("Luigui", 25));
        estudiantes.add(new Estudiante("Luigui", 25));
        System.out.println("Registrados : " + estudiantes.size());
    }
}
