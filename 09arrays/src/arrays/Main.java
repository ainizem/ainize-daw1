package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int [] enteros = {}; asi se declara y da valor
		// String[]semana = new String [7]; (se puede declarar vacio o con )

		String[] semana = new String[7];// para darle valor a cada una de las posiciones (7) del array: 

		semana [0] = "Lunes";
	
		semana [1] = "Martes";
		semana [1] = semana [1] + "Otro valor"; //para sumar

		
		String[] semana2 = { "lunes", "martes" };

		//para obtener el valor simplemente:
		System.out.println(semana [1]);
		
		
		System.out.println(args[2]);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
