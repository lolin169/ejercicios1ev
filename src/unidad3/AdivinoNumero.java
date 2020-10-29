package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. En el método main de una clase llamada AdivinoNumero escribe un programa
		 * para jugar al mismo juego del ejercicio 4, pero haciendo que el ordenador sea
		 * el adivino. En este caso el ordenador preguntará cual es el valor del límite
		 * superior y comenzará a adivinar eligiendo un número dentro del intervalo en
		 * base a alguna estrategia de búsqueda. Una vez elegido lo mostrará por
		 * pantalla preguntándole al usuario si ha acertado. El usuario le responderá
		 * acierto, mayor, menor. Si la respuesta es mayor o menor, el ordenador
		 * continuará con la búsqueda. Se ha de contemplar la posibilidad de que el
		 * usuario no responda la verdad cuando el ordenador pregunte si ha acertado.
		 **/

		Random ran = new Random();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el máximo del rango...");
		int maximo = teclado.nextInt();
		int numero = ran.nextInt(maximo + 1);
		System.out.println("El número es " + numero + "¿Si,Mayor o Menor?");
		String respuesta = teclado.next();
		int contador = 1;
		int i;

		do {
			i = numero;

			if (respuesta.equalsIgnoreCase("mayor")) {

				numero = i + ran.nextInt(maximo - i + 1);
				System.out.println("El número es "+numero + "¿Si,Mayor o Menor?");

			} else {

				numero = ran.nextInt(i + 1) + 1;
				System.out.println("El número es "+numero + "¿Si,Mayor o Menor?");
               
			}
            
			respuesta = teclado.next();
			contador++;
		}

		while (respuesta.equalsIgnoreCase("mayor") || respuesta.equalsIgnoreCase("menor"));
		{

			System.out.println("El número es Correcto:" + numero + ". He tardado " + contador + " intentos.");

		}

	}

}
