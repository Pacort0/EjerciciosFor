package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos una variable 'a' para almacenar el valor que el usuario introduzca para el primer número.
		int a;
		//Creams una variable 'b' para almacenar el valor que el usuario introduzca para el segundo número.
		int b;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		//Imprimimos el primer mensaje pidiendo el primer número.
		System.out.print("Introduzca un número A: ");
		//Guardamos el número en la variable asignada.
		a = sc.nextInt();
		//Imprimimos el segundo mensaje pidiendo el segundo número.
		System.out.print("Introduzca un número B (debe ser mayor que A): ");
		//Guardamos el número en la variable asignada.
		b = sc.nextInt();
		
		/* Creamos un bucle for que irá imprimiendo todos los números desde A hasta B
		 * Para ello, creamos una variable 'i' que servirá como contador para el programa, y la iniciamos a 'a'.
		 * El bucle funcionará mientras el contador sea menor o igual a 'b'.
		 * Tras cada vuelta, incrementaremos en 1 el valor del contador.
		 */
		for (int i = a; i <= b; i++) {
			//En cada vuelta, imprimimos el valor de 'i'.
			System.out.println(i);
		}
		//Cerramos el escáner.
		sc.close();
	}

}
