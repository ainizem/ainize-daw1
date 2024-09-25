package programa1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de alumn@:");
		String nombre = entrada.next(); 
		
		System.out.println("Introduce las 5 calificaciones de Lengua, Matematicas, Euskera, Fisica e Historia:");
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();
		double n4 = entrada.nextDouble();
		double n5 = entrada.nextDouble();
		
		double media = (n1+n2+n3+n4+n5)/5;
		
		System.out.println(media);
		
		if (n1 >= 5 && n2 >= 5 && n3 >= 5 && n4 >= 5 && n5 >= 5) {;
		
			System.out.println("El/la alumn@ "+ nombre + " ha conseguido una media de " + media + ", por lo que es Apt@.");
		} else  {
			System.out.println("El/la alumn@ "+ nombre + " ha conseguido una media de " + media + ", por lo que es No Apt@.");
		
		entrada.close();

	}

	}
}
