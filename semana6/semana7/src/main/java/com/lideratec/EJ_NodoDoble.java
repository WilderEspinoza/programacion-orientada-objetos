package com.lideratec;

public class NodoDoble {

    static class NodoDoble{
        int dato;
        NodoDoble anterior;
        NodoDoble seguiente;

        NodoDoble(int dato){
            this.dato = dato;
            this.anterior = null;
            this.seguiente = null;
        }
    }
}
