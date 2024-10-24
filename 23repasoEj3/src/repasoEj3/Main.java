package repasoEj3;

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
				int valoresRand = rand.nextInt(100) + 1;// porque devulve un numero entre el 0 y sin incluir el último
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
			break;
		default:
			System.out.println("Las opciones son entre 1 y 3");
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int eleccion;
		do {
			System.out.println("Que quieres hacer con tu array");
			System.out.println("1.- Cambiar valores de todo el array" + "2.- Cambiar un valor del array"
					+ "3.- Reiniciar el array" + "4.- Mostrar Array" + "0.- Salir");
			eleccion = entrada.nextInt();

			switch (eleccion) {

			case 1:
				for (int i = 0; i < array.length; i++) {
					System.out.println("Introduce el valor de la posición: " + i);
					int cambio = entrada.nextInt();
					array[i] = cambio;
				}
				break;
			case 2:
				System.out.println("Que posicion quieres cambiar?");
				int pos = entrada.nextInt();
				System.out.println("Y que nuevo  valor quieres poner?");
				int nuevoValor = entrada.nextInt();

				array[pos] = nuevoValor;

				break;
			case 3:
				for (int i = 0; i < array.length; i++) {
					array[i] = 0;
					System.out.println("Se ha reinciado el array");
				}
				break;
			case 4:
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
				break;
			default:
				if (eleccion!=0) {
					System.out.println("Numero incorrecto");
				}

			}

		} while (eleccion != 0);
		System.out.println("Has salido del programa");

		entrada.close();
	}

}
