package pe.edu.isil;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo04 {

    public static void main(String[] args){
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Pedro", 50));
        listaEstudiantes.add(new Estudiante("Fatima", 30));
        listaEstudiantes.add(new Estudiante("Luigui", 25));
        listaEstudiantes.add(new Estudiante("Luigui", 25));

        String buscado = "Gabriel";
        boolean encontrado = false;

        for(Estudiante estudi : listaEstudiantes){
            if(estudi.getNombre().equals(buscado)){
                System.out.println("Encontrado: " + estudi);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No encontrado " + buscado);
        }
    }
}
