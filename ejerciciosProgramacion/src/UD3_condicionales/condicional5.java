package UD3_condicionales;

import java.util.Scanner;
public class condicional5
{
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);
        
        int A,B;
        
        System.out.println("Escribe un numero: ");
        A = lector.nextInt();
        
        System.out.println("Escribe otro numero: ");
        B = lector.nextInt();
        
        if(A>B){
            System.out.println(B + "," + A);
        }
        else{
            System.out.println(A + "," + B);
            
        }
    }
}