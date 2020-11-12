package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 Ejercicio 14
			Programa que utilice un único array para leer y almacenar los datos de varias secuencias de números
			enteros. Los datos se introducirán por teclado de la forma siguiente:
				• Se escribe una primera línea que contiene el número de secuencias.
				• A continuación, se escriben las secuencias a razón de dos líneas por secuencia con el formato
				  siguiente:
					o La primera contiene la cantidad de números de la secuencia.
					o La segunda contiene los números de la secuencia separados por espacios.
		 **/

		Scanner teclado= new Scanner (System.in);
		
		System.out.print("Introduzca el número de secuencias de números que ha de tener el array..");
		int filas=teclado.nextInt();
		System.out.println("Introduce la cantidad de números de la secuencia");
		int numeros;
		int [][] array= new int [filas][];
		
		
		for(int i=0;i<filas;i++) {
			numeros= teclado.nextInt();
			teclado.nextLine();
			array[i]= vectorSecuencias(numeros);
			if((i+1)<filas) {
			System.out.println("Introduce la cantidad de números de la nueva secuencia");}
			
		}
		   
		for (int i=0; i<array.length; i++) {
			System.out.print("[");
			for (int j=0; j<array[i].length; j++) {
				System.out.print( array[i][j]);
				if((j+1)<array[i].length) {
					System.out.print(" ");
				}
			}
			System.out.println("]");
		}
	
	}

	
	static int [] vectorSecuencias( int numeros ) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce los números de la secuencia separados por espacios..");
		int [] vector= new int[numeros];
		for(int i=0;i<numeros;i++) {
				
			vector[i]=Integer.parseInt(teclado.next());
				
			}
		
		return vector;
	}

}
