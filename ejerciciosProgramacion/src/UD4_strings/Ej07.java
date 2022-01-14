/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**@author luisp*/
package UD4_strings;

import java.util.Scanner;

/**Para cambiar elementos de la cadena por otros */
public class Ej07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String frase;
        String p1;
        String p2;
        
        System.out.println("Escribe una frase:");
        frase = lector.nextLine();
        
        System.out.println("Escribe una palabra:");
        p1 = lector.nextLine();
        
        System.out.println("Escribe otra palabra:");
        p2 = lector.nextLine();
        
        System.out.println(frase.replace(p1, p2));
        
        
    }
    
}
