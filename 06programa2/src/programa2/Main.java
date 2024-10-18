package programa2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu tipo de cliente (Normal, Socio o VIP)");
		String tipocliente = entrada.next();

		System.out.println("Introduce el valor total de la compra:");
		Double totalcompra = entrada.nextDouble();

		System.out.println("Total a pagar: ");

		switch (tipocliente) {
		case "Normal", "normal":
			System.out.println(totalcompra);
			break;

		case "Socio", "socio":
			System.out.println(totalcompra - (totalcompra * 0.05));
			break;

		case "VIP", "vip":
			System.out.println(totalcompra * (1 - 0.20));
			break;

		default:

			System.out.println("No valido");

			entrada.close();

		}
	}

}
