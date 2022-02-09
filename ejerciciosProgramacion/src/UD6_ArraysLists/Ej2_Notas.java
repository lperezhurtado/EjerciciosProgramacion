
package UD6_ArraysLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2_Notas {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int nota, aprobados = 0, suspensos = 0, total = 0, numNotas = 0;
        boolean hay10 = false;
        ArrayList<Integer> notas = new ArrayList();
        
        do {
            System.out.println("Dime Nota:");
            nota = lector.nextInt();
            
            if(nota >= 0 && nota <= 10){
                notas.add(nota);
                total += nota;
                numNotas++;
            }
            
            //if(nota == 10){
           //     hay10 = true;
           // }
            else if(nota == -1){
                break;
            }
            
            else{
                System.out.println("Nota fuera de rango");
            }
            
            
        } while (nota != -1);
        
        System.out.println("Total notas \t");
        
        for (int i = 0; i < notas.size(); i++) {
            if(notas.get(i) < 5){
                suspensos++;
            }
            else if(notas.get(i) >= 5){
                aprobados++;
            }
            if(notas.get(i) == 10){
                hay10 = true;
            }
            
            
            System.out.println(notas.get(i));
            
        }
        
        System.out.println("Total aprobados: "+aprobados+ "\n");
        System.out.println("Total suspendidos: " +suspensos+"\n");
        if(hay10 == true){
            System.out.println("Hay algun 10 \n");
        }
        System.out.println("Nota media: " + (total/numNotas));
    }

}
