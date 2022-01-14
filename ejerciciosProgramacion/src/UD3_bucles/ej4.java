/*
 * Proyecto BuclesAlpha - Archivo ej4.java - Compañia DAW 
 * Licencia Creative Commons BY-NY-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3_bucles;

/**
 *
 * @author Luis Perez <lperezhurtado97@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:33:14
 */
import java.util.Scanner;
public class ej4 {

        public static void main(String[] args) {
        
            Scanner lector = new Scanner(System.in);
            
            System.out.println("Escribe dos numeros de menor a mayor");
            int a = lector.nextInt();
            int b = lector.nextInt();
            
            while(b >= a){
                System.out.println(b);
                b--;}
            
            
    }
        
    
        
    

}
