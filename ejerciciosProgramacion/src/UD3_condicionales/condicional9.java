package UD3_condicionales;

import java.util.Scanner;
public class condicional9
{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        int a,b;
        System.out.println("Escribe un numero: ");
        a = lector.nextInt();
        
        System.out.println("Escribe otro numero: ");
        b = lector.nextInt();
        
        int multiplo = a%b;
        int multiplo_inv = b%a;
        
        if (multiplo == 0 || multiplo_inv == 0)
           { System.out.println("Hay un multiplo");
        }
        else{
           System.out.println("No son multiplos");
        }
        
        
        
}
}

