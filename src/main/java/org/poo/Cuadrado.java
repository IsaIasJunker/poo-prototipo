package org.poo;

public class Cuadrado extends Forma{

    private int ancho;
    private int alto;

    /**
     * Constructor
     * @param ancho
     * @param alto
     */
    public Cuadrado(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public Forma clone(){
        return new Cuadrado(ancho, alto);
    }

    /**
     * Metodo que muestra los atributos del cuadrado
     */
    public void mostrarAtributos(){
        System.out.println("Ancho: " + this.getAncho());
        System.out.println("Alto: " + this.getAlto());
    }

    /**
     * Metodo que recibe un cuadrado y los compara, mostrando un mensaje por pantalla si son iguales o no
     * @param cuadrado
     */
    public void compararAtributos(Cuadrado cuadrado){
        if (this.alto == cuadrado.alto && this.ancho == cuadrado.ancho){
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
    }
}
