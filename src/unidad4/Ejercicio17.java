package unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio17 {
	
	static Random ran= new Random();

	public static void main(String[] args) {
		/*
		 	Ejercicio 17
				Programa que cree dos vectores de números enteros, cada uno de ellos de una longitud aleatoria entre 10
				y 100, los rellene con valores aleatorios, los ordene, los mezcle en un tercer vector manteniendo la
				ordenación y finalmente muestre el contenido de los tres vectores
		 **/
		 
		int[] vectora= crearVectorAleatorio();
		int[] vectorb= crearVectorAleatorio();
		
		OrdenaVectores(vectora);
		OrdenaVectores(vectorb);
		int[] vectore=MezclaVectores(vectora, vectorb);
		System.out.println(Arrays.toString(vectore));

	}

	
	
	static int[] crearVectorAleatorio() {
		
		int rango= ran.nextInt(90)+10;
		int[]vector= new int[rango];
		for(int i=0;i<rango;i++) {
			vector[i]=ran.nextInt();
		}
		return vector;
	}
	
	
	static void OrdenaVectores(int[]vector) {
		
		//Sería directo el ordenamiento de esta manera: Arrays.sort(vector);
		int aux;
		for(int i=0;i<vector.length-1;i++) {
			for(int z=0;z<vector.length-1;z++){
				if(vector[z]>vector[z+1]) {
					aux=vector[z];
					vector[z]=vector[z+1];
					vector[z+1]=aux;
				}
			}
		}
	   System.out.println(Arrays.toString(vector));
	}
	
	
	static int [] MezclaVectores(int[] vector,int []vector2) {
		
		int rango=(vector.length+vector2.length);
		int[]vector3=new int[rango];
		int z=0,i=0;
		    for(int j=0;j<rango;j++){
		    	if(i<vector.length&&z<vector2.length) {
		    	   if(vector[i]<=vector2[z]){
		    		vector3[j]=vector[i];
		    		i++;
		    	   }else{
					vector3[j]=vector2[z];
					z++;
		    	   }
		    	}else if(z==vector2.length) {
		    		   vector3[j]=vector[i];
		    		   i++;
		    	}else {
		    			vector3[j]=vector2[z];
		    			z++;
		    	}
			}
		    
		return vector3;
	}
	
}
