/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5_Funciones;

import java.util.Scanner;

public class Ej04 {
    
    public static int dimeSigno(int a){
        if(a > 0){
            return 1;
        }
        else if(a<0){
        return -1;
        }
        else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int num;
        System.out.print("DIme un numero: ");
        num = lector.nextInt();
        
        switch (dimeSigno(num)) {
            case 1:
                System.out.println("Positivo");
                break;
            case -1:
                System.out.println("Negativo");
                break;
            case 0:
                System.out.println("Igual a 0");
                break;
        }
    }
    
}
