package com.lideratec;

public class EJE03Transformacion {

    public static void main(String[] args){
        String original ="  Java Basico  ";

        String limpio = original.trim();
        System.out.println("La cadena limpia es: " + limpio);

        String mayusculas = limpio.toUpperCase();
        System.out.println("La cadena en mayusculas es: " + mayusculas);

        String codigo  = mayusculas.replace(" ", "_");
        System.out.println("Reemplazado: " + codigo);

        String etiqueta = codigo.concat("_21");
        System.out.println("Codigo concatenado: " + etiqueta);
    }
}
