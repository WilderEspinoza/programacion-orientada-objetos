package pe.edu.isil;
import java.util.ArrayList;
import java.util.Collections;
public class Asistentes {
    public static void main(String[] args){
        ArrayList<String> asistentes = new ArrayList<>();
        for(String nombres : new String[]{"Angie", "Luis", "Alexander", "Roberto", "Luigui"}){
            asistentes.add(nombres);
        }
        System.out.println("Lista de asistentes: " + asistentes);
        System.out.println("La lista contiene a angie: " +asistentes.contains("Angie") );
        System.out.println("Dentro de la lista la primera posicion es " + asistentes.indexOf("Angie"));
        System.out.println("Dentro de la lista la ultima posicion es " + asistentes.lastIndexOf("Angie"));
        System.out.println("Todas las pociiones es: ");
        for(int i= 0; i < asistentes.size(); i++){
            if(asistentes.get(i).equals("Angie")) System.out.println(" " + i);
        }
        ArrayList<String> ordenados = new ArrayList<>(asistentes);
        Collections.sort(ordenados);
        System.out.println("Lista ordenada " + ordenados);
        System.out.println("Indica de Roberto " + Collections.binarySearch(ordenados, "Roberto"));
    }
}
