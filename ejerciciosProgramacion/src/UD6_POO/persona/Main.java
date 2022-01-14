
package UD6_POO.persona;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        System.out.println("Nombre?");
        p1.nombre = lector.nextLine();
        System.out.println("Apellidos?");
        p1.apellido = lector.nextLine();
        System.out.println("DNI?");
        p1.dni = lector.nextLine();
        System.out.println("Edad?");
        p1.edad = lector.nextInt();
        
        lector.nextLine();
        System.out.println("Nombre?");
        p2.nombre = lector.nextLine();  
        System.out.println("Apellidos?");
        p2.apellido = lector.nextLine();
        System.out.println("DNI?");
        p2.dni = lector.nextLine();
        p1.edad = lector.nextInt();
        
        
        if(p1.edad>=18){
            System.out.println(p1.nombre+" "+p1.apellido+" con dni "+p1.dni+" es mayor de edad");
        }
        else{
             System.out.println(p1.nombre+" "+p1.apellido+" con dni "+p1.dni+" no es mayor de edad");
        }
        
        if(p2.edad>=18){
            System.out.println(p2.nombre+" "+p2.apellido+" con dni "+p2.dni+" es mayor de edad");
        }
        else{
             System.out.println(p2.nombre+" "+p2.apellido+" con dni "+p2.dni+" no es mayor de edad");
        }
    }
}
