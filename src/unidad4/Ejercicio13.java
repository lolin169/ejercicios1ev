package unidad4;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 Ejercicio 13
			Programa que cree una matriz de números enteros aleatorios con un número de filas y de columnas
			aleatorios que estén comprendidos entre 2 y 20.
			Escribir un método que reciba una matriz de números enteros y retorne un vector que contenga la suma de
			los valores de cada fila.
			Escribir otro método que reciba una matriz de números enteros y retorne un vector que contenga la suma
			de los valores de cada columna.
			Mostrar en la consola la matriz, la suma de las filas a su derecha y la suma de las columnas en la parte
			inferior.
		 **/
		
		Random ran= new Random ();
        Scanner teclado= new Scanner(System.in);
        int filas= ran.nextInt(19)+2;
        int columnas= ran.nextInt(19)+2;
        int numero;
        int [][] vector= new int [filas][columnas];
        for(int i=0;i<filas;i++) {
        	for(int z=0;z<columnas;z++) {
        		numero=ran.nextInt();
        		vector[i][z]=numero;
        	}
        }
        
        //Creamos vector filas y columnas e imprimimos todos los resultados
        int []fila= filas(vector);
        int []columna= columnas(vector);
   
        for(int i=0;i<vector.length;i++) {
        	 System.out.print("[");
        	for(int z=0;z<vector[0].length;z++) {
        		
        		System.out.print(vector[i][z]+" ");
        	}System.out.println("].La suma de la fila es:"+fila[i]);
        }
        System.out.println("                           La suma de cada columna:                                                 ");
        System.out.print("[");
        for(int z=0;z<vector[0].length;z++) {
     	
        	System.out.print(columna[z]+" ");
        	
        }System.out.println("]");
          
	}
	
	//metodo para sumar las filas
	static int []filas(int [][]matriz) {
		
		int[] suma= new int[matriz.length];
		for(int i=0;i<matriz.length;i++){
			for(int z=0;z<matriz[0].length;z++) {
				suma[i]+=matriz[i][z];
			}
		}
		return suma; 
	}
	
	//metodo para sumar las columnas
	static int []columnas(int [][]matriz) {
		
		int[] suma= new int[matriz[0].length];
		for(int i=0;i<matriz[0].length;i++){
			for(int z=0;z<matriz.length;z++) {
				suma[i]+=matriz[z][i];
			}
		}
		return suma; 
	}

}
