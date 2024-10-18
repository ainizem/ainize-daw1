package arraymedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	//Double[] notas = new Double [10];
	//	for (int i= 0; i<10; i++) {
	//syso("introduce una nota para la asignatura" + (i+1));
	//	}

		System.out.println("Introduce la primera nota");
		double nota1 = entrada.nextDouble();

		System.out.println("Introduce la segunda nota");
		double nota2 = entrada.nextDouble();

		System.out.println("Introduce la tercera nota");
		double nota3 = entrada.nextDouble();

		System.out.println("Introduce la cuarta nota");
		double nota4 = entrada.nextDouble();

		System.out.println("Introduce la quinta nota");
		double nota5 = entrada.nextDouble();

		System.out.println("Introduce la sexta nota");
		double nota6 = entrada.nextDouble();

		System.out.println("Introduce la septima nota");
		double nota7 = entrada.nextDouble();

		System.out.println("Introduce la octava nota");
		double nota8 = entrada.nextDouble();

		System.out.println("Introduce la novena nota");
		double nota9 = entrada.nextDouble();

		System.out.println("Introduce la decima nota");
		double nota10 = entrada.nextDouble();

		double[] nota = new double[10];

		nota[0] = nota1;
		nota[1] = nota2;
		nota[2] = nota3;
		nota[3] = nota4;
		nota[4] = nota5;
		nota[5] = nota6;
		nota[6] = nota7;
		nota[7] = nota8;
		nota[8] = nota9;
		nota[9] = nota10;

		double suma = 0;

		for (int i = 0; i < nota.length; i++) {

			suma = suma + nota[i];
		}

		System.out.println(suma / nota.length);
		entrada.close();

	}

}
