package org.poo;
public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(10);

        Circulo circulo2 = circulo1.clonar();

        System.out.println("circulo1, radio: "+circulo1.getRadio());
        System.out.println("circulo2, radio: "+circulo2.getRadio());

        circulo2.setRadio(50);
        System.out.println("Le cambio el radio al circulo 2");

        System.out.println("circulo2, radio: "+circulo2.getRadio());
        System.out.println("circulo1, radio: "+circulo1.getRadio());
    }
}