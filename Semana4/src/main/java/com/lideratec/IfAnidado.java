package com.lideratec;

public class IfAnidado {
    public static void main(String[] args){
        identificarMayor(21,21);
    }
    public static void identificarMayor(int x, int y){
        String mensaje;
        if( x > y){
            mensaje = x + " es el mayor";
        }else{
            if( y > x){
                mensaje = y + " es el mayor";
            }else{
                mensaje = "Los valores son iguales";
            }
        }
        System.out.println("x: " + x + " y: " + y);
        System.out.println(mensaje);
    }
}
