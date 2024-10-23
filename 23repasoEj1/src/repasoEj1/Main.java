package repasoEj1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("De cuantas posiciones quieres tu array?");
		int posiciones= entrada.nextInt();
		
		int[] array= new int[posiciones];
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Se ha creado tu array " + array[i]);
		
		}	
	
		
		entrada.close();
		
		
		
	}

}
