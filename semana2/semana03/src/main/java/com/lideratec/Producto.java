package com.lideratec;

public class Producto {

    String nombre;
    double precio;
    int stock;

    public Producto(){
    }

    public Producto(String nombre,
                    double precio,
                    int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void aumentarStock(int cantidad){
        stock = stock + cantidad;
    }

    public static double calcularDescuento
            (double monto,
             double porcentaje){
        return monto - (monto * porcentaje/100);
    }

}
