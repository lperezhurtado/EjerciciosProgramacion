/*
 * Proyecto BuclesAlpha - Archivo ej5.java - Compañia DAW 
 * Licencia Creative Commons BY-NY-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3_bucles;


/**
 *
 * @author Luis Perez <lperezhurtado97@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:57:53
 */
import java.util.Scanner;
public class ej5 {

        public static void main(String[] args) {
        
            Scanner lector = new Scanner(System.in);
            
            System.out.println("Escribe dos numeros");
            int a = lector.nextInt();
            int b = lector.nextInt();  
            
            while(a >= b){
                System.out.println(a);
                a -= 2;
        }
            
    
        }

}
