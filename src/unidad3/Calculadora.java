package unidad3;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  6. En el método main de una clase llamada Calculadora escribe un programa que
		 funcione como una calculadora. El usuario tendrá que elegir con el teclado la
		 operación que desea realizar (suma, resta, multiplicación o división) o salir del
		 programa. Si elige una operación, se pedirán por teclado dos números y a
		 continuación se mostrará el resultado de la operación con el formato número1
		 op número2 = resultado, donde op será el símbolo que corresponda: +, -, x, /.
         Cada vez que se muestre resultado, el usuario podrá volver a elegir otra
         operación o salir

		 
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
				System.out.print("Introduzca el primer número de la suma..");
				int suma1 = teclado.nextInt();
				System.out.print("Introduzca el segundo número de la suma..");
				int suma2 = teclado.nextInt();
				System.out.println("El resultado de sumar " + suma1 + "+" + suma2 + "=" + (suma1 + suma2));
				break;

			case 2:

				System.out.println("Restar");
				System.out.print("Introduzca el primer número de la resta..");
				int resta1 = teclado.nextInt();
				System.out.print("Introduzca el segundo número de la resta..");
				int resta2 = teclado.nextInt();
				System.out.println("El resultado de restar " + resta1 + "-" + resta2 + "=" + (resta1 - resta2));
				break;

			case 3:

				System.out.println("Multiplicar");
				System.out.print("Introduzca el primer número de la multiplicación..");
				int mul1 = teclado.nextInt();
				System.out.print("Introduzca el segundo número de la multiplicación..");
				int mul2 = teclado.nextInt();
				System.out.println("El resultado de multiplicar " + mul1 + "x" + mul2 + "=" + (mul1 * mul2));
				break;

			case 4:

				System.out.println("Dividir");
				System.out.print("Introduzca el primer número de la división..");
				int div1 = teclado.nextInt();
				System.out.print("Introduzca el segundo número de la división..");
				int div2 = teclado.nextInt();
				System.out.println("El resultado de dividir " + div1 + ":" + div2 + "=" + (div1 / div2));
				break;

			case 5:

				System.out.println("Fin del programa");
				break;
			}

			System.out.println("Repetimos o Salimos?¿ r o s");

		  accion = teclado.next().charAt(0);
		} while (accion == 'r');
		{
		}

	}
}
