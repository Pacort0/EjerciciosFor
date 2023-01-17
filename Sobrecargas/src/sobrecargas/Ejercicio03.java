package sobrecargas;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca un segundo número mayor que el primero: ");
		num2 = sc.nextInt();
		
		System.out.println("La suma de todos los números desde el 1 hasta el primer número introducido es " + sumaEnteros (num1));
		System.out.print("La suma de todos los números entre ambos números introducidos es " + sumaEnteros (num1, num2));
		
		sc.close();
	}
	public static int sumaEnteros(int num) {
		int suma = 0;
		
		for(int i = 1; i <= num; i++) {
			suma += i;
		}
		return suma;
	}
	
	public static int sumaEnteros (int num1, int num2) {
		int suma = 0;
		
		for(int i = num1; i <=num2; i++) {
			suma += i;
		}
		return suma;
	}
}
