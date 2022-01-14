/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD4_arrays;

import java.util.Scanner;

/**
 *
 * @author luisp
 */
public class Ej03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double min, max;
        double[] numeros = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un numero");
            numeros[i] = lector.nextDouble();    
        }
        max = numeros[0];
        min = numeros[0];
        for (int i = 0; i < 10; i++) {
            if(numeros[i] > max){
                max = numeros[i];
            }
            if(numeros[i] < min){
                min = numeros[i];
            }
        }
        System.out.println("El maximo es " + max + " y el minimo es " + min);
    }
    
}
