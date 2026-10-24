package com.lideratec;

public class NumeroAleatorio {

    public static void main(String[] args){
        int min = 5;
        int max = 20;

        int numero = numeroAleatorio(min, max);
        System.out.println("El numero aleatorio entre " + min +" y " +max+ " es: " + numero);
    }

    public static int numeroAleatorio(int min, int max) {
        int aleatorio = (int)(Math.random() * (max-min+1) + min);
        return aleatorio;
    }
}
