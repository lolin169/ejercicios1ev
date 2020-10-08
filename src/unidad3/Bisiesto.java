package unidad3;
import java.util.*;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 3. En el método main de una clase llamada Bisiesto escribe un programa que
         utilizando una única expresión lógica determine si un año es o no es bisiesto. El
         año se introducirá por teclado y el resultado lo mostrará en la pantalla. Un año
         es bisiesto si es múltiplo de 4. Los años múltiplos de 100 no son bisiestos, salvo
         si son múltiplos de 400.

		 **/
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba un año");
		int año= teclado.nextInt();
		if(año%4==0 && año%400==0 ^ año%100!=0) {
			
			System.out.println("El año es BISIESTO (año "+año+")");
		}

		else {System.out.println("El año NO"+ " es bisiesto (año "+año+")");}
	}

}
