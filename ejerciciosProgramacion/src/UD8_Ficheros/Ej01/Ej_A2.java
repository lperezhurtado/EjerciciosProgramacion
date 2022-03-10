
package UD8_Ficheros.Ej01;

import java.io.File;
import java.util.Scanner;

public class Ej_A2 {
    
    public static void main(String[] args) {
        
     
        
        Scanner lector = new Scanner(System.in);
        
        File ruta1;
        String ruta;
        
        System.out.println("Ruta?: ");
        ruta = lector.nextLine();
        ruta1 = new File(ruta);
        
        muestraInfoRuta(ruta1);
        
    }
    
    
    public static void muestraInfoRuta(File ruta){
        
        if(ruta.isFile() == true){
            System.out.println("Nombre del archivo: " + ruta.getName());
        }
        
        else if(ruta.isDirectory() == true){
            File[] lista = ruta.listFiles();
            File[] dir = null;
            File[] arch = null;
            
            System.out.println("Lista de Directorios \n");
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isDirectory()) {
                    dir[i] = lista[i];
                }  
            }
            
            System.out.println("Lista de Archivos \n");
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isFile() == true) {
                    arch[i] = lista[i];
                }
            } 
        }
    }
    
}
        
    


