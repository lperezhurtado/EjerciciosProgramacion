/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5_Funciones;

import java.util.Scanner;

public class Ej06 {
    public static double precioConIVA(double a){
        return a += (a*0.21); 
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double p1, p2, p3, p4, p5;
        
        System.out.print("Dime precio 1: ");
        p1 = lector.nextDouble();
        System.out.print("Dime precio 2: ");
        p2 = lector.nextDouble();
        System.out.print("Dime precio 3: ");
        p3 = lector.nextDouble();
        System.out.print("Dime precio 4: ");
        p4 = lector.nextDouble();
        System.out.print("Dime precio 5: ");
        p5 = lector.nextDouble();
        
        System.out.println("P1 con IVA: "+precioConIVA(p1));
        System.out.println("P2 con IVA: "+precioConIVA(p2));
        System.out.println("P3 con IVA: "+precioConIVA(p3));
        System.out.println("P4 con IVA: "+precioConIVA(p4));
        System.out.println("P5 con IVA: "+precioConIVA(p5));
    }
    
}
