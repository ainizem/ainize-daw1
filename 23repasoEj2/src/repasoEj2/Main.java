package repasoEj2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("De cuantas posiciones quieres tu array?");
		int posiciones = entrada.nextInt();

		int[] array = new int[posiciones];

		System.out.println("Como quieres que se inicialice el array?");
		System.out.println(
				"1.Incicializar a 0 " + "2.Con números aleatorios del 1 al 100 " + "3.Insertando todos los números");
		int modo = entrada.nextInt();

		switch (modo) {

		case 1:
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			break;

		case 2:
			Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				int valoresRand = rand.nextInt(100);
				array[i] = valoresRand;

				System.out.println(array[i]);
			}
			break;

		case 3:
			for (int i = 0; i < array.length; i++) {
				System.out.println("Introduce el valor de la posición: " + i);
				int valor = entrada.nextInt();
				array[i] = valor;
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
		entrada.close();
	}

}
