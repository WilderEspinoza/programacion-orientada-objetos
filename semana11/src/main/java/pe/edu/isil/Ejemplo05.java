package pe.edu.isil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo05 {

    public static void main(String[] args){
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Pedro", 50));
        listaEstudiantes.add(new Estudiante("Pedro", 30));
        listaEstudiantes.add(new Estudiante("Fatima", 30));
        listaEstudiantes.add(new Estudiante("Luigui", 25));
        listaEstudiantes.add(new Estudiante("Luigui", 25));

        Iterator<Estudiante> iterator = listaEstudiantes.iterator();
        while(iterator.hasNext()){
            Estudiante actual = iterator.next();
            if(actual.getNombre().equals("Pedro")){
                iterator.remove();
                break;
            }
        }
        System.out.println("Restantes: " + listaEstudiantes.size());
        for(Estudiante estudiante: listaEstudiantes){
            System.out.println(estudiante);
        }
    }
}
