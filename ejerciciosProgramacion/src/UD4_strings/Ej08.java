/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** @author luisp*/
package UD4_strings;

import java.util.Scanner;
/**para saber cuantas veces se repite una palabra en una cadena*/
public class Ej08 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String frase, p;
        int cont = 0;
        int pos = 0;
       
        System.out.println("Escribe una frase:");
        frase = lector.nextLine();
        
        System.out.println("Escribe una palabra:");
        p = lector.nextLine();
        
         do {
            // Busca 'p' a partir de la posicion 'pos'
            pos = frase.indexOf(p, pos);
            
            // Si lo ha encontrado, actualizamos contador y posicion
            if (pos >= 0) {
                cont++;
                pos++;
            }
        } while (pos != -1);

        // Mostramos cuantas veces aparece
        System.out.println(p + " aparece " + cont + " veces");
        
        
        
      
        
        
        
        
    }
    
}
