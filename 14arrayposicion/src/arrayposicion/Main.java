package arrayposicion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		int num1 = entrada.nextInt();

		System.out.println("Introduce el segundo numero");
		int num2 = entrada.nextInt();

		System.out.println("Introduce el tercer numero");
		int num3 = entrada.nextInt();

		System.out.println("Introduce el cuartp numero");
		int num4 = entrada.nextInt();

		System.out.println("Introduce el quinto numero");
		int num5 = entrada.nextInt();

		System.out.println("Introduce el sexto numero");
		int num6 = entrada.nextInt();

		System.out.println("Introduce el septimo numero");
		int num7 = entrada.nextInt();

		System.out.println("Introduce el octavo numero");
		int num8 = entrada.nextInt();

		// o para que se recorra el array
		// for (int i=0; i<numeros.length; i++){
		// numeros [i]= (int)((Math.random)*10)+1); el int ese porque no se puede
		// convertir un double como math random a int

		int[] numeros = new int[8];

		numeros[0] = num1;
		numeros[1] = num2;
		numeros[2] = num3;
		numeros[3] = num4;
		numeros[4] = num5;
		numeros[5] = num6;
		numeros[6] = num7;
		numeros[7] = num8;

		System.out.println("Introduce el numeor que quieres encontrar");
		int numPosicion = entrada.nextInt();

		boolean encontrado = false;
		int posicion = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numPosicion) {
				encontrado = true;
				posicion = i;
				break;
			}

		}

		if (encontrado) {
			System.out.println("El numero esta en la posicion " + posicion + "del array.");
		} else {
			System.out.println("El numero no esta en el array");

		}

		entrada.close();
	}

}
