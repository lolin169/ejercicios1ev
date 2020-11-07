package unidad4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 Ejercicio 12
		  	Consideremos un vector de números enteros con índices entre 0 y n. Se define el centro del vector como el
			índice c que verifica la siguiente propiedad:
			
			Esta propiedad no siempre se verifica; en ese caso, decimos que el vector no tiene centro.
			Ejemplo, consideremos el siguiente vector:
			
			           
			           6 2 3 0 1
			           
			El centro de este vector es el índice 1. En efecto, si aplicamos la definición con c = 1 y con n = 4, obtenemos
			lo siguiente:
			
			
			Por el contrario, el siguiente vector no tiene centro:
			          
			          0 1 2 3
                      1 2 1 1
			
			Crear una clase que defina dos métodos:
				• Un método llamado centro que reciba como parámetro un vector de números enteros y retorne
				  el índice donde se encuentra su centro o null si no tiene centro.
				• Un método main que cree un vector de números enteros leídos por teclado y ponga a prueba el
				  método anterior.


		 **/
		
		Scanner teclado=new Scanner(System.in);
		int rango;
		do {
		System.out.println("Introduce el número de elementos del vector");
		rango= teclado.nextInt();
		}
		while(rango<0);
		int[] vector= new int[rango];
		for(int i=0;i<vector.length;i++){
			System.out.println("Introduce un número entero para rellenar el vector..");
			int numero= teclado.nextInt();
			vector[i]=numero;
		}
		
		int centro= centro(vector);
		if(centro == -1) {
			System.out.println("El vector no tiene centro.");
			
		}
		else {
		System.out.println("El centro del vector es:"+centro);
		}

		

	}
	
	//METODO PARA CALCULAR EL CENTRO
	static int centro(int []vector) {
		
		
		int operacion;
		int operacion2;
		for(int c=1;c<vector.length-1;c++) {
			operacion=0;
			operacion2=0;
			for(int i=0;i<c;i++) {
				operacion+=(c-i)*vector[i];
			}	
			for(int j=c+1;j<vector.length;j++) {
				operacion2+=(j-c)*vector[j];
			}	
			if(operacion==operacion2) {
				return c;
			}	
		
			
		}return-1;
		
		
	
	}

}
