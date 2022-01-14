/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5_Funciones;

import java.util.Scanner;


public class Ej01 {
    
    public static double multiplica(double a, double b){
        
        return a * b;  
    }
    
    public static void main(String[] args){
        
        Scanner lector = new Scanner(System.in); 
        
        double a, b, result;
        
        System.out.print("Introduce un numeros: ");
        a = lector.nextDouble();
        
        System.out.print("Introduce otro numero: ");
        b = lector.nextDouble();
            
        result = multiplica(a,b);
        
        System.out.println(a +" x "+ b+" = "+ result);
    }   
}
