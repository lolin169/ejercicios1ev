package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
	
	public static void main(String[] args) throws IOException {
		/*
		 Ejercicio 1
		 Programa que lea una cadena desde el teclado y muestre en la consola el número de veces que se repite
		 cada vocal.
		 **/
		
		BufferedReader in= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduzca una frase..");
		String frase= in.readLine();
		frase= frase.toLowerCase();
		char [] vocales= new char [5];
		vocales[0]= 'a';
		vocales[1] ='e';
		vocales[2]= 'i';
		vocales[3] ='o';
		vocales[4]= 'u';

		int a=0,e=0,i=0,o=0,u=0;
		
		for ( int z=0;z<frase.length();z++) {
			
			    char letra= frase.charAt(z);
			    
			    if(letra=='á'||letra=='à'||letra=='ä'){letra='a';}
			    if(letra=='é'||letra=='è'||letra=='ë'){letra='e';}
			    if(letra=='í'||letra=='ì'||letra=='ï'){letra='i';}
			    if(letra=='ó'||letra=='ò'||letra=='ö'){letra='o';}
			    if(letra=='ú'||letra=='ù'||letra=='ü'){letra='u';}
			
			 for(int j=0; j<vocales.length;j++) {
				 
				char vocal=vocales[j];
			
				 
				 if(letra==vocal){
					 
					 
					 
				 
				 switch(letra){
				 
				 case 'a':
					 a++;
					 break;
					 
				 case 'e':
					 e++;
					 break;
					 
				 case 'i': 
					 i++;
					 break;
					 
				 case 'o':
					 o++;
					 break;
					 
				 case 'u':
					 u++;
					 break;
				
				 }

				 }
				 
				
				 

			 }


		}

		System.out.println("La letra "+vocales[0]+" aparece "+a+" veces");
		System.out.println("La letra "+vocales[1]+" aparece "+e+" veces");
		System.out.println("La letra "+vocales[2]+" aparece "+i+" veces");
		System.out.println("La letra "+vocales[3]+" aparece "+o+" veces");
		System.out.println("La letra "+vocales[4]+" aparece "+u+" veces");
	}

}
