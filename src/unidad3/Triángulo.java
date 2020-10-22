package unidad3;

import java.util.*;

public class Triángulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4. En el método main de una clase llamada Triángulo escribe un programa que
		determine si tres números reales que se introducen por teclado pueden ser las
		longitudes de los lados de un triángulo. Si la respuesta es afirmativa, tendrá que
		responder a las preguntas siguientes:
		• ¿Es escaleno?
		• ¿Es equilátero?
		• ¿Es isósceles?

		 **/

		System.out.println(
				"Programa para verificar el TIPO de triángulo que obtendremos a partir de 3 números reales de tipo entero");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba el primer número:..");
		int num1 = teclado.nextInt();
		System.out.println("Escriba el segundo número:..");
		int num2 = teclado.nextInt();
		System.out.println("Escriba el tercer número:..");
		int num3 = teclado.nextInt();

		while (num1 == 0 || num2 == 0 || num3 == 0) {

			System.out.println("Error, se vuelve a iniciar el programa..");
			System.out.println("Escriba el primer número:..");
			num1 = teclado.nextInt();
			System.out.println("Escriba el segundo número:..");
			num2 = teclado.nextInt();
			System.out.println("Escriba el tercer número:..");
			num3 = teclado.nextInt();

		}

		if (num1 / num2 == 1 && num3 / num1 == 1) {

			System.out.println("El triángulo es EQUILÁTERO.");

		}

		else if (num1 != num2 && num1 != num3 && num2 != num3) {

			System.out.println("El triángulo es ESCALENO.");

		}

		else {

			System.out.println("El triángulo es ISÓSCELES.");

		}

	}

}
