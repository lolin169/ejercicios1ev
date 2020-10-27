package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		/*
		 * 2. En el método main de una clase Java llamada Conversor escribe un programa
		 * en Java que convierta de euros a dólares. El dato de entrada será un número
		 * decimal correspondiente a la cantidad en euros, y el dato de salida será un
		 * número decimal que representará la cantidad correspondiente en dólares con
		 * una precisión de 2 decimales. Realiza el ejercicio sin utilizar la clase
		 * Scanner.
		 **/

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca una cantidad en Euros:");
		float cantidad = Float.parseFloat(in.readLine());
		float aDolares = 1.18f;

		System.out.printf("%.0f euros son: %.2f Dólares.", cantidad, (cantidad * aDolares));

	}
}
