
package UD7_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej11 {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int[] numeros;
        
        int n = (int) ( 1 + Math.random() * (100 - 1));
        int numero, pos = 0;
        numeros = new int[n];
        
        do {
            
            try{
                for (int i = 0; i < numeros.length; i++) {
                    
                    numero = (int)( 1 + Math.random() * (10 - 1));
                    numeros[i] = numero;
                }
                
                System.out.println("Que posicion quieres ver");
                pos = lector.nextInt();
                
                System.out.println(numeros[pos]);
            }
            
            catch(InputMismatchException error1){
                System.out.println("Dato no valido");
                lector.nextLine();
            }
            
            catch(IndexOutOfBoundsException error2){
                System.out.println("Numero fuera de rango");
                lector.nextLine();
            }
                
        } while (pos >= 0);
        
        System.out.println("Has salido (numero negativo introducido)");
        
    }

}
