/*
 * Proyecto BuclesAlpha - Archivo ej15.java - Compañia DAW 
 * Licencia Creative Commons BY-NY-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package UD3_bucles;

/**
 *
 * @author Luis Perez <lperezhurtado97@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:45:17
 */
import java.util.Scanner;
public class ej15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cont = 1;
        boolean neg = false;
        boolean mayor = false;
        
        while(cont <= 5){
            System.out.println("Escribe un numero: ");
            int num = lector.nextInt();
            
            if(num < 0){
                neg = true;
            }
            else if(num > 99){
                mayor = true;
            }
            cont++;
        }
        
        if(neg && mayor)
            System.out.println("Hay negativos y mayores de 99");
        else if(neg)
            System.out.println("Hay algun negativo");
        else if(mayor)
            System.out.println("Hay alguno mayor de 99");
        else{
            System.out.println("No hay negativos ni mayores de 99");
        }
                
    }
    

}
    

