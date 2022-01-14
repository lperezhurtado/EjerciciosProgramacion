/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** @author luisp*/
package UD4_strings;

import java.util.Scanner;
/** para realizar busqueda de un caracter concreto en una frase
 * y contar las veces que sale
 */
public class Ej05 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a = 0, e = 0, I = 0, o = 0, u = 0;
        String texto = new String();
        
        System.out.println("Escribe una frase:");
        texto = lector.nextLine();  
        
        /**se convierte a mayusculas para no hacer distincion entre mayus y minus
         */
        texto = texto.toUpperCase();
        
        for (int i = 0; i < texto.length(); i++) {
            char vocal = texto.charAt(i);
            
            switch(vocal){
                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    I++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;
            }
        }
        
        System.out.println("Total de A: " + a);
        System.out.println("Total de E: " + e);
        System.out.println("Total de I: " + I);
        System.out.println("Total de O: " + o);
        System.out.println("Total de U: " + u);         
        
    }
}
