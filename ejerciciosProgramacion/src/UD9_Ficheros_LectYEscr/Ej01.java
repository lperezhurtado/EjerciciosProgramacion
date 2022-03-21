
package UD9_Ficheros_LectYEscr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej01 {
    
    public static void main(String[] args) {
        
        
        try{
            File file = new File("Documentos/numeros.txt");
            Scanner lector = new Scanner(file);
            int min = Integer.MAX_VALUE; 
            int max = -1;
        
            while(lector.hasNext()){
                
                int n = lector.nextInt();
                if(n < min){
                    min = n;
                }
                if(n > max){
                    max = n;
                }
            }
            System.out.println(max);
            System.out.println(min);
            
            lector.close();
        }
        
        
        catch(FileNotFoundException e){
            System.out.println("Error: " + e);
        }
        
        
        
        
    }

}
