package UD2_ejercicios;

import java.util.Scanner;
public class ej16
{
    public static void main(String[] args){
        
         Scanner lector = new Scanner (System.in);
         
         int seg;
         System.out.print("Escribe segundos:");
         
         seg = lector.nextInt();
         
         
         int min = seg/60;
         int horas = min/60;
         int dias = horas/24;
         seg = seg%60;
         min = min%60;
         horas = horas%24;
         System.out.println("Son " + dias + " días" + ", " + horas + " horas" + ", " + min + " min " + "y " + seg + "seg");
         
    }
}