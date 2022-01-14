
package UD4_arrays;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numalturas, encima = 0, debajo = 0;
        double suma = 0, media;
        double[] alturas;
        
        
        System.out.println("Total de alturas?: ");
        numalturas = lector.nextInt();
        alturas = new double[numalturas];
        double max = alturas[0];
        double min = alturas[0];
        
        for (int i = 0; i < numalturas; i++) {
            System.out.print("Introduce altura: ");
            alturas[i] = lector.nextDouble();
            suma += alturas[i];
            
            if(alturas[i] > max){
                max = alturas[i];
            }
            min = Math.min(alturas[i], min);
        }
        
        media = suma / numalturas;
        
        for (int i = 0; i < numalturas; i++) {
            if(alturas[i] < media){
                debajo++;
            }
            else{
                encima++;
            }
        }
        System.out.println("total alturas: " + suma);
        System.out.println("altura media: " + media);
        System.out.println("altura maxima: " + max);
        System.out.println("altura minima: " + min);
        System.out.println("por encima de la media: " + encima);
        System.out.println("por debajo de la media: " + debajo);
        
        
    }
}
