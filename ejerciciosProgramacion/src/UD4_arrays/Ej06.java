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
public class Ej06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int n = 0, m;
        
        System.out.println("Introduce un numero: ");
        n = lector.nextInt();
        int[] numeros;
        numeros = new int[n];
        
        System.out.println("Introduce otro: ");
        m = lector.nextInt();
        
        for (int i = 0; i < n; i++) {
            numeros[i]=m;
            System.out.println(numeros[i]);
        }
       
            
        
    }
    
}
