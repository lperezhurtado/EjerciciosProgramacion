package UD3_condicionales;

import java.util.Scanner;
public class condicional6
{
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);
        
        int A,B;
        
        System.out.println("Escribe un numero: ");
        A = lector.nextInt();
        
        System.out.println("Escribe otro numero: ");
        B = lector.nextInt();
        
        if(A>B){
            System.out.println(A + " es mayor");
        }
        else if(B>A){
            System.out.println(B + " es mayor");
        }
        else{
            System.out.println(A + " es igual que " + B);
            
        }
    }
}