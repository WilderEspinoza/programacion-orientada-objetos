package pe.edu.isil;

import java.util.HashSet;

public class Ejemplo06 {

    public static void main(String[] args){
        HashSet<Character> letras = new HashSet<>();
        System.out.println("Primera letra A " + letras.add('A'));
        System.out.println("Segunda letra A " + letras.add('A'));
        System.out.println("Agregar B " + letras.add('B'));
        System.out.println("Contiene letras B " + letras.contains('B'));
        System.out.println("elementos unicos son: " + letras.size());


        System.out.println("Agrego C " + letras.add('C'));
        System.out.println("elementos unicos son: " + letras.size());

    }
}
