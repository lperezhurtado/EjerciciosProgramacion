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
public class Ej04 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double sumapos = 0, sumaneg = 0;
        double[] numeros = new double[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce un numero positivo o negativo: ");
            numeros[i] = lector.nextDouble();
        }
        for (int i = 0; i < 20; i++) {
            if(numeros[i] >= 0){
                sumapos += numeros[i];
            }
            else{
                sumaneg += numeros[i];
            }
            
        }
        System.out.println("Suma positivos: " + sumapos + " y negativos: " + sumaneg);
    }
    
}
