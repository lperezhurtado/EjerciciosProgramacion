package UD4_matrices;

import java.util.Scanner;

public class Ej05 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		//Variables principales
		int N;
		double[][]persona;
		int hombres = 0, mujer = 0;
		int sueldoh = 0, sueldom = 0;
		
		System.out.println("Total de personas?: ");
		N = lector.nextInt();
		
		persona = new double[N][2];
		
		//bucle anidado para pedir datos
		for (int i = 0; i < N; i++) {
			int genero;
			double sueldo;
			
			System.out.println("Persona " + (i+1));
			
			for (int j = 0; j < 1; j++) {
				System.out.println(" Hombre (0) o mujer (1)?: ");
				genero = lector.nextInt();
				persona[i][j] = genero;
				
				System.out.println("Sueldo?: ");
				sueldo = lector.nextInt();
				persona[i][j+1] = sueldo;
				
				if(genero == 0) {
					hombres++;
					sueldoh += sueldo;
				}
				else if(genero == 1) {
					mujer++;
					sueldom += sueldo;
				}
			}
		}
		System.out.println("");
		System.out.println("Sueldo medio hombres: " + (sueldoh/hombres));
		System.out.println("Sueldo medio mujeres: " + (sueldom/mujer));
			
	}	
}
		



