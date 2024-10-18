package multiplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el numero del que quieres saber los multiplos");
		int numero = entrada.nextInt();
		System.out.println("Los multiplos del " + numero + " son: ");

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);

				entrada.close();

			}
		}
	}
}
