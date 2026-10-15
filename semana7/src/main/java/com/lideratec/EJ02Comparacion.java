package com.lideratec;

public class EJ02Comparacion {

    public static void main(String[] args){
        String nombre = "Ana";
        String entrada = "ana";
        boolean exacto = nombre.equals(entrada);
        boolean flexible = nombre.equalsIgnoreCase(entrada);
        System.out.println("Exacto: " + exacto);
        System.out.println("Flexible: " + flexible);
        boolean contiene = nombre.contains("p");
        int posicion = nombre.indexOf("na");
        System.out.println("Contiene n: " + contiene);
        System.out.println("Posicion de na es: " +  posicion);

        //Curso Java
        //curso java
    }
}
