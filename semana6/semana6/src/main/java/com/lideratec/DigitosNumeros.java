package com.lideratec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitosNumeros {

    public static void main(String[] args){
        int numero = 2091;
        System.out.println("Digitos de " + numero + " : " + digitosNumero(numero));
    }

    public static List<Integer> digitosNumero(int num){
        List<Integer> digitos = new ArrayList<>();
        int temporal = num;
        while(temporal > 0){
            digitos.add(temporal % 10);
            temporal /=10;
        }
        Collections.reverse(digitos);
        return digitos;
    }
    //53081
}
