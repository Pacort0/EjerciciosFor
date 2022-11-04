package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Creamos la variable 'num', donde almacenaremos el valor que el usuario introduzca por teclado
		int num;
		//Creamos la variable booleana 'primo' para determinar si es cierto que 'num' es primo o no
		Boolean primo = true;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		//Imprimimos el mensaje inicial y esperamos a que el usuario introduzca un valor numérico
		System.out.print("Introduzca un número entero positivo: ");
		//Guardamos el valor en la variable designada
		num = sc.nextInt();
		
		//Si el número introducido es menor o igual a 0, es un número no válido para el programa
		if(num <= 0) {
			System.out.print("Número introducido no válido");
		}
		//Si el número es válido, seguimos ejecutando el programa
		else {
			/* Creamos un bucle for, en el que iremos analizando cada división de los números comprendidos
			 * entre 2 y el número introducido -1, ya que no vale dividirlos entre él mismo o 1 (siempre es 0).
			 * Para ello, creamos una variable 'i' que sirva de contador para el bucle y la inicializamos al valor
			 * de "num - 1".
			 * El bucle funcionará mientras el contador sea mayor que 1.
			 * Tras cada vuelta, decrementamos el valor de 'i' en 1.
			 */
			for(int i = num -1 ; i > 1; i--) {
				/*Si el cociente de la división entre el número introducido y el valor de 'i' en esa vuelta es 0,
				 * el número no es primo
				 */
				if(num % i == 0) {
					primo = false;
				}
			}
			//Si el número no es primo, imprimimos un mensaje que lo comunique al usuario
			if(primo == false){
				System.out.print("\nEl número introducido no es primo.");
			}
			//Sin embargo, si el número es primo, imprimimos un diferente mensaje que lo comunique al usuario
			else {
				System.out.print("\nEl número introducido es primo.");
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
