package UD3_condicionales;

import java.util.Scanner;
public class condicional8
{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        int a,b;
        System.out.println("Escribe un numero: ");
        a = lector.nextInt();
        
        System.out.println("Escribe otro numero: ");
        b = lector.nextInt();
        
        int multiplo = a%b;
        
        if (multiplo == 0)
            System.out.println(a + " es multiplo de " + b);
        else{
            System.out.println(a + " no es multiplo de " + b);
        }
        
        
        
    }
}