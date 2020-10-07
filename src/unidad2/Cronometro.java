package unidad2;

import java.io.*;
import java.lang.*;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("Introduzca su nombre:");
		double t1= System.currentTimeMillis();
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		String nombre= in.readLine();
		double t2= System.currentTimeMillis();
		System.out.printf("Hola %s, has tardado %.3f segundos en decirme tu nombre",nombre,(t2-t1)/1000);
		

		
		

	}

	private static double  currentTimemillis() {
		// TODO Auto-generated method stub
		return 0;
	}

}
