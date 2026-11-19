package pe.edu.isil;

import java.util.ArrayList;

public class Ejemplo03 {

    public static void main( String[] args){
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(14);
        notas.add(17);
        notas.add(12);
        notas.set(2,16);
        System.out.println("Notas son: " + notas);
        System.out.println(" la segunda nota " + notas.get(1));
        System.out.println("Cantidad " + notas.size());
    }
}
