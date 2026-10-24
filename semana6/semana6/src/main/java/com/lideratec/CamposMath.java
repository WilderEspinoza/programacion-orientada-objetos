package com.lideratec;

public class CamposMath {
    public static void main(String[] args){
        double valor = 8.4;
        double otro = 3.2;

        System.out.println("Math.PI= " + Math.PI);
        System.out.println("Math.E= " + Math.E);
        System.out.println("Diferencia PI - E " + (Math.PI -Math.E ));
        System.out.println("Valor absoluto " + Math.abs(valor));
        System.out.println("Redondeo hacia numero entero abajo: " + Math.floor(valor));
        System.out.println("Redondeo hacia numero entero arriba: " + Math.ceil(valor));
        System.out.println("Redondeo hacia numero entero mas cercano: " + Math.round(valor));
        System.out.println("max: " + Math.max(valor, otro));
        System.out.println("min: " + Math.min(valor, otro));
        //a = 12.4
        //b = 6.8
    }
}
