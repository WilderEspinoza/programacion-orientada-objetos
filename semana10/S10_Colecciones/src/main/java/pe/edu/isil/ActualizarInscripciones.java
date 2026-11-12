package pe.edu.isil;

import java.util.ArrayList;

public class ActualizarInscripciones {

    public static void main(String[] args){
        ArrayList<String> colas = new ArrayList<>();
        colas.add("Ana");
        colas.add("Angie");
        colas.add("Luigui");
        System.out.println("Cola original " + colas);
        int consulta = 1;
        if( consulta >= 0 && consulta < colas.size()){
            System.out.println("Posicion1 :" + colas.get(consulta));
        }
        String anterior = colas.set(1, "Angel");
        System.out.println("Reemplazado " + anterior);
        System.out.println("Tras se " + colas + " | total " + colas.size());

        colas.add(1, "Ammy");
        System.out.println("tras insertas " + colas + " | total " + colas.size());
        for(int i = 0; i < colas.size(); i++){
            System.out.println(" Indice " + i + " -> " + colas.get(i));
        }
    }
}
