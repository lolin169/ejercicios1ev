package unidad3;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    /*
	    7. En el m�todo main de una clase llamada AdivinaNumero escribe un programa
        para jugar a un juego de adivinaci�n. El juego consiste en que el ordenador
        genera un n�mero aleatorio entre 1 y N, ambos incluidos, siendo N un n�mero
        entero mayor o igual que 1.000 y menor o igual que 100.000, que tambi�n
		elegir� de forma aleatoria. Una vez elegidos, el ordenador mostrar� el mensaje
		�He pensado un n�mero entre 1 y N, adivina cu�l es: �. El usuario tendr� que
		introducir n�meros hasta que acierte el que ha pensado el ordenador. Cada vez
		que introduzca un n�mero y no acierte el ordenador le dir� si es mayor o menor
		que el que ha pensado y le volver� a preguntar 
	    **/
		
		Random ran= new Random();
		
		System.out.println("Bienvenido al juego de adivinar un n�mero que ha pensado �sta computadora");
		Scanner teclado= new Scanner(System.in);
		int N=1000 + ran.nextInt(99000);
		int aleatorio=ran.nextInt(N)+1;
		System.out.println("El rango del n�mero que has de calcular est� entre 1 y "+N);
		System.out.println("Introduce un n�mero");	
        int numero = teclado.nextInt();
        int contador=1;
		     do {
		    	  if(numero>aleatorio) {
				 	  System.out.print("El n�mero es MENOR.Dime otro..(1-"+N+")");
					  numero=teclado.nextInt();
		    	  }
		    	  else {
					  System.out.print("El n�mero es MAYOR.Dime otro..(1-"+N+")");
					  numero=teclado.nextInt();
		    	  }
                contador ++;
			  }

		
	
		while(numero!=aleatorio); {
		
			
			System.out.println("El n�mero es Correcto:"+aleatorio+" .Lo has conseguido en: "+contador+" intentos.");
		
		}
			
			
		
	}
	
	}	
			
		
	

	

