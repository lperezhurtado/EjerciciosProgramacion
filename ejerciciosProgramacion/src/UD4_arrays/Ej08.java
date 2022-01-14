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
public class Ej08 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double numero;
        double[] aleatorios = new double[100];
        int total = 0;
        for (int i = 0; i < 100; i++) {
            aleatorios[i] = Math.random();     
        }
        System.out.print("Introduce un numero entre 0 y 1: ");
        numero = lector.nextDouble();
        
        for (int i = 0; i < 100; i++) {
            if(aleatorios[i] >= numero){
                total++;
            }
        }
        System.out.println("Total numeros igual o mayores a " + numero + "= "
                + total);
        
    }
    
}
