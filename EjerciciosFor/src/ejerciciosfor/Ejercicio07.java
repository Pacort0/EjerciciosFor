package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args){
		//Creamos la variable 'num', donde guardaremos el valor que el usuario introduzca por teclado
		int num;
		/*Creamos la variable factorial, donde guardaremos las operaciones que nos hagan falta,
		 * y la inicializamos a 1 para que no nos de 0 cuando hagamos las multiplicaciones
		 * */
		int factorial = 1;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		//Imprimimos el mensaje inicial del programa y esperamos a que el usuario introduzca un valor
		System.out.print("Introduzca un número entero positivo: ");
		//Guardamos el valor introducido en la variable 'num'
		num = sc.nextInt();
		
		/*Creamos un bucle for, en el que creamos la variable 'i' que servirá como contador para el bucle.
		 * Inicializamos dicha variable a 5, el bucle se repetirá mientras sea mayor a 0 y le iremos decrementando
		 * su valor por un vuelta tras vuelta
		 */
		for(int i = 5; i > 0; i--) {
			/*En cada vuelta, el valor guardado en 'factorial' se multiplica por el valor de 'i' en esa vuelta
			 * y se guarda de nuevo en 'factorial'
			 */
			factorial *= i;
		}
		//Imprimimos el mensaje final con los valores necesarios
		System.out.print("El factorial de " + num + " es " + factorial);
		//Cerramos el escáner
		sc.close();
	}
}
