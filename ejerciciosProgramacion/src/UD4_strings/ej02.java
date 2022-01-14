/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD4_strings;

import java.util.Scanner;

/**
 *
 * @author luisp
 */
public class ej02 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String texto1 = new String();
        String texto2 = new String();
        
        System.out.println("Escribe algo:");
        texto1 = lector.nextLine();
        
        System.out.println("Escribe otra vez:");
        texto2 = lector.nextLine();
        
        if(texto1.equalsIgnoreCase(texto2)){
            System.out.println("Son Iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        
    }
    
}
