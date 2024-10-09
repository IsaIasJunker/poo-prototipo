
package org.poo;
public class Circulo extends Forma {
    private double radio;

    /**
     * Constructor del circulo
     * @param radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public Circulo clonar(){
        return new Circulo(radio);
    }

    /**
     * Metodo que recibe un circulo como parametro y los compara, mostrando por pantalla si son iguales o no
     * @param c2
     */
    public void compararRadios(Circulo c2){
        if (this.radio == c2.radio){
            System.out.println("Los radios son iguales");
        }else{
            System.out.println("Los radios son distintos");
        }
    }
}
