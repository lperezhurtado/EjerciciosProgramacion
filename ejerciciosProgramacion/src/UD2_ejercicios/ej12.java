package UD2_ejercicios;

public class ej12
{
    public static void main(String[] args){
        double altura = 42.4;
        double diametro = 15.5;
        double radio = diametro/2;
        final double pi = 3.1415926536;
        double area = ((2*pi*radio*altura) + (2*pi*(Math.pow(radio,2))));
        double volumen = (pi*(Math.pow(radio,2))*altura);
        System.out.println("Area cilindro = " + area);
        System.out.print("Volumen cilindro" + volumen);
    }
}