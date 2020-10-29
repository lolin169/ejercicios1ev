package unidad4;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	Ejercicio 2
	Programa que lea una cadena en desde el teclado y la muestre invertida en la consola.
	**/

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Introduce una frase para invertirla..");
		
		/*StringBuffer frase= new StringBuffer(teclado.nextLine());
		 
		 frase= frase.toLowerCase;
		
		StringBuffer fraseinvertida= frase.reverse();
		 
		System.out.println("La frase invertida es.."+fraseinvertida);**/
		
		String frase = new String(teclado.nextLine());
		
		//frase= frase.toLowerCase();
				
		StringBuffer fraseinvertida= new StringBuffer();
		
		for (int indice=frase.length()-1;indice>=0;indice--) {
			
			fraseinvertida.append(frase.charAt(indice));
			
		}
		System.out.println(fraseinvertida);
		 
		 
		
		

		
		
	}
}
