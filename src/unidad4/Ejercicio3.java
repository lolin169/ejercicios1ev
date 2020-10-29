package unidad4;

import java.util.Scanner;

public class Ejercicio3 {

	  public static void main(String[] args) {
		/*
		 Programa que lea dos cadenas desde el teclado y muestre el número de veces que la segunda está
		 contenida en la primera.
		 **/
		
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduzca una cadena:");
		String cadena1= teclado.nextLine();
		System.out.print("Introduzca la segunda cadena: ");
		String cadena2= teclado.nextLine();
		
		int contador=0;
		int i=0;
		int j=0;

		
		
			if(cadena1.length()>cadena2.length()) {
			
			 i= cadena1.indexOf(cadena2, i);
			
			 contador++;

			 System.out.println("La cadena mayor es la cadena 1.");}
		
			
		else {
		
			j=cadena2.indexOf(cadena1, j);
            contador++;
			System.out.println("La cadena mayor es la cadena 2.");}
			
			
		
	  
		System.out.println("Está contenida "+contador+" veces en la otra.");
		  
        teclado.close();

		



	}

}
