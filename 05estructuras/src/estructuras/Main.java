package estructuras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ESTRUCTURAS DE CONTROL DE FLUJO

		// condicionales (lo que ponemos dentro de una estructura, se va a ejecutar o no
		// depende la condicion)
		Scanner entrada = new Scanner(System.in);

		// System.out.println("Introduce tu edad:");
		// int edad = entrada.nextInt(); // porque hemos creado una instancia

		// edad >=18 ACCESO PERMITIDO
		/*
		 * if (edad >= 16 && edad < 18) { // dentro de un parentesis de un IF siempre
		 * dará algo booleano; si no es mayor a // eso, no se va a ejecutar la siguiente
		 * // linea System.out.println("Acceso permitido con tutor legal"); } else if
		 * (edad >= 18) { System.out.println("Acceso permitido");
		 * 
		 * } else { System.out.println("Fin del programa");
		 * 
		 * }
		 * 
		 * System.out.println("Introduce la inicial del dia de la semana:"); String dia
		 * = entrada.next(); // entarda para que se le añada info
		 * 
		 * /* switch (dia) { case "l": System.out.println("Lunes"); // s epone break
		 * para que una vez ejecute uno no siga, para terminar el control // de flujo
		 * break; case "m": System.out.println("Martes"); break; case "x":
		 * System.out.println("Miercoles"); break; case "j":
		 * System.out.println("Jueves"); break; case "v": System.out.println("Viernes");
		 * 
		 * default: System.out.println("Dia no valido");
		 * 
		 * }
		 */
		// repetitivas-bucles FOR/WHILE/DO...WHILE

		// for siempre 3 partes (no siempre hay que llenar las 3)
		// 1.inicialicion: inicializar las variables que vamos a utilizar dentro del for
		// 2. condicion: NO se ejecuta siempre, pero solo si cumple esta condicion
		// 3.cada vuelta
		// for (int i = 0; i < 10; i++) {
		// System.out.println("Mensaje" + i);
		// }

		System.out.println("Introduce tu nombre");
		String nombre = entrada.next();

		// for (int i = 0; i < nombre.length(); i++) {

		for (int i = nombre.length() - 1; i >= 0; i--) {
			System.out.println(nombre.charAt(i));

			// while (condicion) no hay indice(para pedir al usuario que meta numeros, hasta
			// que acierte)
			// estructura :
			/*
			 * int i = 0; while (i<nombre.length()) {
			 */

			double numeroOculto = (int) (Math.random() * 10);

			while (true) {
				System.out.println("Adivina el numero oculto");
				int numeroUsuario = entrada.nextInt();

				if (numeroUsuario == numeroOculto)
					;
				System.out.println("Acierto");
			}

		} // entrada.close();
		double numeroOculto = (int) (Math.random() * 10);

		// DO... WHILE (MINIMO S EJEECUTA 1 VEZ) Primero se evalua la condicion
		// Se utiliza si necesitamos que el codigo se ejecute por lo menos 1 vez
		int numeroUsuario = 0; // se pone fuera del "do" porque sino no se puede usar fuera de ahi

		do {

			System.out.println("introduce un numero del 0 al 10 ");
			numeroUsuario = entrada.nextInt();

		} while (numeroUsuario != numeroOculto);

		
		
		entrada.close();

		
	}

}
