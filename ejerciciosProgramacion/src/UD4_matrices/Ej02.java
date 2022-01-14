package UD4_matrices;


public class Ej02 {

	public static void main(String[] args) {
		
		int[][] tablas = new int[11][11];
		int result;
		
		for (int i = 1; i < 11; i++) {
			System.out.println("\n");

			System.out.println("tabla del " + i);
			
			for (int j = 1; j < 11; j++) {
				result = i * j;
				tablas[i][j] = result;

				System.out.print(i + " x " + j + " = " +tablas[i][j] + "\n");
				
			}
		}

	}

}
