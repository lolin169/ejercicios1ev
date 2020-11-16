package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaMatrices {
	
	static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		/*
		  Ejercicio 18(1/2)
		  				Pon a prueba los métodos de la clase Matrices.
		 **/
		System.out.print("Introduce la dimensión de la matriz cuadrada..");
		int dim=teclado.nextInt();
		int[][]cuadrada1= Matrices.cuadrada1(dim);
		int[][] cuadrada2= Matrices.cuadrada2(dim);
		Matrices.mostrarMatriz(cuadrada1);
		System.out.println("---------------------------------------\n"+"---------------------------------------");
		Matrices.mostrarMatriz(cuadrada2);
		System.out.println("---------------------------------------\n"+"---------------------------------------");
        String[][] palindromo=Matrices.palindromos(27, 27);
        String[][]palindromo2=Matrices.palindromos(6, 4);
		Matrices.mostrarMatrizP(palindromo);
		System.out.println("---------------------------------------\n"+"---------------------------------------");
		Matrices.mostrarMatrizP(palindromo2);
		System.out.println("---------------------------------------\n"+"---------------------------------------");
		int[][]matriznull={	{3,7,11,2,8},
						    {4,8,12,16,4} };

		int[][]matriz={	{1,5,5,2,4},
			            {2,1,4,14,3},        
						{3,7,11,2,8},
						{4,8,12,16,4} };
				
		System.out.println(Matrices.max3x3sum(matriznull));
		System.out.println("---------------------------------------\n"+"---------------------------------------");
		System.out.println(Matrices.max3x3sum(matriz));
		
		
		
	}



}
