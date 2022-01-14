package UD4_arrays;

import java.util.Scanner;


public class Ej12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int pos = 0;
        String opcion;
        
        System.out.println("Elige una opcion: "+"\n"
                + "a) mostrar valores"+"\n"
                + "b) introducir valores"+"\n"
                + "c) salir"+"\n");
        
        opcion = lector.nextLine();
        
        do{
            switch(opcion){
            case "a":
                System.out.println(numeros[pos]);
                
            case "b":
                System.out.print("En que posicion de vector?: ");
                pos = lector.nextInt();
                
                System.out.print("Valor?: ");
                numeros[pos] = lector.nextInt();
                
                
            case "c":
                System.out.println("salir");
                break;
            }
                    
        } while(opcion != "c");
    }}

        
    

                
                
        


        
        
        

    
        
        


        
              
                
        
        
    


