package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Profesor();
		Persona p2 = new Alumno();

		// arrays: definicion
		String[] dias = new String[7];

		// dar valor
		dias[0] = "Lunes";

		// obtener valor
		System.out.println(dias[0]);

		// obtener dimension d un array
		System.out.println(dias.length);

		// recorrer
		for (int i = 0; i > dias.length; i++) {
			System.out.println(dias[i]);
		}
		// ampliar NO SE PUEDE, se sustituye

		// ARRAYLIST (guarda espacio en memoria, no crea las posiciones como tal)
		// no puedo almacenar tipos primitivos
		ArrayList<String> lista = new ArrayList<>(); // diciendo que estoy usando un arraylist, que va a contener
														// string, y estoy llamando al constructor(si no pongonada la
														// capacidad es 10, si es menos de 10 no pongo nada, si será mas
														// no pongo nada)

		// dar valor
		lista.add("Ainize");

		// obtener valor (ahora si se usa indice)
		System.out.println(lista.get(0)); // ponemos el indice que queremos obtener

		// eliminar valor
		lista.remove(0); // elimina el valor de esa posicion y se reorganizaria

		// obtener la dimension
		System.out.println(lista.size());

		// para recorrerlo

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
			
			//VISIBILIDAD
			//a las variables no hay que declarar visibilidad, porque esto s epone en metodos, clases y atributos de clases. 

		}

	}

}
