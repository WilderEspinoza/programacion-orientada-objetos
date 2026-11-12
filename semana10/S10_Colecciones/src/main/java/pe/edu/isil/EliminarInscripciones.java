package pe.edu.isil;
import java.util.ArrayList;
public class EliminarInscripciones {
    public static void main(String[] args){
        ArrayList<String> inscritos = new ArrayList<>();
        inscritos.add("Fatima");
        inscritos.add("Genesis");
        inscritos.add("Roberto");
        inscritos.add("Fatima");
        inscritos.add("Fatima");
        System.out.println("Incritos incial " + inscritos);
        String eliminarPorIndice = inscritos.remove(1);
        System.out.println("Sale indice 1 " + eliminarPorIndice);

        boolean seRetiroUno = inscritos.remove("Fatima");
        System.out.println("Sale la primera fatima " + seRetiroUno);
        System.out.println("Elementos restante en la lista " + inscritos);
        int retiradosAdicionales = 0;
        while(inscritos.remove("Fatima")){
            retiradosAdicionales++;
        }
        System.out.println("Fatima adicional retirado " + retiradosAdicionales);
        System.out.println("Lista final " + inscritos );
    }
}
