package pe.edu.isil;

public class Ejemplo01 {

    public static void main(String[] args){
        int unidades = 25;
        Integer caja = unidades;

        int recuperadas = caja;
        System.out.println("Tipo envolvente " + caja.getClass().getSimpleName());
        System.out.println("Valor " + recuperadas);
        System.out.println(" Maximo " + Integer.max(recuperadas,30));
    }
}
