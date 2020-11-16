package unidad4;


public class Matrices {

	public static void main(String[] args) {
		/*
		 	Ejercicio 18(2/2)
				Crea una clase Matrices que defina los métodos de clase siguientes:
				
				static int [][] cuadrada1(int dim)
				Crea una matriz cuadrada de la dimensión especificada en el parámetro dim, la rellena con los números
				enteros en el rango 1 .. dim*dim en el orden que se indica a continuación y la retorna:
												(ejemplo para una matriz cuadrada de dimensión 4)
																	1 5 9 13
																	2 6 10 14
																	3 7 11 15
																	4 8 12 16
																	
				static int [][] cuadrada2(int dim)
				Crea una matriz cuadrada de la dimensión especificada en el parámetro dim, la rellena con los números
				enteros en el rango 1 .. dim*dim en el orden que se indica a continuación y la retorna:
													(ejemplo para una matriz cuadrada de dimensión 4)
																	1 8 9 16
																	2 7 10 15
																	3 6 11 14
																	4 5 12 13
				
				static String [][] palindromos(int c, int f)
				Crea una matriz de f filas y c columnas y la rellene con palíndromos de tres letras que se generan de la
				forma siguiente:
				• La primera y tercera letra del palíndromo están determinadas el número de fila en la que se va a
				almacenar:
				fila 0 → letra ‘a’, fila 1 → letra ‘b’, fila 3→ letra ‘c’, …
				• La segunda letra del palíndromo está determinada por el valor de la suma fila+columna:
				fil+col=0 → letra ‘a’, fil+col=1 → letra ‘b’, fil+col=2 → letra ‘c’, …
				Una vez creada y rellenada, retornará la matriz.
				El número de filas y de columnas tiene que estar comprendido entre 1 y 26. De no ser así, el método
				retornará el valor null.
												(ejemplo para una matriz de 4x6)
													aaa aba aca ada aa aa
													bbb bcb bdb beb bfb bgb
													ccc cdc cec cfc cgc chc
													ddd ded dfd dgd dhd did
													
				static int max3x3sum(int [][] matriz)
				Recibe una matriz de NxM y retorna el valor máximo de todos los resultados que se obtienen sumando los
				elementos de cada matriz de 3x3 contenida en ella.
				El valor de N y M deber de ser mayor o igual que 3.
														(ejemplo para una matriz de dimensión 4x5)
																1 5 5 2 4
																2 1 4 14 3         = 75
																3 7 11 2 8
																4 8 12 16 4

		 **/

	}
	
	static int [][] cuadrada1(int dim){
		
		int[][]cuadrada=new int[dim][dim];
		int numero=0;
		for(int i=0;i<dim;i++) {
			for(int z=0;z<dim;z++) {
				numero+=1;
				cuadrada[i][z]=numero;
			}
		}

		return cuadrada;
	}
	
	static int [][] cuadrada2(int dim){
		
		int[][]cuadrada2=new int[dim][dim];
		int numero=0;
		for(int i=0;i<dim;i++) {
			if(i%2==0){
				for(int z=0;z<dim;z++) {
				  numero+=1;
				  cuadrada2[i][z]=numero;
				}
			}else {
				for(int j=dim-1;j>=0;j--) {
					numero+=1;
					cuadrada2[i][j]=numero;
				}
			}
		}
		return cuadrada2;
	}
		
	static void mostrarMatriz(int[][]matriz) {
		
		for(int i=0;i<matriz[0].length;i++) {
			for(int z=0;z<matriz.length;z++) {
				System.out.print(matriz[z][i]+" ");
			}System.out.println();
		}
		
	}
	
	static String [][] palindromos(int c, int f){
		
		String[][] matriz= new String[f][c];
		char letrac,letraf;
			for(int i=0;i<f;i++){
				for(int z=0;z<c;z++){
					letrac=(char)('a'+((i+z)%26));
					letraf=(char)('a'+i%26);
					 matriz[i][z]=String.valueOf(letraf)+String.valueOf(letrac)+String.valueOf(letraf);
					}
				}
			return matriz;
	}
	
	static void mostrarMatrizP(String[][]matriz) {
		if(matriz.length>26||matriz[0].length>26) {
			matriz=null;
			System.out.println(matriz);
		}else 
			for(int i=0;i<matriz.length;i++) {
				for(int z=0;z<matriz[i].length;z++) {
					System.out.print(matriz[i][z]+" ");
				}System.out.println();
			}
	}
	
	static Integer max3x3sum(int [][] matriz) {
		int max=0;
		int suma;
		if(matriz.length<3) {	
		return null;
		}for(int i=0;i<matriz.length;i++) {
			for(int z=0;z<matriz[i].length;z++) {
				suma=0;
				if(matriz[i].length<3) {
					return null;
				}
				for(int j=i;j<(i+3)&&j<matriz.length;j++){
					for(int k=z;k<(z+3)&&k<matriz[i].length;k++) {
						 suma+=matriz[j][k];
					}
				}if(suma>max) {
					max=suma;
				}		
			}
		}
	return max;
	}

}
