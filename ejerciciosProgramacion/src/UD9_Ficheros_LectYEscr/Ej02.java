
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
            String[] num;
            int cont = 0;
            while(lector.hasNext()){
                lista.add(lector.nextLine());
                System.out.println(lista.get(cont));
                num = lista.get(cont).split(" ");
                
                cont++;
                
                
            }
            
            
        }
        
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        
    }

}
