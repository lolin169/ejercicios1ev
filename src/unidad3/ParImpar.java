package unidad3;

import java.util.*;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. En el m�todo main de una clase llamada ParImpar escribe un programa que
		 * diga si un n�mero introducido por teclado es par o impar.
		 **/

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un n�mero..");
		int numero = teclado.nextInt();

		/*
		 * while (numero>32.767 ||numero<-32.767) {
		 * 
		 * System.out.
		 * println("Error.El n�mero introducido no es un n�mero entero.Introduzca un n�mero de tipo ENTERO.."
		 * ); numero=teclado.nextInt(); //Prueba para un programa que pida un n�mero de
		 * tipo ENTERO }
		 **/

		if (numero % 2 == 0) {
			System.out.print("El n�mero introducido es PAR: " + numero);
		}

		else {
			System.out.print("El n�mero introducido es IMPAR: " + numero);
		}

	}
}
