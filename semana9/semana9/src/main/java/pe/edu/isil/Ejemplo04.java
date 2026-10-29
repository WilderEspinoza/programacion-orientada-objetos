package pe.edu.isil;
import java.util.HashMap;
import java.util.Map;
public class Ejemplo04 {
    public static void main(String[] args){
        Map<Integer, String> carreras = new HashMap<>();
        carreras.put(1, "Informatica");
        carreras.put(2, "Econommia");
        carreras.put(3, "Diseño de modas");
        carreras.put(4, "Programacion");
        carreras.put(3, "Electronica");
        System.out.println("carrera 2 " + carreras.get(3));
        System.out.println("carrera 4 existe?= " + carreras.containsKey(4));
        System.out.println("Total: " + carreras.size());
    }
}
