/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**@author luisp*/
package UD4_strings;

import java.util.Scanner;
/** Para indicar si una cadena contiene otra cadena o si empieza o termina con 
 * esa cadena
 */
public class Ej06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String F = new String();
        String P = new String();
        int contiene;
        System.out.println("Escribe una frase:");
        F = lector.nextLine();
        
        System.out.println("Escribe una palabra:");
        P = lector.nextLine();
        
        F = F.toUpperCase();
        P = P.toUpperCase();
        
        contiene = F.indexOf(P);
        if(contiene >= 0){
            System.out.println(F +" contiene " + P);
        }
        else{
            System.out.println(F + " no contiene " + P);
        }
        if(F.startsWith(P)){
            System.out.println( F +" empieza con " + P);
        }
        if(F.endsWith(P)){
            System.out.println(F + " termina con " + P);
        }
    }
    
    
}
