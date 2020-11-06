package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 Ejercicio 10
			Programa que realice las tareas siguientes:
				• Crear un vector de números enteros de un tamaño especificado por el usuario que esté
				  comprendido entre 10 y 20 elementos.
				• Llenar el vector con números aleatorios.
				• Mostrar el contenido del vector.
				• Mostrar la mínima diferencia entre dos valores adyacentes. La diferencia entre dos valores
				  adyacentes se calcula como el valor almacenado en cada posición [i] (excepto la primera) menos el
				  valor almacenado en la posición [i-1].
		 **/
		
		
		Scanner teclado= new Scanner(System.in);
        Random ran= new Random();
        System.out.println("Introduzca un número entre del 10 al 20");
        int rango= teclado.nextInt();
        while(rango<10 || rango>20) {
            System.out.println("Error.Introduzca un número entre del 10 al 20");
            rango= teclado.nextInt();	
        	
        }
        int[] vector= new int[rango];
        int aleatorio;
        for(int i=0;i<rango;i++) {
        	
        	aleatorio=ran.nextInt();
        	vector[i]=aleatorio;
        }
        System.out.println(Arrays.toString(vector));
        
        int min=vector[1]-vector[0];
        int dif=0;
        for(int z=1;z<rango;z++) {
        	dif=vector[z]-vector[z-1];
        	dif=Math.abs(dif);
        	if(dif<=min) {
        		min=dif;
        	}
        	
        }
        System.out.println("La diferencia menor entre dos elementos adyacentes es: "+min);
   }
}
