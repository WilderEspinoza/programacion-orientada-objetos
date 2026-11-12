package pe.edu.isil;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo02 {
    public static void main(String[] args){
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Pedro", 50));
        listaEstudiantes.add(new Estudiante("Fatima", 30));
        listaEstudiantes.add(new Estudiante("Luigui", 25));
        listaEstudiantes.add(new Estudiante("Luigui", 25));

        for(Estudiante estudi : listaEstudiantes){
            System.out.println(estudi);
        }
    }
}
