package repasoEj4;

import java.util.Arrays;
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
					+ "3.- Reiniciar el array" + "4.- Mostrar Array" + "5.- Suma" + "6.- Multiplicación" + "7.- Media"
					+ "8.- Factorial de cada valor" + "9.- Ordenar de menor a mayor" + "10.- Ordenar de mayor a menor"
					+ "0.- Salir");
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

			case 5:
				int resultadoSuma = 0;
				for (int i = 0; i < array.length; i++) {
					resultadoSuma = resultadoSuma + array[i];
				}
				System.out.println("La suma es: " + resultadoSuma);
				break;

			case 6:
				int resultadoMulti = 1;
				for (int i = 0; i < array.length; i++) {
					resultadoMulti = resultadoMulti * array[i];
				}
				System.out.println("El resultado es: " + resultadoMulti);
				break;

			case 7:
				int resultadoSumaMedia = 0;
				for (int i = 0; i < array.length; i++) {
					resultadoSumaMedia = resultadoSumaMedia + array[i];
				}
				System.out.println("La media es: " + (resultadoSumaMedia / posiciones));
				break;

			case 8:
				for (int i = 0; i < array.length; i++) {
					int numero = array[i];
					int resultadoFactorial = 1;
					for (int j = 1; j <= numero; j++) {
						resultadoFactorial = resultadoFactorial * j;

					}
					System.out.println("El resultado del factorial de " + numero + "es: " + resultadoFactorial);
				}
				break;
				
			case 9:
				Arrays.sort(array);
				break;
			case 10:
				Arrays.sort(array);
				break;
			default:
				if (eleccion != 0) {
					System.out.println("Numero incorrecto");
				}

			}

		} while (eleccion != 0);
		System.out.println("Has salido del programa");

		entrada.close();

	}
}