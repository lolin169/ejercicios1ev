package unidad3;

import java.util.*;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. En el m�todo main de una clase llamada Bisiesto escribe un programa que
		 * utilizando una �nica expresi�n l�gica determine si un a�o es o no es
		 * bisiesto. El a�o se introducir� por teclado y el resultado lo mostrar� en la
		 * pantalla. Un a�o es bisiesto si es m�ltiplo de 4. Los a�os m�ltiplos de 100
		 * no son bisiestos, salvo si son m�ltiplos de 400.
		 * 
		 **/

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un año");
		int año = teclado.nextInt();
		if (año % 4 == 0 && año % 400 == 0 ^ año % 100 != 0) {

			System.out.println("El año es BISIESTO (año " + año + ")");
		}

		else {
			System.out.println("El año NO" + " es bisiesto (año " + año + ")");
		}
	}

}
