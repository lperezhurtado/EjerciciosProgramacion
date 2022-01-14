package UD3_condicionales;


import java.util.Scanner;

public class condicional1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int edad;
        System.out.println("Dime tu edad: ");
        edad = lector.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

    }
}
    
    