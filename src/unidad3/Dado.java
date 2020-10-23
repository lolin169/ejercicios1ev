package unidad3;

import java.util.*;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  10.En el método main de una clase llamada Dado escribe un programa que simule
			el lanzamiento de un dado N veces, siendo N un número entero que se
			introducirá por teclado. El programa finalizará mostrando en la pantalla cuantas
			veces salió cada una de las caras.
		 **/
		
		Scanner teclado= new Scanner(System.in);
		Random ran= new Random();
		int aleatorio;
		int N1=0;
		int N2=0;
		int N3=0;
		int N4=0;
		int N5=0;
		int N6=0;

		System.out.println("Bienvenido al juego del Dado. Introduce un número de tiradas");
		int tiradas=teclado.nextInt();
	
		while(tiradas<=0) {
			System.out.println("Error. Elija un número mayor a 0..");
			tiradas=teclado.nextInt();
		}
		
		for(int i=tiradas;tiradas>0;tiradas--){
			
			aleatorio= ran.nextInt(6)+1;
			switch(aleatorio) {
		
		     case 1:
		    	 N1++;
		    	 break;
			
		     case 2:
		    	 N2++;
		    	 break;
			
		     case 3:
		    	 N3++;
		    	 break;
			
		     case 4:
		    	 N4++;
		    	 break;
		    
		     case 5:
		    	 N5++;
		    	 break;
			
		     case 6:
		    	 N6++;
		    	 break;
		         

			}
			
		}
	    	 
	 		System.out.println("El 1 ha salido:"+N1+" veces.");
			System.out.println("El 2 ha salido:"+N2+" veces.");
			System.out.println("El 3 ha salido:"+N3+" veces.");
			System.out.println("El 4 ha salido:"+N4+" veces.");
			System.out.println("El 5 ha salido:"+N5+" veces.");
			System.out.println("El 6 ha salido:"+N6+" veces.");
	    


		

 
		
		
}

}
