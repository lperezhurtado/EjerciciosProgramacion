
package UD9_Ficheros_LectYEscr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej02 {
    
    public static void main(String[] args) {
        
        try{
            File f = new File("Documentos/alumnos_notas.txt");
            Scanner lector = new Scanner(f);
            ArrayList<String> lista = new ArrayList();
            ArrayList<Integer> notas = new ArrayList();
            String[] num;
            double media;
            int cont = 0;
            
            while(lector.hasNext()){
                lista.add(lector.nextLine());
                num = lista.get(cont).split(" ");
                
                media = 0;
                for (int i = 2; i < num.length; i++) {
                    media += Integer.parseInt(num[i]);  
                }
                
                System.out.println(num[0]+" "+num[1]+": "+media/(num.length-2));
                cont++;
            }
        } 
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        
    }

}
