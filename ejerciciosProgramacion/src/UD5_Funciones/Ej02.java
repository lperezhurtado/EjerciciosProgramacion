/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5_Funciones;

import java.util.Scanner;

public class Ej02 {
    public static boolean mayorEdad(int a){
        if(a >=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int edad;
        
        System.out.print("Dime tu edad: ");
        edad = lector.nextInt();
        
        if(mayorEdad(edad)){
            System.out.println("Mayor de edad");
        }
        else{
            System.out.println("No es mayor de edad");
        }
       
    }
    
}
