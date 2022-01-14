/*
 * Proyecto Strings - Archivo Strings.java - Compañia DAW 
 * Licencia Creative Commons BY-NY-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD4_strings;

import java.util.Scanner;

/**
 *
 * @author Luis Perez <lperezhurtado97@gmail.com>
 */
public class ej01 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String cadena = new String();
        
        System.out.println("Escribe algo:");
        cadena = lector.nextLine();
        
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        
        
        
        
    }
    
}
