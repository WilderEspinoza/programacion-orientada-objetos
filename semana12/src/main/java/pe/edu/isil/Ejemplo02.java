package pe.edu.isil;

public class Ejemplo02 {

    public static void main(String[] args){
        String dato = "20";
        int cantidad = Integer.parseInt(dato);

        System.out.println("la cantidad es " + cantidad);

        int comparacion = Integer.compare(cantidad, 15);

        System.out.println("la comparacion con 20 es: " + comparacion);

    }
}
