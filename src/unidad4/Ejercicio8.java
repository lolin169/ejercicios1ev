package unidad4;

import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 Ejercicio 8
			Programa que realice las tareas siguientes:
			• Crear un vector de números enteros de un tamaño especificado por el usuario que estará
			  comprendido entre 10 y 200 elementos.
			• Llenar el vector con números aleatorios comprendidos entre -100 y 100.
			• Mostrar la suma de los números almacenados teniendo en cuenta que hay quien piensa que el
			  número 13 es el número de la mala suerte. Por tanto, si en alguna posición se encuentra
			  almacenado el número 13, no se sumará ni este número ni los que se encuentren almacenados en
			  las 13 posiciones siguientes (o las que haya hasta el final del vector si estas son menos de 13) si la
			  suma de todos ellos es distinta de 7.
			• Mostrar el contenido del vector y la cantidad de números que no se han sumado.
		 
		**/
		Scanner teclado= new Scanner(System.in);
		Random ran= new Random();
		int rango;
		System.out.println("Introduce el tamaño del vector entre 10 y 200");
		rango=teclado.nextInt();
		while(rango<10 || rango>200) {
			System.out.println("Error.Introduzca de nuevo el tamaño del vector entre 10 y 200");
			rango=teclado.nextInt();
		
		}
		int [] vector= new int [rango];
		for(int i=0;i<vector.length;i++) {
			int aleatorio=ran.nextInt(200)-99;
			vector[i]=aleatorio;
			
		}
		
		boolean encontrado=false;
		int suma=0;
		int nosuma=0;
		int contador=0;
		for(int i=0;i<vector.length;i++) {
			
			if(vector[i]==13) {
				contador++;
				for(int z=1;z<14 && (z+i)<vector.length;z++) {
				    
					nosuma+=vector[i+z];
					contador++;
				}
				if(nosuma==7){
					suma+=7;
					nosuma-=7;
					contador-=1;
					
						
				}

				i+=13;
			}
			else {
			
			suma+=vector[i];
			
			}
		}
		System.out.println("La suma de los números es: "+suma);
		System.out.println(Arrays.toString(vector));
		System.out.println("La cantidad de números no sumados es: "+contador);
	}

}
