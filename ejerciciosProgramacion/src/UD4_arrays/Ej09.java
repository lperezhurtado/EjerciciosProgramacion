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
public class Ej09 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numero;
        int[] enteros = new int[100];
        int aleatorios;
        
        for (int i = 0; i < 100; i++) {
            aleatorios = (int) (1 + Math.random() * (10 - 1 + 1));
            enteros[i] = aleatorios;
        }
        System.out.print("Introduce un numero: ");
        numero = lector.nextInt();
        
        for (int i = 0; i < 100; i++) {
            if(enteros[i] == numero){
                System.out.println(numero + " aparece en posicion " + i);
            }
            
        }
    }
}
