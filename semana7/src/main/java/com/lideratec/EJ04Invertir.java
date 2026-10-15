package com.lideratec;

public class EJ04Invertir {

    public static String inviertaCadena(String cadena){
        String invertida = "";
        for(int indice = cadena.length() - 1; indice >=0; indice--){
            invertida += cadena.charAt(indice);
        }
        return invertida;
    }

    public static void main(String[] args){
        System.out.println(inviertaCadena("Querido profesor"));
    }
}
