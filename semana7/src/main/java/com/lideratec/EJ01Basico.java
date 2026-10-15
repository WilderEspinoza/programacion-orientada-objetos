package com.lideratec;

public class EJ01Basico {

    public static void main(String[] args){
        String texto = "Hola ALumno";
        int longitud = texto.length();
        char primero = texto.charAt(0);
        char segundo = texto.charAt(longitud-1);
        char cinco = texto.charAt(5);

        System.out.println("La lngitud es: " + longitud);
        System.out.println("El primer caracter es: " + primero);
        System.out.println("El ultimo caracter es: " + segundo);
        System.out.println("El cinco caracter es: " + cinco);

    }
}
