package unidad2;

import java.util.*;

public class Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 5. En el m�todo main de una clase Java llamada Sueldo escribe un programa que
resuelva el problema siguiente: un vendedor recibe un sueldo base m�s un 10%
extra por comisi�n de sus ventas; el vendedor desea saber cu�nto dinero
obtendr� por concepto de comisiones, por las tres ventas que realiza en el mes
y el total que recibir� en el mes, teniendo en cuenta su sueldo base y las
comisiones. Se utilizar� el teclado para la entrada de datos y la consola para la
salida. Para resolver este problema est� permitido utilizar la clase Scanner.**/

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escriba su sueldo base:");
		float sbase= teclado.nextFloat();
		System.out.print("Escriba el total de la primera venta del mes:");
		float venta1= teclado.nextFloat();
		venta1= venta1*0.1f;
		System.out.print("Escriba el total de la segunda venta del mes:");
		float venta2= teclado.nextFloat();
		venta2=venta2*0.1f;
		System.out.print("Por �ltimo, escriba el total de la tercera venta:");
		float venta3= teclado.nextFloat();
		venta3=venta3*0.1f;
		
		float n�mina= sbase+venta1+venta2+venta3;
		
		
		System.out.println("Su sueldo este mes ser� de: "+n�mina+" �uros.");
		
		
		

	}

}
