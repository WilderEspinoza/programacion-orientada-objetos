package pe.edu.isil;

import java.util.ArrayList;

public class Ejemplo04 {

    public static void main(String[] args){
        ArrayList<Integer> ventas = new ArrayList<>();
        ventas.add(10);
        ventas.add(30);
        ventas.add(60);
        ventas.add(25);
        ventas.add(25);
        int total = 0;
        for(Integer venta: ventas){
            total = total + venta;
        }
        double promedio = (double)total/ventas.size();

        System.out.println("Total de ventas es " + total);
        System.out.println(" El promedio de ventas es " +promedio);
    }
}
