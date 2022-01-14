/*
 * Proyecto Arrays - Archivo Ej11.java - Compañia DAW 
 * Licencia Creative Commons BY-NY-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD4_arrays;


public class Ej11 {
    public static void main(String[] args) {
        
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int cont = 1;
        
        for (int i = 0; i < 10; i++) {
            v1[i] += cont;
            cont++;
            
            System.out.print(v1[i] + " "); 
        }
        System.out.println("\n");
        
        for (int i = 0; i < 10; i++) {
          v2[i] = v1[9-i]; 
            System.out.print(v2[i] + " ");   
        }
            
              
        }
        
            
    }
        



