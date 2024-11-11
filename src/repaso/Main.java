package repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[10];

		System.out.println("Introduce 10 valores para el array");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = entrada.nextInt();

		}
			int cantidadpositivos = 0;
			int cantidadnegativos=0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] >= 0) {

				cantidadpositivos = cantidadpositivos + 1;
			}else {
				cantidadnegativos = cantidadnegativos + 1;
			}
			
		}System.out.println("Hay " + cantidadpositivos + " numeros positivos");
		System.out.println("Hay " + cantidadnegativos + " numeros negativos");

		int sumapositivos = 0;
int sumanegativos=0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]>= 0) {
				sumapositivos=sumapositivos+numeros[i];
				
			}else {
				sumanegativos=sumanegativos+numeros[i];
			}
		}
		double mediasumapos=sumapositivos/cantidadpositivos;
		double mediasumaneg=sumanegativos/cantidadnegativos;

		System.out.println("media de los positivos: "+ mediasumapos);
		System.out.println("media de los negativos: "+ mediasumaneg);

		entrada.close();
	}

}
