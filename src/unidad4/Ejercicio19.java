package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
	static Scanner teclado= new Scanner(System.in);
	public static void main(String[] args) {
		/*
		  Ejercicio 19
			Definir un método rellenar que declare los parámetros formales siguientes:
			• Matriz de caracteres en la que se almacenan letras minúsculas y dígitos numéricos (a-z, 0-9).
			• Un índice de fila al que llamaremos filaInicial.
			• Un índice de columna al que llamaremos columnaInicial.
			• Un carácter de relleno al que llamaremos caracterRelleno.
			
			El método tendrá que realizar la tarea siguiente:
				Comenzando en la posición [filaInicial][columnaInicial] de la matriz, donde se encuentra el
				carácter que llamaremos caracterInicial, se sustituirá por el caracterRelleno todo carácter de la
				matriz que cumpla las condiciones siguientes:
					• Es igual a caracterInicial.
					• Se puede llegar a él desde la posición [filaInicial][columnaInicial] con movimientos simples del tipo:
						o desplazarse 1 fila arriba
						o desplazarse 1 fila abajo
						o desplazarse 1 columna a la izquierda
						o desplazarse 1 columna a la derecha atravesando únicamente celdas que contengan el caracterInicial.
			En definitiva, se trata de realizar algo similar a lo que hacen algunos programas de dibujo cuando utilizamos
			la herramienta de relleno, pero en lugar de rellenar con un color una región de un bitmap, rellenamos con
			un carácter una región de una matriz.
			Para poner a prueba el método se ha de crear un programa que lea de la entrada estándar los datos
			necesarios para crear la matriz de caracteres original y los parámetros de relleno según las especificaciones
			siguientes:
				• En la primera línea el usuario escribirá dos números enteros, F y C, que representarán el número de
				filas y de columnas de la matriz.
				• En cada una de las siguientes F líneas introducirá una cadena de longitud C que contendrá los
				caracteres que se guardaran en cada una de las F filas de la matriz respectivamente.
				• En la línea siguiente introducirá el carácter de relleno.
				• En las dos últimas filas introducirá el valor para los índices de fila y columna de la posición inicial
				dentro de la matriz a partir de la cual se ha de realizar el relleno.
			Una vez leídos los datos de entrada y creada la matriz, la mostrará por pantalla, invocará al método de
			relleno con los parámetros correspondientes y finalmente volverá a mostrar la matriz para ver el resultado
			del relleno.
		 **/
		
		
		System.out.println("Escriba dos números separados por espacios, el primero para las filas y el segundo para las columnas de la matriz a crear: ");
		int filas=teclado.nextInt();
		int columnas=teclado.nextInt();
		teclado.nextLine();
		char[][] matriz= crearMatriz(filas,columnas);
		mostrarArray(matriz);
		System.out.println("-----------------------------\n"+"-----------------------------");
		char charrelleno;
		char[][]matrizsustituida= copiarArray(matriz);
		int filaInicial, columnaInicial;
		System.out.println("Introduzca el carácter de relleno..");
		charrelleno=teclado.next().charAt(0);
		System.out.println("Ahora la fila dónde se ha de empezar a sustituir el carácter..");
		filaInicial= teclado.nextInt()-1;
		System.out.println("Por último, la columna para sustituir el carácter..");
		columnaInicial=teclado.nextInt()-1;
		rellenar(matrizsustituida,filaInicial,columnaInicial,charrelleno);
		System.out.println("-----------------------------\n"+"-----------------------------");
		mostrarArray(matrizsustituida); 
		

	}

	
	static char [][] crearMatriz(int filas, int columnas ){
		char [][]matriz= new char [filas][columnas];
		String fila;
		for (int i=0;i<filas;i++) {
		  char[] unafila=new char[columnas];
		  do { System.out.println("Introduce "+columnas+" caracteres para rellenar la fila "+(i+1));
		  fila= teclado.nextLine();}
		  while(fila.length()!=columnas);//para protegernos de un posible error al introducir los datos y pasarnos de rango en el array.
		  for(int z=0;z<fila.length();z++) {
			  fila.getChars(z, z+1, unafila,z);
			  //Arrays.fill(unafila,z,z+1,fila.charAt(z));
			  matriz[i]=unafila;
			} 
		}
		return matriz;
		}
	
	static char[][] copiarArray(char[][]Array) {
		char [][] copia= new char [Array.length][];
		for(int i=0;i<Array.length;i++)
			copia[i]=Arrays.copyOf(Array[i], Array[i].length);
	return copia;	
	}
	
	static void mostrarArray(char[][]matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int z=0;z<matriz[i].length;z++) {
				System.out.print(matriz[i][z]+" ");
			}System.out.println();
		}
	}
	
	static void  rellenar(char[][] matriz,int filaInicial, int columnaInicial,char caracterRelleno) {
		char caracterInicial= matriz[filaInicial][columnaInicial];
		matriz[filaInicial][columnaInicial]=caracterRelleno;
        
		if(((filaInicial+1)<matriz.length)&&matriz[filaInicial+1][columnaInicial]==caracterInicial) {
			rellenar(matriz,filaInicial+1,columnaInicial,caracterRelleno);	
		}
		if(((filaInicial-1)>=0)&&matriz[filaInicial-1][columnaInicial]==caracterInicial) {
			rellenar(matriz,filaInicial-1,columnaInicial,caracterRelleno);	
		}
		if(((columnaInicial+1)<matriz[filaInicial].length)&&matriz[filaInicial][columnaInicial+1]==caracterInicial) {
			rellenar(matriz,filaInicial,columnaInicial+1,caracterRelleno);	
		}
		if(((columnaInicial-1)>=0)&&matriz[filaInicial][columnaInicial-1]==caracterInicial) {
			rellenar(matriz,filaInicial,columnaInicial-1,caracterRelleno);	
		}
	}
	
}


