package unidad2;

import java.io.*;

public class Conversor {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		/* 2. En el m�todo main de una clase Java llamada Conversor escribe un programa
en Java que convierta de euros a d�lares. El dato de entrada ser� un n�mero
decimal correspondiente a la cantidad en euros, y el dato de salida ser� un
n�mero decimal que representar� la cantidad correspondiente en d�lares con
una precisi�n de 2 decimales. Realiza el ejercicio sin utilizar la clase Scanner. **/
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca una cantidad en Euros:");
		float cantidad= Float.parseFloat(in.readLine());
		float aDolares= 1.18f;
		
		

			System.out.printf("%.0f euros son: %.2f D�lares.",cantidad,(cantidad*aDolares));

		
	}
}

