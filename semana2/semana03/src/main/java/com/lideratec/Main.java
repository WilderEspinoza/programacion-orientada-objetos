package com.lideratec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000, 10);
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);
        System.out.println("Stock: " + producto.stock);

        producto.aumentarStock(10);
        System.out.println("Nuevo Stock: " + producto.stock);

        /*Producto producto2 = new Producto("DVD", 500, 1000);
        System.out.println("Nombre: " + producto2.nombre);
        System.out.println("Precio: " + producto2.precio);
        System.out.println("Stock: " + producto2.stock);*/
        //crear clase libro con un constructor con argumentos
        //clase libro debe tener 2 atributos los cuales son
        //nombre y editorial

        Libro libro = new Libro("Orienta Byte", "Lideratec Academy");
        System.out.println("Nombre del libro: " + libro.nombre);
        System.out.println("Stock del libro: " + libro.stock);
        libro.actualizarStock(50);
        System.out.println("Nuevo  del libro: " + libro.stock);

        Libro librito = new Libro(libro);
        System.out.println("Nombre del libro: " + librito.nombre);

        double precioFinal = Producto.calcularDescuento(200,10);
        System.out.println("Precio final " + precioFinal);


    }
}