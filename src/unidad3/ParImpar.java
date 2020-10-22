package unidad3;

import java.util.*;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. En el método main de una clase llamada ParImpar escribe un programa que
		 * diga si un número introducido por teclado es par o impar.
		 **/

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número..");
		int numero = teclado.nextInt();

		/*
		 * while (numero>32.767 ||numero<-32.767) {
		 * 
		 * System.out.
		 * println("Error.El número introducido no es un número entero.Introduzca un número de tipo ENTERO.."
		 * ); numero=teclado.nextInt(); //Prueba para un programa que pida un número de
		 * tipo ENTERO }
		 **/

		if (numero % 2 == 0) {
			System.out.print("El número introducido es PAR: " + numero);
		}

		else {
			System.out.print("El número introducido es IMPAR: " + numero);
		}

	}
}
