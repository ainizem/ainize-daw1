package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero del que quieres calcular el factorial:");

		int numeroUsuario = entrada.nextInt();

		int resultadofactorial = 1;
		for (int i = 1; i <= numeroUsuario; i++) { // el for es un bucle, por lo tanto lo que esté dentro estra pasando hasta que la condicion no se cumpla.
													// Entonces, el numeroUsuario va ha estar multiplicandose hasta que no cumpla la condicion, y para esto
													// hace falta un sitio donde se guarde por eso creamos fuera del "for" una variable. 

			resultadofactorial = resultadofactorial * i; //resultado *= i - seria lo mismo pero abreviado. 

		}
		System.out.println("El resultado es: " + resultadofactorial);

		entrada.close();

	}
}
