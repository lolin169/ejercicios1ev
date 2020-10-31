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
		
		boolean mayor2=false;
        int contador=0;
		
		
			if(cadena1.length()>cadena2.length()) {
			
				while(cadena1.indexOf(cadena2)>-1) {	
				cadena1=cadena1.substring(cadena1.indexOf(cadena2)+cadena2.length(), cadena1.length());
		
				contador++;

				}
				System.out.print("La cadena mayor es la cadena 1.");
			}
		
			else {
					while(cadena2.indexOf(cadena1)>-1) {
					cadena2=cadena2.substring(cadena2.indexOf(cadena1)+cadena1.length(),cadena2.length());
					
					contador++;
					
					}
					System.out.print("La cadena mayor es la cadena 2.");
				}
			/*if(mayor2=true) {
					System.out.print("La cadena mayor es la cadena 2.");
					}
			
			else{
				System.out.print("La cadena mayor es la cadena 1.");
				}**/
	  
		System.out.println("Está contenida "+contador+" veces en la otra.");
		  
        teclado.close();

		



	}

}
