package pe.edu.isil;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {

    public static void main(String[] args){
        List<String> nombres = new ArrayList<>();
        nombres.add("Juana");
        nombres.add("Luis");
        nombres.add("Juana");
        nombres.add("Omar");
        System.out.println("Lista " + nombres);
        System.out.println("Primero " + nombres.get(0));
        System.out.println("Total elementos " + nombres.size());
        nombres.remove("Omar");
        for(String nombre : nombres){
            System.out.println("Atencion de " + nombre);
        }
    }
}
