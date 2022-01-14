/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD4_strings;

import java.util.Scanner;
/**para cambiar espacios en blancos por saltos de linea*/
public class Ej10 {
     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String frase = new String();
        
        System.out.println("Escribe una frase: ");
        frase = lector.nextLine();
        
        System.out.println(frase.replaceAll(" ","\n"));
    }  
}
    

