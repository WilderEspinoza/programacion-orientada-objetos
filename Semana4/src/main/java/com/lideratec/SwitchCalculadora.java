package com.lideratec;

public class SwitchCalculadora {
    public static void main(String[] args){
        double resultado = operarNumero(12,11, '+');
        System.out.println("El resultado es " + resultado);
    }
    public static double operarNumero(int x, int y, char operador){
        double resultado = 0;
        switch (operador){
            case '+':
                resultado = x+ y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                resultado = (double) x/y;
                break;
            default:
                 System.out.println("Operador no reconocido");
        }
        return resultado;
    }
}
