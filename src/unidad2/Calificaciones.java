package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 4. En el método main de una clase Java llamada Calificaciones escribe un
		 * programa que resuelva el problema siguiente: un estudiante desea saber cuál
		 * será su promedio general en las tres materias que cursa y cuál será el
		 * promedio que obtendrá en cada una de ellas. Los criterios de calificación se
		 * establecen en la tabla siguiente: MATEMáTICAS EXAMEN: 90% TAREAS: 10% Nº DE
		 * TAREAS REALIZADAS 3
		 * 
		 * FíSICA EXAMEN:80% TAREAS: 20% Nº DE TAREAS REALIZADAS: 2
		 * 
		 * QUíMICA EXAMEN:85% TAREAS: 15% Nº DE TAREAS REALIZADAS: 3
		 * 
		 * Los datos de entrada (calificación del examen y calificaciones de cada una de
		 * las tareas realizadas) se introducirán por teclado y los datos de salida (los
		 * promedios de cada asignatura y el promedio de las tres) se mostrarán en la
		 * consola con una precisión de dos decimales. Resolver el problema sin utilizar
		 * la clase Scanner.
		 **/

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca la nota del exámen de Matemáticas:");
		float exam = Float.parseFloat(in.readLine());
		System.out.print("Ahora introduzca la nota de la primera tarea: ");
		float tarea1m = Float.parseFloat(in.readLine());
		System.out.print("La nota de la segunda tarea de Matemáticas es:");
		float tarea2m = Float.parseFloat(in.readLine());
		System.out.print("Introduce la nota de la tercera tarea:");
		float tarea3m = Float.parseFloat(in.readLine());

		float mediatareas = (tarea1m + tarea2m + tarea3m) / 3;
		double mediamat = (mediatareas * 0.1) + (exam * 0.9);

		System.out.printf(
				"En Matemáticas,la media de las tareas es: %.2f, mientras que la media de la asignatura es: %.2f\n",
				mediatareas, mediamat);

		System.out.print("Introduzca la nota del exámen de Física:");
		float exaf = Float.parseFloat(in.readLine());
		System.out.print("Ahora introduzca la nota de la primera tarea: ");
		float tarea1f = Float.parseFloat(in.readLine());
		System.out.print("La nota de la segunda tarea de Física es:");
		float tarea2f = Float.parseFloat(in.readLine());

		float mediatareasf = (tarea1f + tarea2f) / 2;
		double mediaf = (mediatareasf * 0.2) + (exaf * 0.8);

		System.out.printf(
				"En Física,la media de las tareas es: %.2f, mientras que la media de la asignatura es: %.2f\n",
				mediatareasf, mediaf);

		System.out.print("Introduzca la nota del exámen de Química:");
		float exaq = Float.parseFloat(in.readLine());
		System.out.print("Ahora introduzca la nota de la primera tarea: ");
		float tarea1q = Float.parseFloat(in.readLine());
		System.out.print("La nota de la segunda tarea de Química es:");
		float tarea2q = Float.parseFloat(in.readLine());
		System.out.print("Introduce la nota de la tercera tarea:");
		float tarea3q = Float.parseFloat(in.readLine());

		float mediatareasq = (tarea1q + tarea2q + tarea3q) / 3;
		double mediaq = (mediatareasq * 0.15) + (exaq * 0.85);

		System.out.printf(
				"En Química,la media de las tareas es: %.2f, mientras que la media de la asignatura es: %.2f\n",
				mediatareasq, mediaq);

		double mediatotal = (mediamat + mediaf + mediaq) / 3;
		System.out.printf("La media de las notas es: %.2f", mediatotal);
	}

}
