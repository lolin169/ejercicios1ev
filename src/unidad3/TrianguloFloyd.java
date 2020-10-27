package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 9. En el método main de una clase llamada TrianguloFloyd escribe un programa
		que genere él triangulo de Floyd para un número de filas que introduciremos
		por teclado y lo muestre por pantalla. Por ejemplo, si el número de filas es 4 el
		triángulo de Floyd será:
		1
		2 3
		4 5 6
		7 8 9 10
		 **/
		Scanner teclado= new Scanner(System.in);
		System.out.println("Bienvenido al triángulo de FLoyd.Introduzca el número de filas deseado..");
		int filas= teclado.nextInt();
		int contador=0;
		
		while(filas<=0){
			
			System.out.println("Error, el número ha de ser mayor que cero.Introduce de nuevo un número mayor que cero..");
			filas=teclado.nextInt();
		}
		
		for (int i=1;i<=filas;i++) {
			 
			for(int j=1;j<=i;j++) {
				contador++;
				System.out.print(contador+" ");
				
			}
			System.out.println("");
		}

	}

}
