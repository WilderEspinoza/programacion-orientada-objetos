package com.lideratec;

public class IfSimple {
    String nombre;
    int nota;
    public static void main(String[] args){
        IfSimple e1 = new IfSimple();
        e1.nombre = "Rosa Aliaga";
        e1.nota = 12;
        if( e1.nota >=13){
            System.out.println(e1.nombre + " esta aprobada en mi curso");
        }else{
            System.out.println(e1.nombre + " esta desaprobada del curso");
        }
        String mensaje = ( e1.nota >=13)? "curso aprobado" : "Curso desaprobado";
        System.out.println("mensaje con ternario es: " + mensaje);
    }
}
