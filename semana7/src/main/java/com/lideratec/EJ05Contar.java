package com.lideratec;

public class EJ05Contar {
    public static int cuentaOcurrenciasCaracter(String cadena, char caracter){
        int total = 0;
        for(int i=0; i < cadena.length(); i++){
            if(cadena.charAt(i) == caracter){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println(cuentaOcurrenciasCaracter("querido profesor wilder", 'o'));
    }



}
