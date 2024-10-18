package arraynumeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		int numeroMax = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > numeroMax) { //si el numero i(que va pasando por todos) es mayor que el numero que se va guardando en el max. El max puede empezar de 0 o 
				numeroMax = num[i];		//en este caso desde el primer hueco del array, porque d momento no vamos a conocer ningun numero mayor que ese 
				

			}

		}

		/*MANERA MAS CORRECTA DE HACERLO:
		 * 
		 * int numeroMax = num [0];
		 * 
		 * for (int i = 1; i < num.length; i++) {
			if (num[i] > numeroMax) {
				numeroMax = num[i];
		 * */
		
		
		
		
		System.out.println("Este es el numero mas alto: " + numeroMax);

		entrada.close();

	}

}
