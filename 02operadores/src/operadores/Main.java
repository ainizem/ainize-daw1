package operadores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Operadores
			aritmeticos: +, -, /, *, %, ++(incremento);--(decremento)
			*/
			//	SUMA
			int n1 = 3;
			int n2 = 4; 
			int resultadosuma = n1+n2;
			
			System.out.println(n1+n2);
			System.out.println(resultadosuma);
			
			// RESTA
			int n3 = 6;
			float n4 = 3.5f; 
			
			System.out.println(n3-n4);
			
			//DIVISION
			
			System.out.println(n3/n4);
			
			//MULTIPLICACION
			
			System.out.println(n1*n3);
			
			//% MODULO (DEVUELVE EL RESTO/hondarra DE UNA DIVISION)
			System.out.println(n4%n3);
			
			
			// ++ INCREMENTO -- DECREMENTO
			System.out.println("incremento:");
		
			int n5 = 8;
			n5 = n5 + 1; // seria lo mismo que n5++ (para simplificar, pero solo sirve con 1) PRIMERO TE DEVUELVE EL VALOR, 
			//Y DESPUÉS TE DA EL RESULTADO, en cambio, si está ++n5 primero se suma y luego te daría 9
			
			System.out.println(n5);
			
			/*relacionales */
			
			//== Es igual? Resultado True/false, valor booleano
			//System.out.println(1==1); //dará un si o no
			
			// != Son diferentes? Resultado True/false, valor booleano
			//System.out.println(1!=1);
			
			//> mayor que 
			System.out.println(1>0);// es mayor que, true
			System.out.println(1>1);//false
			System.out.println(1>2);//false

			//< menor que 
			System.out.println(1<0);// 1 es menor que 0, flaso
			System.out.println(1<1);//false
			System.out.println(1<2);//true
			
			//>=
			
			System.out.println(1>=0);// menor o igual, false
			System.out.println(1>=1);//true
			System.out.println(1>=2);//true
			
			//<=
			
			System.out.println(1<=0);// mayor o igual, true
			System.out.println(1<=1);//true
			System.out.println(1<=2);//false
			
			//lógicos
			
				//&& Se tienen que cumplir las dos

			//System.out.println((1<0) && (1<2)); //false (solo se evalua la primera, porqu eya la primera es falsa)
			
				//|| Con que se cumpla una de ellas bien
			
			System.out.println((1<0) || (1<2)); //true porque aunke sea una única, ya se cumple

				//! NEGACIÓN
			System.out.println(!(1<=0)); //sería false, peor si hay que poner el negativo, se vuelve TRUE

			
			//comparacion 

		
	}

}
