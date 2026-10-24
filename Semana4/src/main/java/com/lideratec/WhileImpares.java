package com.lideratec;

public class WhileImpares {

    public static void main(String[] args){
        identicarPares(13,20);
    }

    public static void identicarPares(int a, int b){
        while (a <= b) {
            if( a % 2 ==0){
                //System.out.println(a + " es par");
            }else{
                System.out.println(a + " es impar");
            }
            a++;
        }
        //Imprimir solo los numeros impares
    }
}
