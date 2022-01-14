/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD3_bucles;

/**
 *
 * @author luisp
 */
import java.util.Scanner;
public class ej14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
       
        // Variables
        int numero;
        boolean algunMult10 = false;

        // Creo el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos 5 números
        for (int i = 1; i <= 5; i++) {
            
            // Pedimos número
            System.out.print("Dime un numero: ");
            numero = in.nextInt();
            
            // Si es par, ponemos interruptor a true
            if ((numero % 10) == 0) {
                algunMult10 = true;
            }
        }

        // Mostramos si alguno era múltiplo
        if (algunMult10)
            System.out.println("Alguno era múltiplo de 10");
        else
            System.out.println("Ninguno era múltiplo de 10");
    }
}

            
    

