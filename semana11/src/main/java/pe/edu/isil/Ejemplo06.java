package pe.edu.isil;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo06 {

    public static void main(String[] args){
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Pedro", 50));
        listaEstudiantes.add(new Estudiante("Pedro", 30));
        listaEstudiantes.add(new Estudiante("Fatima", 30));
        listaEstudiantes.add(new Estudiante("Luigui", 25));
        listaEstudiantes.add(new Estudiante("Luigui", 25));

        boolean seElimino = listaEstudiantes.removeIf(e-> e.getEdad() < 30);
        System.out.println("Se elimino alguno " + seElimino);
        System.out.println("Restantes: " + listaEstudiantes.size());
        for (Estudiante estudiante: listaEstudiantes){
            System.out.println(estudiante);
        }
    }
}
