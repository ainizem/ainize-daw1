package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); //objeto scanner, instancia entrada; hay que crear una "instacia", llamar a un contructor
		
		System.out.println("Introduce un numero");
		int numero = entrada.nextInt(); //para pedir la informacion 
		
		System.out.println(numero);
		
		entrada.close();
		
		
	}

}
