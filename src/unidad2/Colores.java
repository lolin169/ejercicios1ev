package unidad2;

import java.util.*;

public class Colores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 6. En el método main de una clase Java llamada Sueldo escribe un programa que
permita convertir las componentes de un color en el espacio RGB en sus
componentes en el espacio YIQ, según las expresiones matemáticas siguientes:
y=0,299r+0,587 g+0,114 b
i=0,596 r−0,275 g−0,321b
q=0,212 r−0,528 g+0,311b
Se le pedirá al usuario que introduzca por teclado las componentes rgb (rojo,
verde y azul).**/
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Conversor de Colores de RGB a YIQ");
		
	    System.out.print("Introduzca el valor de R");
	    float r= teclado.nextFloat();
	    
	    System.out.print("Introduzca el valor de G");
	    float g= teclado.nextFloat();
	    
	    System.out.print("Introduzca el valor de B");
	    float b= teclado.nextFloat();
	    
	    float y= (0.299f*r) + (0.587f*g) + (0.114f*b);
	    float i= (0.596f*r) - (0.275f*g) - (0.321f*b);
	    float q= (0.212f*r) - (0.528f*g) + (0.311f*b); 
	    
	    System.out.printf("El resultado en YIQ es:%.3f, %.3f, %.3f",y, i, q);
	    
	    
	    

	}

}
