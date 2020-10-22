package unidad3;

import java.util.*;

class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. En el m�todo main de una clase llamada Multiplicar escribe un programa que
		 * ayude al aprendizaje de las tablas de multiplicar. El programa preguntar� qu�
		 * tabla se desea repasar (n�mero entre 1 y 9). A continuaci�n, preguntar� el
		 * resultado de cada multiplicaci�n de la tabla elegida, contabilizando cada
		 * fallo y mostrando la respuesta correcta. Al completar la tabla, el programa
		 * le dir� al usuario si ha aprobado (menos de 2 fallos) o ha suspendido (2 o
		 * m�s fallos). Despu�s finalizar el repaso de cada tabla, se dar� la opci�n de
		 * repasar otra o salir del programa.
		 **/

		Scanner teclado = new Scanner(System.in);
		char letra;

		do {
			System.out.print("Escoja un n�mero del 1 al 10 para la tabla deseada de MULTIPLICAR:");
			int tabla = teclado.nextInt();

			int error = 0;

			while (tabla < 0 || tabla > 10) {
				System.out.println("Error, vuelva a introducir un n�mero del 1 al 10");
				tabla = teclado.nextInt();
			}

			for (int i = 1; i <= 10; i++) {
				System.out.print("(" + error + "Error/es)�Cu�l es el resultado de:" + tabla + "x" + i + "?");
				int res = teclado.nextInt();
				if (res != tabla * i) {
					error++;
				}

			}
			if (error >= 2) {
				System.out.println("SUSPENSO.Usted ha tenido: " + error + " errores");
			} else {
				System.out.println("APROBADO. Usted ha tenido " + error + " errores");

			}

			for (int i = 1; i < 11; i++) {
				System.out.println(tabla + "x" + i + "=" + tabla * i);
			}

			System.out.print("Repetimos o Salimos?� r o s");
			letra = teclado.next().charAt(0);
		} while (letra == 'r');
		{
		}

	}
}
