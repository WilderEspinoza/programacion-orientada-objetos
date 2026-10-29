package pe.edu.isil;

import java.util.Set;
import java.util.TreeSet;

public class Ejemplo03 {

    public static void main(String[] args){
        Set<Integer> numerosPrimeros = new TreeSet<>();
        numerosPrimeros.add(17);
        numerosPrimeros.add(5);
        numerosPrimeros.add(13);
        numerosPrimeros.add(7);
        numerosPrimeros.add(13);

        System.out.println("Primos ordenados " + numerosPrimeros);
    }
}
