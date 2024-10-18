package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner entrada = new Scanner(System.in); //objeto scanner, instancia entrada; hay que crear una "instacia", llamar a un contructor
		
		System.out.println("Introduce un numero");
		double n1 = entrada.nextDouble(); //para pedir la informacion 
		
		System.out.println("Introduce un numero2");
		double n2 = entrada.nextDouble(); 
		
		
		System.out.println("Que operacion quieres realizar:");
		String operacion = entrada.next();
		
		
	
		switch (operacion) {
		case "Suma", "suma":
			System.out.println(n1+n2); //se pone break para que una vez ejecute uno no siga, para terminar el control de flujo
			break;
		case "Resta":
			System.out.println(n1-n2);
			break;
		case "Division":
			System.out.println(n1/n2);
			break;
		case "Multiplicacion":
			System.out.println(n1*n2);
	
		default:
			System.out.println("No valido");
			
		}
			
	
		entrada.close();

		
	}

}
