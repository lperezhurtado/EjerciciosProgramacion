package UD3_condicionales;

import java.util.Scanner;
public class condicional11
{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        int a;
        System.out.println("Numero dia: ");
        a = lector.nextInt();
        
        if( a == 1){
            System.out.println("Lunes");
        }
        else if( a == 2){
            System.out.println("Martes");
        }
        else if( a == 3 ){
            System.out.println("MIercoles");
        }
        else if( a == 4){
            System.out.println("Jueves");
        }
        else if( a == 5){
            System.out.println("Viernes");
        }
        else if(a == 6){
            System.out.println("Sabado");
        }
        else if( a == 7){
            System.out.println("Domingo");
        }
        else{
            System.out.println("Error");
        }
    }
}