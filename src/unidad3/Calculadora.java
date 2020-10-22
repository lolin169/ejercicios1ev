package unidad3;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. En el m�todo main de una clase llamada Calculadora escribe un programa que
		 * funcione como una calculadora. El usuario tendr� que elegir con el teclado la
		 * operaci�n que desea realizar (suma, resta, multiplicaci�n o divisi�n) o salir
		 * del programa. Si elige una operaci�n, se pedir�n por teclado dos n�meros y a
		 * continuaci�n se mostrar� el resultado de la operaci�n con el formato n�mero1
		 * op n�mero2 = resultado, donde op ser� el s�mbolo que corresponda: +, -, x, /.
		 * Cada vez que se muestre resultado, el usuario podr� volver a elegir otra
		 * operaci�n o salir.
		 * 
		 **/

		Scanner teclado = new Scanner(System.in);
		char accion;

		do {
			System.out.println(
					"Bienvenido a la Calculadora.Introduzca las opciones: 1/Sumar;2/Restar;3/Multipicar;4/Dividir;5/Salir.");
			int opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Sumar");
				System.out.print("Introduzca el primer n�mero de la suma..");
				int suma1 = teclado.nextInt();
				System.out.print("Introduzca el segundo n�mero de la suma..");
				int suma2 = teclado.nextInt();
				System.out.println("El resultado de sumar " + suma1 + "+" + suma2 + "=" + (suma1 + suma2));
				break;

			case 2:

				System.out.println("Restar");
				System.out.print("Introduzca el primer n�mero de la resta..");
				int resta1 = teclado.nextInt();
				System.out.print("Introduzca el segundo n�mero de la resta..");
				int resta2 = teclado.nextInt();
				System.out.println("El resultado de restar " + resta1 + "-" + resta2 + "=" + (resta1 - resta2));
				break;

			case 3:

				System.out.println("Multiplicar");
				System.out.print("Introduzca el primer n�mero de la multiplicaci�n..");
				int mul1 = teclado.nextInt();
				System.out.print("Introduzca el segundo n�mero de la multiplicaci�n..");
				int mul2 = teclado.nextInt();
				System.out.println("El resultado de multiplicar " + mul1 + "x" + mul2 + "=" + (mul1 * mul2));
				break;

			case 4:

				System.out.println("Dividir");
				System.out.print("Introduzca el primer n�mero de la divisi�n..");
				int div1 = teclado.nextInt();
				System.out.print("Introduzca el segundo n�mero de la divisi�n..");
				int div2 = teclado.nextInt();
				System.out.println("El resultado de dividir " + div1 + ":" + div2 + "=" + (div1 / div2));
				break;

			case 5:

				System.out.println("Fin del programa");
				break;
			}

			System.out.println("Repetimos o Salimos?� r o s");

			accion = teclado.next().charAt(0);
		} while (accion == 'r');
		{
		}

	}
}
