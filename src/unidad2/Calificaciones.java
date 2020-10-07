package unidad2;

import java.io.*;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		/* 4. En el m�todo main de una clase Java llamada Calificaciones escribe un
programa que resuelva el problema siguiente: un estudiante desea saber cu�l
ser� su promedio general en las tres materias que cursa y cu�l ser� el promedio
que obtendr� en cada una de ellas. Los criterios de calificaci�n se establecen en
la tabla siguiente:
MATEM�TICAS
EXAMEN: 90%
TAREAS: 10%
N� DE TAREAS REALIZADAS 3

F�SICA
EXAMEN:80%
TAREAS: 20%
N� DE TAREAS REALIZADAS: 2

QU�MICA
EXAMEN:85%
TAREAS: 15%
N� DE TAREAS REALIZADAS: 3

Los datos de entrada (calificaci�n del examen y calificaciones de cada una de
las tareas realizadas) se introducir�n por teclado y los datos de salida (los
promedios de cada asignatura y el promedio de las tres) se mostrar�n en la
consola con una precisi�n de dos decimales. Resolver el problema sin utilizar la
clase Scanner.**/
		
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca la nota del ex�men de Matem�ticas:");
		float exam= Float.parseFloat(in.readLine());
		System.out.print("Ahora introduzca la nota de la primera tarea: ");
		float tarea1m= Float.parseFloat(in.readLine());
		System.out.print("La nota de la segunda tarea de matem�ticas es:");
		float tarea2m= Float.parseFloat(in.readLine());
		System.out.print("Introduce la nota de la tercera tarea:");
		float tarea3m= Float.parseFloat(in.readLine());
		
		float mediatareas=(tarea1m+tarea2m+tarea3m)/3;
		double mediamat=(mediatareas*0.1)+(exam*0.9);
		
		System.out.printf("En matem�ticas,la media de las tareas es: %.2f, mientras que la media de la asignatura es: %.2f\n", mediatareas, mediamat);

		
		System.out.print("Introduzca la nota del ex�men de F�sica:");
		float exaf= Float.parseFloat(in.readLine());
		System.out.print("Ahora introduzca la nota de la primera tarea: ");
		float tarea1f= Float.parseFloat(in.readLine());
		System.out.print("La nota de la segunda tarea de f�sica es:");
		float tarea2f= Float.parseFloat(in.readLine());
		
		float mediatareasf=(tarea1f+tarea2f)/2;
		double mediaf=(mediatareasf*0.2)+(exaf*0.8);
		
		System.out.printf("En f�sica,la media de las tareas es: %.2f, mientras que la media de la asignatura es: %.2f\n", mediatareasf, mediaf);
		
		System.out.print("Introduzca la nota del ex�men de Qu�mica:");
		float exaq= Float.parseFloat(in.readLine());
		System.out.print("Ahora introduzca la nota de la primera tarea: ");
		float tarea1q= Float.parseFloat(in.readLine());
		System.out.print("La nota de la segunda tarea de qu�mica es:");
		float tarea2q= Float.parseFloat(in.readLine());
		System.out.print("Introduce la nota de la tercera tarea:");
		float tarea3q= Float.parseFloat(in.readLine());
		
		float mediatareasq=(tarea1m+tarea2m+tarea3m)/3;
		double mediaq=(mediatareasq*0.15)+(exaq*0.85);
		
		System.out.printf("En Qu�mica,la media de las tareas es: %.2f, mientras que la media de la asignatura es: %.2f\n", mediatareasq, mediaq);
		
		double mediatotal= (mediamat+mediaf+mediaq)/3;
		System.out.printf("La media de las notas es: %.2f", mediatotal);
	}

}
