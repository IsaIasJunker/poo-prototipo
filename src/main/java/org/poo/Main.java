package org.poo;
public class Main {
    public static void main(String[] args) {


        Cuadrado cuadrado1 = new Cuadrado(10 , 20);
        System.out.println("Ancho: " + cuadrado1.getAncho() + " ,alto: " + cuadrado1.getAlto());
        Cuadrado cuadrado2 = (Cuadrado) cuadrado1.clone();
        System.out.println("Ancho: " + cuadrado2.getAncho() + " ,alto: " + cuadrado2.getAlto());
    }
}