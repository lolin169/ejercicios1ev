package unidad3;
import java.util.*;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 3. En el m�todo main de una clase llamada Bisiesto escribe un programa que
         utilizando una �nica expresi�n l�gica determine si un a�o es o no es bisiesto. El
         a�o se introducir� por teclado y el resultado lo mostrar� en la pantalla. Un a�o
         es bisiesto si es m�ltiplo de 4. Los a�os m�ltiplos de 100 no son bisiestos, salvo
         si son m�ltiplos de 400.

		 **/
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba un a�o");
		int a�o= teclado.nextInt();
		if(a�o%4==0 && a�o%400==0 ^ a�o%100!=0) {
			
			System.out.println("El a�o es BISIESTO (a�o "+a�o+")");
		}

		else {System.out.println("El a�o NO"+ " es bisiesto (a�o "+a�o+")");}
	}

}
