/*
 * Proyecto BuclesAlpha - Archivo ej10.java - Compañia DAW 
 * Licencia Creative Commons BY-NY-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3_bucles;

/**
 *
 * @author Luis Perez <lperezhurtado97@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:40:34
 */
import java.util.Scanner;
public class ej10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double contador = 1;
        double total = 0;
        while(contador <= 5){
            System.out.println("Escribe un precio:");
            double precio = lector.nextDouble();
            
            total = total + precio;
            contador++;
        }
            System.out.println("total: " + total + " €");
        
        
    }

}
