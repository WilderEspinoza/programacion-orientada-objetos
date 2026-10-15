package com.lideratec;

public class EJE07Palindromo {
    public static String inviertaCadena(String cadena){
        String invertida = "";
        for(int indice = cadena.length() - 1; indice >=0; indice--){
            invertida += cadena.charAt(indice);
        }
        return invertida;
    }
    public static boolean esPalindromo(String cadena){
        String sinBlanco = "";
        for(int i =0; i <cadena.length(); i++){
            if( cadena.charAt(i) != ' '){
                sinBlanco +=cadena.charAt(i);
            }
        }
        String invertido = inviertaCadena(sinBlanco);
        return sinBlanco.equalsIgnoreCase(invertido);
    }
    public static void main(String[] args){
        System.out.println(esPalindromo("Anita lava la tina"));
        System.out.println(esPalindromo("querido profesor wilder"));
    }
}
