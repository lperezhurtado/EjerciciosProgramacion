package UD4_matrices;
public class Ej01 {
	public static void main(String[] args) {
		
		int[][] numeros = new int[5][5];
		int cont = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = cont;
				cont++;
				
				System.out.print(numeros[i][j] + " ");
				
			}
			
		}
		
		
	}

}
