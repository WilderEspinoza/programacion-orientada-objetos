package pe.edu.isil;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo02 {

    public static void main(String[] args){
        Set<String> codigos = new HashSet<>();
        codigos.add("DNI100");
        codigos.add("DNI200");
        codigos.add("DNI100");

        System.out.println(" Lista set: " + codigos);
        System.out.println("Cantidad " + codigos.size());
    }
}
