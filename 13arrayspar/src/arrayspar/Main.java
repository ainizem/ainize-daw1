package arrayspar;

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

		System.out.println("Introduce el cuarto numero");
		int num4 = entrada.nextInt();

		System.out.println("Introduce el quinto numero");
		int num5 = entrada.nextInt();

		
		
		int[] num = new int[5];

		num[0] = num1;
		num[1] = num2;
		num[2] = num3;
		num[3] = num4;
		num[4] = num5;

		int par = 0;//que sirvan de contadores
		int impar = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {

				par = par + 1;//tambien se puede poner par++;
			} else {
				impar = impar + 1;
			}

		}
		System.out.println("Cantidad de numeros pares: " + par);
		System.out.println("Cantidad de numeros impares: " + impar);

		entrada.close();
	}
}
