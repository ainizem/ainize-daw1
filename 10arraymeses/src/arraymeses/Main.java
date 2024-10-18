package arraymeses;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String[] mes = new String[12]; //queremos que haya 12 huecos
	
		mes[0] = "Enero";
		mes[1] = "Febrero";
		mes[2] = "Marzo";
		mes[3] = "Abril";
		mes[4] = "Mayo";
		mes[5] = "Junio";
		mes[6] = "Julio";
		mes[7] = "Agosto";
		mes[8] = "Septiembre";
		mes[9] = "Octubre";
		mes[10] = "Noviembre";
		mes[11] = "Diciembre"; //colocamos 11 porque se empieza desde 0

		
		System.out.println("Introduce el número del mes que quieras mostrar");
		int numMes = entrada.nextInt();
		
		
		if (numMes > 0 && numMes <= 12) {
			System.out.println(mes[numMes-1]); //dentro, donde va el numero de indice, se pueden poner cosas que no sean números en negro

		}else {
			System.out.println("Este mes no existe");
		}
		
		entrada.close();
	}

}
