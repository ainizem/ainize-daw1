package repaso;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserta la cantidad de filas/columnas de la matriz: ");
		int filascolumnas = entrada.nextInt();

		int[][] matriz = new int[filascolumnas][filascolumnas];

		Random rand = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				int valoresrand = rand.nextInt(100) + 1;
				matriz[i][j] = valoresrand;
			}

		}
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma = suma + matriz[i][i];
		}

		System.out.println("La suma es: " + suma);

		entrada.close();
	}
}
