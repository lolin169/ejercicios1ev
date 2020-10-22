package unidad3;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 7. En el método main de una clase llamada AdivinaNumero escribe un programa
		para jugar a un juego de adivinación. El juego consiste en que el ordenador
		genera un número aleatorio entre 1 y N, ambos incluidos, siendo N un número
		entero mayor o igual que 1.000 y menor o igual que 100.000, que también
		elegirá de forma aleatoria. Una vez elegidos, el ordenador mostrará el mensaje
		“He pensado un número entre 1 y N, adivina cuál es: “. El usuario tendrá que
		introducir números hasta que acierte el que ha pensado el ordenador. Cada vez
		que introduzca un número y no acierte el ordenador le dirá si es mayor o menor
		que el que ha pensado y le volverá a preguntar.
		**/

		Random ran = new Random();

		System.out.println("Bienvenido al juego de adivinar un número que ha pensado ésta computadora");
		Scanner teclado = new Scanner(System.in);
		int N = 1000 + ran.nextInt(99000);
		int aleatorio = ran.nextInt(N) + 1;
		System.out.println("El rango del número que has de calcular está entre 1 y " + N);
		System.out.println("Introduce un número");
		int numero = teclado.nextInt();
		int contador = 1;
		do {
			if (numero > aleatorio) {
				System.out.print("El número es MENOR.Dime otro..(1-" + N + ")");
				numero = teclado.nextInt();
			} else {
				System.out.print("El número es MAYOR.Dime otro..(1-" + N + ")");
				numero = teclado.nextInt();
			}
			contador++;
		}

		while (numero != aleatorio);
		{

			System.out.println(
					"El número es Correcto:" + aleatorio + " .Lo has conseguido en: " + contador + " intentos.");

		}

	}

}
