package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 Ejercicio 4
		Programa que, utilizando una cantidad mínima de variables, simule el lanzamiento de un dado N veces,
		siendo N un número entero que se introducirá por teclado. Antes de finalizar mostrará el número de veces
		que salió cada una de las caras
		 **/
		
		Random ran= new Random();
		Scanner teclado= new Scanner(System.in);
		//String repetir;
		//do {
			System.out.print("Introduzca un número de tiradas..");
			int tiradas= teclado.nextInt();
			int[] dado= new int [6];
		
			for (int i=0; i<tiradas; i++) 
				dado[ran.nextInt(6)]++;
			for (int i=0; i<dado.length; i++) 
				System.out.println("El número "+(i+1)+" ha salido "+dado[i]+" veces.");
			//	System.out.println("Desea Repetir o Salir. R o S.");
			//	repetir=teclado.next();}
		//while(repetir.equalsIgnoreCase("R")||repetir.equalsIgnoreCase("repetir")); {
	
				System.out.println("Fin del programa");
		//}

		teclado.close();
        
		

	}

}
