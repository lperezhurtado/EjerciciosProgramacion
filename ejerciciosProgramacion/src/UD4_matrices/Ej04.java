package UD4_matrices;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		double[][] notas = new double[4][5];
		double valor;
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Introduce nota de asignatura "+(j + 1)+" de alumno "+(i+1)+": ");
				valor = lector.nextDouble();
				notas[i][j] = valor;	
			}
		}
		
		for (int i = 0; i < notas.length; i++) {
			double total = 0;
			double min = notas[i][0];
            double max = notas[i][0];
			
			System.out.println("\t");
			System.out.println("Alumno " + (i+1));
			
			for (int j = 0; j < 5; j++) {
				total += notas[i][j];
				min = Math.min(min, notas[i][j]);
                max = Math.max(max, notas[i][j]);
                
				System.out.print(notas[i][j] + " | ");	
			}
			System.out.print("Media: " + (total/5) + " | ");
			System.out.println("Nota maxima: " + max +" | ");
			System.out.println("Nota minima: " + min);
			System.out.println("\t");
		}
		
	}

}
