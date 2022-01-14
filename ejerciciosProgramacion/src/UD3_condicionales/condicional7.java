package UD3_condicionales;

import java.util.Scanner;
public class condicional7
{
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);
        
        int a,b,c;
        
        System.out.println("Escribe un numero: ");
        a = lector.nextInt();
        
        System.out.println("Escribe otro numero: ");
        b = lector.nextInt();
        
        System.out.println("Escribe otro numero: ");
        c = lector.nextInt();
        
        
        if(a>b){
           System.out.println(a + " es mayor");
        }
        else if(b>c){
            System.out.println(b + " es mayor");
        }
        else{
            System.out.println(c + " es mayor");
            
        }

        }
        
        
        
        
        
        
    }
