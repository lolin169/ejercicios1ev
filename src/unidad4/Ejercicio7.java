package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 Ejercicio 7
			Programa que realice las tareas siguientes:
				• Crear un vector de números enteros de un tamaño especificado por el usuario entre 10 y 1.000.000
				de elementos.
				• Llenar el vector con números aleatorios comprendidos entre -999.999 y 1.000.000 sin repetir
				ninguno.
				• Mostrar en la consola los datos siguientes:
					o Tamaño del vector.
					o Tiempo empleado en llenarlo
					o Diferencia entre el menor y el mayor de los números almacenados en el vector.
					o Tiempo empleado en calcular la diferencia entre el menor y el mayor de los números
					almacenados.
		 
		**/

		Scanner teclado= new Scanner(System.in);
		int rango;
		double templeado=0;
		double templeado2=0;
		do {
			System.out.println("Introduce el tamaño del vector entre 10 y 1.000.000.. ");
	        rango= teclado.nextInt();
		}
		while(rango<10 || rango>1000000);
		
		int [] vector= new int[rango];
		int aleatorio;
		boolean repetido=false;
		double t0= System.currentTimeMillis();
		for(int i=0;i<vector.length;i++) {
			aleatorio=(int)Math.floor(Math.random()*2000000-999999);
			for(int j:vector) {
				
				if(aleatorio==j) {
					repetido=true;
				}
			}	
				if (repetido==true) {
					i--;
				}else {
					vector[i]=aleatorio;
				}
			

		}
		double t1= System.currentTimeMillis();
		templeado=  t1-t0;
		
		int menor=0;
		int mayor=0;
		t0=System.currentTimeMillis();
		for(int z=0;z<vector.length;z++) {
			if(vector[z]<menor) {
				menor=vector[z];
			}else if(vector[z]>mayor){
				mayor=vector[z];
				
			}
		}
		t1=System.currentTimeMillis();
		templeado2= t1-t0;
			
		System.out.println("El tamaño del vector es: "+vector.length);
		System.out.println("El tiempo empleado en llenarlo ha sido: "+templeado+" nanosegundos(segundos/1000000)");
		System.out.println("El número mayor de todos en la matriz es: "+mayor+" y el menor: "+menor);
		System.out.println("El tiempo empleado en buscarlos ha sido: "+templeado2+" nanosegundos(segundos/1000000)");
	}	
	
}
