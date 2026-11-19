package pe.edu.isil;

public class Ejemplo05 {

    public static void main(String[] args){
        char dato ='8';
        System.out.println("Es letra " + Character.isLetter(dato));
        System.out.println("Es digito " + Character.isDigit(dato));
        System.out.println("Mayuscula " + Character.toUpperCase(dato));
    }
}
