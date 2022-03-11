
package UD8_Ficheros.Ej01;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
            int contA = 0;
            int contD = 0;
            File[] lista = ruta.listFiles();
            Arrays.sort(lista);
            ArrayList<File> dir = new ArrayList();
            ArrayList<File> arch = new ArrayList();
            
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isDirectory()) {
                    dir.add(lista[i]);
                    contD++;
                }
                else if (lista[i].isFile()) {
                    arch.add(lista[i]);
                    contA++;
                }
            }
            
            if(contD != 0){
                System.out.println("LISTA DE DIRECTORIOS \t");
                for (int i = 0; i < dir.size(); i++) {
                    System.out.println(dir.get(i).getName());
                }
            }
            System.out.println("\n");
            if(contA != 0){
                System.out.println("LLISTA DE ARCHIVOS \t");
                for (int i = 0; i < arch.size(); i++) {
                    System.out.println(arch.get(i).getName());
                }
            }  
            
        }
    }  
}
        
    


