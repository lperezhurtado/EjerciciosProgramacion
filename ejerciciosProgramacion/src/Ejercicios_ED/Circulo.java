/*
 * Ejercicio de Documentación
 * Circulos - Versión sin documentar
 */
package Ejercicios_ED;
/**
 * Clase circulo, que crea uno 
 * dados los parametros "x", "y" y "r".
 * @author Luis Perez <lperezhurtado97@gmail.com>
 * @version 14-03-2022
 */
public class Circulo {

    /**
     * Variable x que marca la coordenada x del circulo
     */
    private double centroX;
    /**
     * Variable y que marca la segunda coordenada del circulo
     */
    private double centroY;
    /**
     * Variable radio que indica el tamaño del circulo
     */
    private double radio;

    /**
     * Constructor de la clase circulo
     * @param x: coordenada x del circulo
     * @param y: coordenada y del circulo
     * @param r: indica radio del circulo
     */
    public Circulo(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }

    /**
     * Getter de variable x
     * @return: valor de variable x
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     * Metodo que calcula el perimetro del circulo
     * @return: perimetro, segun valor de variable "radio"
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Metodo para desplazar el circulo, modificando el valor de "x" e "y"
     * @param despX: cantidad que se desplazará "x"
     * @param despY: cantidad que se desplazará "y"
     */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}

