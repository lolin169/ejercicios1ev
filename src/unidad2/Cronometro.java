package unidad2;

import java.io.*;
import java.lang.*;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 3. En el método main de una clase Java llamada Cronometro escribe un programa
		 * que pida al usuario que introduzca mediante el teclado su nombre y a
		 * continuación muestre en la consola un mensaje que incluya un número real que
		 * represente los segundos y milisegundos que ha tardado en contestar, con un
		 * formato de salida que emplee exactamente 3 dígitos en la parte decimal.
		 * Realiza el ejercicio sin utilizar la clase Scanner.
		 **/

		System.out.print("Introduzca su nombre:");
		double t1 = System.currentTimeMillis();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre = in.readLine();
		double t2 = System.currentTimeMillis();
		System.out.printf("Hola %s, has tardado %.3f segundos en decirme tu nombre", nombre, (t2 - t1) / 1000);

	}

	/*
	 * private static double currentTimemillis() { // TODO Auto-generated method
	 * stub return 0; }
	 **/

}
