package UD2_ejercicios;

public class ej7
{
    public static void main(String[] args){
        double dinero = 2000;
        double interes = 0.0275;
        double intsemestre = dinero*(interes/2);
        double ret = 0.18;
        double ingtotal = dinero + intsemestre;
        System.out.print("Ingresos a los 6 meses: "+ (ingtotal - (intsemestre*ret)));
        
    }
}