package com.lideratec;

public class ProductoAlcance {

    String nombre = "Computadora";
    int stock = 10;


    public boolean validarStock(int cantidadSolicitada){
        int nuevoStock =  stock -  cantidadSolicitada;
        return nuevoStock >=0;
    }

    public void mostrarProducto(){
        System.out.println("Producto: " + nombre);
        System.out.println("Stock actual: " + stock);
    }

    public static void main(String[] args){

        ProductoAlcance producto = new ProductoAlcance();
        producto.mostrarProducto();
    }
}


