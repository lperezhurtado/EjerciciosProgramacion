
package UD6_ArraysLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej3_Precios {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        ArrayList<Double> precios = new ArrayList();
        
        double precio;
        
        do {
            System.out.print("Dime precio: ");
            precio = lector.nextDouble();
            
            if(precio >= 0){
                precios.add(precio);
            }
      
        } while (precio >= 0);
        
        System.out.println("\n");
        System.out.println("Total precios \t");
        for (int i = 0; i < precios.size(); i++) {
            
            System.out.println(precios.get(i));
        }
        
        
        ArrayList<Double> preciosBaratos = new ArrayList();
        ArrayList<Double> preciosCaros = new ArrayList();
        
        for (int i = 0; i < precios.size(); i++) {
            i = 0;
            if (precios.get(i) < 100) {
                preciosBaratos.add(precios.get(i));
                precios.remove(i);
            }
            
            if(precios.get(i) >= 100){
                preciosCaros.add(precios.get(i));
                precios.remove(i);
            }
            
        }
        
        System.out.println("Array list precios: \t");
        for (int i = 0; i < precios.size(); i++) {
            System.out.println(precios.get(i));
        }
        
        System.out.println("Precios baratos: \t");
        for (int i = 0; i < preciosBaratos.size(); i++) {
            System.out.println(preciosBaratos.get(i));
        }
        
        System.out.println("Precios caros \t");
        for (int i = 0; i < preciosCaros.size(); i++) {
            System.out.println(preciosCaros.get(i));
        }
        
    }

}
