package palindromos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la palabra");
		String palabra = entrada.next();
		String palabraSinEspacios = "";
		String palabra2 = "";

		for (int i=0; i<palabra.length(); i++) {
			if (palabra.charAt(i)!=' ') {
				palabraSinEspacios = palabraSinEspacios + palabra.charAt(i); 
			}
		}
		for (int i = palabra.length() - 1; i >= 0; i--) {
			// System.out.println(palabra.charAt(i));
			palabra2 = palabraSinEspacios + palabraSinEspacios.charAt(i); }
		
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
			// System.out.println(palabra.charAt(i));
			palabra2 = palabra2 + palabra.charAt(i); // hay que hacer la suma para que se guarden los caracteeres que
														// van pasando por la i
		}
		// System.out.println(palabra2);

		if (palabra.equalsIgnoreCase(palabra2)) 
			System.out.println("Tu palabra es un palíndromo!");
		else
			System.out.println("Tu palabra NO es un palíndromo. ");
		
		
		if (palabraSinEspacios.equalsIgnoreCase(palabra2))
			System.out.println("Tu palabra es un palíndromo!");
		else
			System.out.println("Tu palabra NO es un palíndromo. ");

		entrada.close();

	}

}
