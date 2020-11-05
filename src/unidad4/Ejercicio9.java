package unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 Ejercicio 9
			Programa que realice las tareas siguientes:
				• Crear un vector de números enteros de un tamaño aleatorio entre 10 y 500 elementos.
				• Llenar el vector con números aleatorios comprendidos entre -100 y 100.
				• Mostrar el contenido del vector si su tamaño es menor o igual a 50.
				• Mostrar, independientemente del tamaño del vector, el número de secuencias de números
				  repetidos. 
		 **/

		Random ran= new Random();
		int rango= ran.nextInt(490)+10;
		int [] vector= new int [rango];
		int aleatorio;
		for(int i=0;i<vector.length;i++) {
			aleatorio=ran.nextInt(200)-99;
			vector[i]=aleatorio;
		}
		if(vector.length<=50) {
		System.out.println(Arrays.toString(vector));
		}
		
		boolean cadena=false;
		int repetido=0;
		int contador=0;
		int numero=0;
		for(int i=1; i<vector.length;i++) {
			   if(vector[i]==vector[i-1]) {
				   System.out.println(vector[i-1]+" , "+vector[i]);
				   if(!cadena) {
				   contador++;
				   cadena=true;
				   }
				   else {}
			   }
			   else {
				   cadena=false;
			   }
			
		}
		System.out.println("El numero de cadenas de números repetidos es:"+contador);
		
	}

}
