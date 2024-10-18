package mostrarmatriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int viva = 1;
		int muerta = 0;

		System.out.println("Introduce el numero de filas");
		int filas = entrada.nextInt();

		System.out.println("Introduce el numero de columnas");
		int columnas = entrada.nextInt();

		int[][] matriz = new int[filas][columnas];

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				matriz[fila][col] = muerta;
			}
		}

		// System.out.println(matriz[0]);

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.print(matriz[fila][col] + " ");
			}
			System.out.println("");

		}

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(
					"donde quieres celulas vivas? introducir fila (si introduces 0 pararas de añadir celulas)");
			int f = entrada.nextInt();
			if (f == 0) {
				break;
			}
			System.out.println("donde quieres celulas vivas? introducir columna");
			int c = entrada.nextInt();
			matriz[f - 1][c - 1] = viva;
		}

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.print(matriz[fila][col] + " ");
			}
			System.out.println("");
		}

		int contVivas = 0;
		for (int f = -1; f < 2; f++) {
		//	if (matriz[f] = viva) {
				contVivas = contVivas + 1;

				for (int c = -1; c < 2; c++) {
				}
				// (matriz [c])

				;

				{
				}

			}
			System.out.println(contVivas);
			entrada.close();

		}

	}


//			System.out.println("donde quieres celulas vivas? introducir fila1");
//		int f1=entrada.nextInt();
//		System.out.println("donde quieres celulas vivas? introducir columna1");
//		int c1=entrada.nextInt();
//		matriz[f1-1][c1-1]=viva;
//		
//		for (int fila = 0; fila < matriz.length; fila++) {
//			for (int col = 0; col < matriz[fila].length; col++) {
//				System.out.print(matriz[fila][col] + " ");
//			}
//			System.out.println("");
