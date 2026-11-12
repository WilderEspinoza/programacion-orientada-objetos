package pe.edu.isil;
import java.util.ArrayList;
import java.util.Collections;
public class GestorIncripciones {
    public static void main(String[] args) {
        final int CUPO = 5;
        ArrayList<String> inscritos = new ArrayList<>();
        System.out.println("Inicio de inscripciones esta vacio " + inscritos.isEmpty());
        inscritos.add("Rosa");
        inscritos.add("Luis");
        inscritos.add("Flor");
        inscritos.add("Rosa");
        System.out.println("Plazas disponibles " + (CUPO - inscritos.size()));
        if (inscritos.size() < CUPO) {
            inscritos.add("Angie");
        }
        System.out.println("Rosa aparece en " + Collections.frequency(inscritos, "Rosa"));
        boolean sePuedeInscribirOtraPersona = inscritos.size() < CUPO;
        System.out.println("Final de inscritos " + inscritos);
        System.out.println("Qedan cupos? " + sePuedeInscribirOtraPersona);
    }
}
