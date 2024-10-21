package atencionLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

import model.Cliente;

public class App {

	
	//en este caso iriamos atendiendo a los primeros que han llegado sin orden de prioridad
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean atenderClientes = true;

		LinkedList<Cliente> colaClientes = new LinkedList<>();

		colaClientes.add(new Cliente("Ibai", "Goospe"));
		colaClientes.add(new Cliente("Ainize", "Garcia"));
		colaClientes.add(new Cliente("Jom", "N"));

		while (atenderClientes && colaClientes.size() > 0) {
			Cliente clienteAtendido = colaClientes.removeFirst();

			System.out.println("El cliente " + clienteAtendido + "está atendido");

			System.out.println("Quieres seguir atendiendo clientes? s/n");

			String respuesta = entrada.nextLine();

			if (!"s".equals(respuesta)) { // primeor poner antes lo nuestro, lo que el usuario pone despues
				atenderClientes = false;

			}
		}

	}

}
