package unidad4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		  Programa que lea desde el teclado una línea que contenga un NIF completo (número y letra) y a
		  continuación verifique que es correcto. Para obtener la letra de validación del N.I.F. se realiza la división
		  entera de la parte numérica entre 23 y el resto se utiliza como índice de la tabla siguiente:
			Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
			Letra T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
		  La validación consiste en comprobar que la letra obtenida en la tabla coincide con la letra introducida por
  		  teclado.
		 **/
       
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca su dni");
		char[] letra= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		String dni= teclado.next();
		char fin= dni.charAt(dni.length()-1);
		int numeros= Integer.valueOf(dni.substring(0,dni.length()-1));
		if(letra[numeros%23]==fin) {
			System.out.println("El Dni es correcto");
		}
		else {System.out.println("El Dni es Incorrecto");}
		
		 
	}

}
