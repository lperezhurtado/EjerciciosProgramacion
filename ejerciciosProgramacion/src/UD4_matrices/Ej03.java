package UD4_matrices;


import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		int[][] numeros;
		int filas, colum;
		int valor;
		int mayorcero = 0, menorcero = 0, igual = 0;
		
		System.out.println("Filas?: ");
		filas = lector.nextInt();
		
		System.out.println("Columnas?: ");
		colum = lector.nextInt();
		
		numeros = new int[filas][colum];
		
		System.out.println("debes introducir " + (filas * colum) + " valores");
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < colum; j++) {
				System.out.print("Introduce un valor: ");
				valor = lector.nextInt();
				numeros[i][j] = valor;	
			}	
		}
		
		for (int i = 0; i < filas; i++) {
			System.out.println("\t");
			
			for (int j = 0; j < colum; j++) {
				System.out.print(numeros[i][j] + " ");	
				
				if(numeros[i][j] > 0) {
					mayorcero++;
				}
				else if(numeros[i][j] < 0) {
					menorcero++;
				}
				else {
					igual++;}
			}	
		}
		System.out.println("\t");
		System.out.println("mayores que 0 = " + mayorcero);
		System.out.println("menores que 0 = " + menorcero);
		System.out.println("iguales a 0 = " + igual);
		
	}

}
