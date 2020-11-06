package unidad4;

import java.util.Scanner;

public class Ejercicio11 {
	
	

	public static void main(String[] args) {
		/*
		 Ejercicio 11
			Definir un método que reciba un vector de cadenas y retorne la cadena de mayor longitud almacenada en
			dicho vector.
			Poner a prueba el método invocándolo desde otro método que cree un vector con los nombres de 10
			personas introducidos por teclado.
		 **/

		Scanner teclado= new Scanner(System.in);
		String nombre;
		String [] vector= new String [10];
		for(int i=0;i<10;i++) {
			System.out.println("Introduce un nombre:");
			vector[i]=teclado.nextLine();	
		}
		
		System.out.println("El nombre más largo es: "+cadenamayor(vector));
		 
	}
	
	
	static String cadenamayor (String [] cadena) {
		String cadenamayor=cadena[0];
		for(int i=0;i<cadena.length;i++) {
			if(cadena[i].length()>cadenamayor.length()) {
				cadenamayor=cadena[i];
			}
			
		}
		
		return cadenamayor;
	}
	
	

}
