/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** @author luisp*/
package UD4_strings;

import java.util.Scanner;

/** para comparar dos cadenas y mmostrarlas por orden de tamaño
 */
public class Ej03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String texto1 = new String();
        String texto2 = new String();
        int comparador;
        
        System.out.println("Escribe algo:");
        texto1 = lector.nextLine();
        
        System.out.println("Escribe otra vez:");
        texto2 = lector.nextLine();
        
        comparador = texto1.compareToIgnoreCase(texto2);
        
        if(comparador<=0){
            System.out.print(texto1);
            System.out.print(" ");
            System.out.print(texto2);
        }
        else{
            System.out.print(texto2);
            System.out.print(" ");
            System.out.print(texto1);
        }
       
    }
    
}
