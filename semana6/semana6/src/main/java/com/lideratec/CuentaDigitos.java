package com.lideratec;

public class CuentaDigitos {

    public static void main(String[] args){
        int numero = 0;
        System.out.println("El numero " + numero + " tiene " + cuentaDigitos(numero) + " digitos");
    }

    public static int cuentaDigitos(int num){

        if(num ==0) return 1;
        int canDigitos = (int) Math.log10((Math.abs(num))) + 1;
        return canDigitos;
    }
}
