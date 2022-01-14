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
public class Ej07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int p, q;
         
        System.out.print("Introduce un numero: ");
        p = lector.nextInt();
         
        System.out.println("Introduce un otro: ");
        q = lector.nextInt();
         
        int[] numeros = new int[q];
         
        for (int i = 0; i < q; i++) {
            numeros[i] = p;
            System.out.println(numeros[i]);
            p++;
        }      
    }
    
}
