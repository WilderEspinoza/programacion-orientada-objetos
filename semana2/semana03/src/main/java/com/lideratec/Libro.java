package com.lideratec;

public class Libro {
    String nombre;
    String editorial;
    int stock;

    public Libro(String nombre, String editorial){
        this.nombre = nombre;
        this.editorial = editorial;
    }
    public Libro(Libro libro){
        this.nombre = libro.nombre;
        this.editorial = libro.editorial;
    }

    public void actualizarStock(int cantidad){
        this.stock  = this.stock + cantidad;
    }
}
