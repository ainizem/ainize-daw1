package invertirarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros= new int[6];
		
		System.out.println("Introduce 6 numeros");
		for (int i=0; i<numeros.length;i++) {
			numeros[i]=entrada.nextInt(); 
		}
		
		int[]numerosAlReves = new int [numeros.length];
		
		for (int i =numeros.length-1; j=0, i>=0;i--,j++) {
			numerosAlReves[j]= numeros[i];
		}
		for (int n:numerosAlReves);
		
		entrada.close();
	}

}