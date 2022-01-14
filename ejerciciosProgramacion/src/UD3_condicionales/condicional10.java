package UD3_condicionales;

import java.util.Scanner;
public class condicional10
{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        double a,b;
        System.out.println("Escribe un numero: ");
        a = lector.nextInt();
        
        System.out.println("Escribe otro numero: ");
        b = lector.nextInt();
        
        double suma = a + b;
        double resta = a + b;
        double producto = a * b;
        
        if( b == 0){
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("Division nula");
        }
        else{
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("Division:" + (a/b));
        }
            
    }
}