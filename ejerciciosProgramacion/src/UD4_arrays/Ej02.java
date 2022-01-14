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
public class Ej02 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        double suma = 0;
        double[] numeros = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero: ");
            numeros[i] = lector.nextDouble();
            
            suma += numeros[i];   
        }
        System.out.println("La suma es: " + suma);
    }
    
}
