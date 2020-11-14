package unidad4;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		  Ejercicio 16
			Crear una clase llamada MétodosOrdenación que defina tres métodos estáticos para ordenar vectores
			de números enteros implementando la ordenación por inserción directa, por selección directa y por
			intercambio directo respectivamente.


		 **/
		
		int[] vector= {4,5,6,3,2,6};
        int []ordenado= Arrays.copyOf(vector, vector.length);
        int[] ordenado2= Arrays.copyOf(vector,vector.length);
        int[] ordenado3= Arrays.copyOf(vector,vector.length);
        System.out.println("Vector Original de prueba:   "+Arrays.toString(vector));
        System.out.println("Ordenado por Inserción:      "+Arrays.toString(OrdenacionporInsercion(ordenado)));
        System.out.println("Ordenado por Selección:      "+Arrays.toString(OrdenacionporSeleccion(ordenado2)));
        System.out.println("Ordenado por Intercambio:    "+Arrays.toString(OrdenacionporIntercambio(ordenado3)));
        
        
	}
	
	static int[]  OrdenacionporInsercion(int[]ordenado){

			int aux,pos;
			for(int i=1;i<ordenado.length;i++) {
			aux=ordenado[i];
			pos=i;
			for(int z=(pos-1);z>=0 && aux<ordenado[z];z--) {
				ordenado[z+1]=ordenado[z];
				ordenado[z]=aux;
			}
		}
			return ordenado;
	
	}
	
	static int[] OrdenacionporSeleccion(int []ordenado2) {

		int min,pos=0;
		for(int i=0;i<ordenado2.length;i++) {
           min=ordenado2[i];
           for(int z=i+1;z<ordenado2.length;z++) {
        	   if(min>ordenado2[z]) {
        		   min=ordenado2[z];
        		   ordenado2[z]=ordenado2[i];
        		   ordenado2[i]=min;
        	   }
           }
		}
		return ordenado2;
	}
	
	
	
	static int[] OrdenacionporIntercambio(int[] ordenado3) {
		int aux;
		for(int i=0;i<ordenado3.length-1;i++) {
			for(int z=0;z<ordenado3.length-1;z++) {
				if(ordenado3[z]>ordenado3[z+1]) {
					aux=ordenado3[z];
					ordenado3[z]=ordenado3[z+1];
					ordenado3[z+1]=aux;
				}
				
			}
		}
		
	 return ordenado3;	
	}
}
