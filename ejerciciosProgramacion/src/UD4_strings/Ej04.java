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
public class Ej04 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String nombre = new String();
        String apellido1 = new String();
        String apellido2 = new String();
        
        System.out.println("Escribe un nombre:");
        nombre = lector.nextLine();
        
        System.out.println("Escribe apellido:");
        apellido1 = lector.nextLine();
        
        System.out.println("Escribe segundo apellido:");
        apellido2 = lector.nextLine();
        
        System.out.println(nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3));
        
        
    }
    
}
