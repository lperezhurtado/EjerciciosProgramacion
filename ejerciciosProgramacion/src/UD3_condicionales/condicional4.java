package UD3_condicionales;

import java.util.Scanner;
public class condicional4
{
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);
        
        int num;
        System.out.println("Escribe un numero: ");
        num = lector.nextInt();
        
        if(num>=0){
            System.out.println("Es positivo");
        }
        else{
            System.out.println("Es negativo");
            
        }
    }
}