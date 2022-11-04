package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Creamos la variable 'nota', donde guardaremos los valores que el usuario vaya introduciendo por teclado
		int nota;
		/*Creamos la variable 'suspenso', que servirá para llevar la cuenta de los alumnos con notas suspensas
		 * La inicializamos a 0 para que no nos dé error el programa a la hora de usar su valor
		 */
		int suspenso = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		/* Creamos el bucle for, en el que iremos analizando una a una las notas introducidas y guardando las suspensas
		 * Creamos la variable 'i' como contador para el programa y la iniciamos a 1
		 * El bucle se repetirá mientras el contador sea mayor o igual a 5
		 * Tras cada vuelta, incrementamos el contador del bucle en 1
		 */
		for(int i = 1; i <= 5; i++) {
			//Imprimimos el mensaje principal y esperamos a que el usuario introduzca los valores por teclado
			System.out.print("Introduzca la nota del " + i + "º alumno: ");
			//Guardamos los valores introducidos en cada vuelta en la variable 'nota'
			nota = sc.nextInt();
			
			//Si la nota es menor que 5, el contador de suspensos se incrementa en 1
			if(nota < 5) {
				suspenso++;
			}
		}
		//Imprimimos el mensaje final con los datos concluyentes
		System.out.print("\nDe esos 5 alumnos, hay " + suspenso + " suspensos.");
		//Cerramos el escáner
		sc.close();
	}

}
