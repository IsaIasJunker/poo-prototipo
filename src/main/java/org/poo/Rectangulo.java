
package org.poo;
public class Rectangulo extends Forma{

    private int ancho;
    private int alto;

    public Rectangulo(int ancho , int alto){
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
    public Rectangulo clonar() {
        return new Rectangulo(ancho, alto);
    }
}
