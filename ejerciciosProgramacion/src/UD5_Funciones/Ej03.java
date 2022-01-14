/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5_Funciones;

import java.util.Scanner;

public class Ej03 {
    
    public static int minimo(int a, int b){
        if(a<b){
            return a;
        }
        else{ 
            return b;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int a, b;
        
        System.out.print("Introduce un numero: ");
        a = lector.nextInt();
        System.out.print("Introduce otro numero: ");
        b = lector.nextInt();
        
        System.out.println("El minimo es " + minimo(a, b));
        
        
    }
    
}
