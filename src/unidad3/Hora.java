package unidad3;

import java.util.*;

public class Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. En el método main de una clase llamada Hora escribe un programa que lea
		 * una hora (horas, minutos y segundos) desde el teclado y muestre en la
		 * pantalla la hora correspondiente al segundo siguiente. Realiza la lectura de
		 * los datos de entrada como estimes oportuno.
		 **/
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa para Calcular el tiempo siguiente al dado.");
		System.out.print("Escriba la hora:..");
		int hora = teclado.nextInt();
		System.out.print("Ahora escriba los minuto:..");
		int minutos = teclado.nextInt();
		System.out.print("Diga ahora los segundos..");
		int segundos = teclado.nextInt();

		if (segundos > 59) {
			minutos += segundos / 60;
			segundos = segundos % 60;

		}

		if (minutos > 59) {
			hora += minutos / 60;
			minutos = minutos % 60;

		}

		if (hora > 23) {
			hora = hora % 24;
		}

		segundos++;
		System.out
				.println("La hora final es...:  " + hora + "hora/s " + minutos + "minuto/s " + segundos + "segundo/s.");
	}

}
