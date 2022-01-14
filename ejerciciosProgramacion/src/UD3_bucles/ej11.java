/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD3_bucles;

/**
 *
 * @author luisp
 */
import java.util.Scanner;
public class ej11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double precio = 1;
        double total = 0;
        while(precio >= 0){
            System.out.println("Escribe un precio:");
            precio = lector.nextDouble();
            
            total = total + precio;
            
        }
            System.out.println("total: " + total + " €");
        
        
    }

}
