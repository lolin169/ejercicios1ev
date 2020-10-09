package unidad3;

import java.util.*;

public class Tri�ngulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
        En el m�todo main de una clase llamada Tri�ngulo escribe un programa que
        determine si tres n�meros reales que se introducen por teclado pueden ser las
        longitudes de los lados de un tri�ngulo. Si la respuesta es afirmativa, tendr� que
        responder a las preguntas siguientes:
        � �Es escaleno?
        � �Es equil�tero?
        � �Es is�sceles? 
 **/

		System.out.println("Programa para verificar el TIPO de tri�ngulo que obtendremos a partir de 3 n�meros reales de tipo entero");
		Scanner teclado= new Scanner (System.in);
		System.out.println("Escriba el primer n�mero:..");
		int num1= teclado.nextInt();
		System.out.println("Escriba el segundo n�mero:..");
		int num2= teclado.nextInt();
		System.out.println("Escriba el tercer n�mero:..");
		int num3= teclado.nextInt();
		
		
		while(num1==0 || num2==0 || num3==0) {
			
			System.out.println("Error, se vuelve a iniciar el programa..");
			System.out.println("Escriba el primer n�mero:..");
			 num1= teclado.nextInt();
			System.out.println("Escriba el segundo n�mero:..");
			 num2= teclado.nextInt();
			System.out.println("Escriba el tercer n�mero:..");
			 num3= teclado.nextInt();
			
		}
		
		if(num1/num2==1 && num3/num1==1) {
			
			System.out.println("El tri�ngulo es EQUIL�TERO.");
		
		}
		
		else if (num1!=num2 && num1!=num3 && num2!=num3){
			
			System.out.println("El tri�ngulo es ESCALENO.");
			
		}
		
		else {
			
			System.out.println("El tri�ngulo es IS�SCELES.");
			
		}
		

		

			
			
			
		
		
		
	}

}
