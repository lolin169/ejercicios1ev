package unidad4;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
	/*
	 Ejercicio 6
		Programa que realice las tareas siguientes:
		• Crear un vector de números enteros de un tamaño aleatorio comprendido entre 10 y 50 elementos.
		• Llenar el vector con números aleatorios comprendidos entre -100 y 100 sin repetir ninguno.
		• Crear un segundo vector que contenga los elementos del anterior almacenados en orden inverso.
		• Mostrar ambos vectores en la consola.
	 **/
        int rango=(int)Math.floor(Math.random()*40+10);
		int [] vector= new int[rango];
		int aleatorio;
	
		System.out.println(vector.length);
		for (int i=0; i<vector.length;i++) {
			
			aleatorio= (int)Math.floor(Math.random()*198-99);
			boolean nuevo=true;
		       
			for(int j:vector) {
			       
				if(j==aleatorio) {
             	  nuevo=false;
             	}
			}
			if(nuevo==false) {
             	  i--; 	
            }else {
            	  vector[i]=aleatorio;
            
          	}
			
		}
		
		int[] vector2= new int[rango];
		int b=0;
		
		for(int a=vector.length-1;a>=0;a--) {
			
			vector2[b]=vector[a];
			b++;
			
		}
		
		System.out.println(Arrays.toString(vector));
		System.out.println(Arrays.toString(vector2));
			
		     		
		
		
	}
		
		
}


