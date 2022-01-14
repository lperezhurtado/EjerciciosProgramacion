/*
 * Proyecto BuclesAlpha - Archivo ej16.java - Compañia DAW 
 * Licencia Creative Commons BY-NY-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3_bucles;

/**
 *
 * @author Luis Perez <lperezhurtado97@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 17:29:35
 */
import java.util.Scanner;
public class ej16 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int cont = 1;
        
        while(cont <= 5){
            System.out.println("introduce un numero: ");
            int num = lector.nextInt();
            
            if(num >= 0){
                pos++;
            }
            else if(num < 0){
                neg++;
            }
            cont++;
        }
        
        System.out.println("Hay " + pos + " positivos y " + neg + " negativos");
               
    }
}