package unidad4;

import java.util.Scanner;

public class Ejercicio15 {
	
	
	private static Scanner teclado= new Scanner (System.in);

	public static void main(String[] args) {
		/*
			Ejercicio 15
				Programa para la gestión de las calificaciones de los alumnos en las tres evaluaciones de una asignatura. El
				programa deberá pedir al profesor que introduzca por teclado los nombres de cada alumno junto a las
				calificaciones de cada evaluación. Después le permitirá realizar las acciones siguientes a través del menú
				correspondiente:
					1. Mostrar la nota media de todos los alumnos.
					2. Mostrar la nota media de un alumno determinado.
					3. Visualizar las notas por evaluación y la nota final de cada evaluación.
					4. Visualizar las notas por evaluación y la nota final de un alumno determinado.
					5. Calcular la nota media del curso.
					6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece.
					7. Salir.
		**/
		
		System.out.println("Introduzca el número de alumnos que tiene la clase: ");
		int nalu= teclado.nextInt();
		teclado.nextLine();
		String[]alumnos= new String[nalu];
		float [][] calificaciones= new float[nalu][4];
		LeerDatos( alumnos, calificaciones);
		int opcion=0;
		String repetir;
		do {
			do {
				System.out.println("Las opciones son:\r\n"+
					"					1. Mostrar la nota media de todos los alumnos.\r\n" + 
					"					2. Mostrar la nota media de un alumno determinado.\r\n" + 
					"					3. Visualizar las notas por evaluación y la nota final de cada evaluación.\r\n" + 
					"					4. Visualizar las notas por evaluación y la nota final de un alumno determinado.\r\n" + 
					"					5. Calcular la nota media del curso.\r\n" + 
					"					6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece.\r\n" + 
					"					7. Salir.");
				System.out.print("Escoja una opción(del 1 al 6) 7 para SALIR..");
				opcion=teclado.nextInt();	
			}
			while(opcion<=0||opcion>7);
			
			switch(opcion) {
			
			case 1:
				ejecuta1(alumnos,calificaciones);
			    break;
			case 2:
				ejecuta2(alumnos,calificaciones);
				break;
			case 3:
				ejecuta3(alumnos,calificaciones);
			    break;
			case 4:
				ejecuta4(alumnos, calificaciones);
				break;
			case 5:
				ejecuta5(calificaciones);
			    break;
			case 6:
				ejecuta6(calificaciones,alumnos);
				break;
			case 7:
				System.out.println("Saliendo");
			
			}
			System.out.println("Quiere Realizar otra consulta (si/no)?¿..");
			repetir=teclado.next();
		}
		while(repetir.equalsIgnoreCase("si"));
			System.out.println("Fin del programa");
	}
	
	
	
	static void LeerDatos(String [] alumnos,float[][] calificaciones) {
		
		for(int i=0;i<alumnos.length;i++) {
		System.out.print("Introduce el nombre del alumno "+ (i+1)+":");
		alumnos[i]= teclado.nextLine();
		System.out.println("Ahora dígame las 3 notas en la misma línea, separadas por espacios:");
		ponerNotas(calificaciones[i]);
		teclado.nextLine();
		}
	}
	
	static void ponerNotas(float[]calificaciones) {
		for(int z=0;z<4;z++) {
			if(z!=3) {
				calificaciones[z]=teclado.nextFloat();
				calificaciones[3]+=calificaciones[z];
			}else {
				calificaciones[3]=calificaciones[z]/3;
			}
		}
	}
	
	static void ejecuta1(String[] alumnos, float[][] calificaciones){
		System.out.println("La nota media de cada alumno son las siguientes:");
		for (int z=0;z<alumnos.length;z++) {
		    System.out.printf("%s:%4.2f\n",alumnos[z],calificaciones[z][3]);
		}		
	}
	
	static void ejecuta2(String []alumnos,float[][]calificaciones) {
		System.out.println("Escoja al alumno que quiere calificar de la lista: ");
		for (int z=0;z<alumnos.length;z++) {
			System.out.println("Alumno "+(z+1)+": "+alumnos[z]);
		}
		int i=teclado.nextInt();
		i-=1;
		System.out.printf("La nota media de %s es %4.2f\n",alumnos[i] ,calificaciones[i][3]);	
	}
	
	static void ejecuta3(String [] alumnos, float [][]calificaciones) {
		System.out.println("Las notas de cada Evaluación y alumno son:");
		for(int i=0;i<alumnos.length;i++) {
		   System.out.printf("Alumno: %s\tNOTAS 1ªevaluación: %4.2f\t 2ªevaluacion: %4.2f\t 3ªevaluación: %4.2f\tNOTA FINAL: %4.2f\n",
				              alumnos[i],calificaciones[i][0],calificaciones[i][1],calificaciones[i][2],calificaciones[i][3]);	   
		}	
	}
	
	static void ejecuta4(String []alumnos, float[][]calificaciones) {
		System.out.println("Escoja un alumno para ver todas sus notas..");
		for(int i=0;i<alumnos.length;i++) {
			System.out.println("Alumno "+(i+1)+": "+alumnos[i]);
		}
		int i=teclado.nextInt();
		i-=1;
		
		System.out.printf("Alumno: %s\tNOTAS 1ªevaluación: %4.2f\t2ªevaluación: %4.2f\t3ªevaluación: %4.2f\t NOTA FINAL: %4.2f\n",
				 alumnos[i],calificaciones[i][0],calificaciones[i][1],calificaciones[i][2],calificaciones[i][3]);
		
	}
	
	
	static void ejecuta5(float[][]calificaciones) {
	    float notamediatotal=0;
		for(int i=0;i<calificaciones.length;i++) {
			
				notamediatotal+=calificaciones[i][3]/3;
			}
		System.out.printf("La nota media de todo el curso es: %4.2f",notamediatotal);
			
		}
		
	static void ejecuta6(float[][] calificaciones, String[]alumnos) {
		
		int alumno=0;
		int alumnomin=0;
		int evaluacion=0;
		int evaluacionmin=0;
		float max=0;
		float min=calificaciones[0][0];
		for(int i=0;i<calificaciones.length;i++) {
			for(int z=0;z<calificaciones[0].length;z++) {
				if(max<calificaciones[i][z]) {
					max=calificaciones[i][z];
					alumno=i;
					evaluacion=z;	
				}
				if(min>calificaciones[i][z]) {
					min=calificaciones[i][z];
					alumnomin=i;
					evaluacionmin=z;
				}
			}
		}
		System.out.println("El alumno con la nota MAXIMA es:"+alumnos[alumno]+".La evaluación es la "+(evaluacion+1)+"ª evaluación.La nota máxima es: "+max);
		System.out.println("El alumno con la nota MÍNIMA es:"+alumnos[alumnomin]+".La evaluación es la "+(evaluacionmin+1)+"ª evaluación.La nota máxima es: "+min);
	
	}
	
}
