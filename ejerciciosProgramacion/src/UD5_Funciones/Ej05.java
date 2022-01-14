/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5_Funciones;

import java.util.Scanner;

public class Ej05 { 
    public static double millas_a_km(int a){
        
        return a * 1.60934;   
    }
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int millas;
        
        System.out.print("Dime millas: ");
        millas = lector.nextInt();
        
        System.out.println("Son " +  millas_a_km(millas)+" km");
        
    }
    
}
