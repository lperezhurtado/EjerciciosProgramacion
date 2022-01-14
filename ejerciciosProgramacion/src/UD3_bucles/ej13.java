/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD3_bucles;

/**
 *
 * @author luisp
 */
import java.util.Scanner;
public class ej13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe dos numeros: ");
        
        int a = lector.nextInt();
        int b = lector.nextInt();
        
        while(a<=b){
            int par = a%2;
           if(par == 0){
               System.out.println(a);
               a++;
            } 
           else{
               a++;
           }
            
                
            }
        }
    }

