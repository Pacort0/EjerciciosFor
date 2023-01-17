package sobrecargas;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		double a, b;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca un valor para el primer sumando: ");
		a = sc.nextDouble();
		System.out.print("Introduzca un valor para el segundo sumando: ");
		b = sc.nextDouble();
		
		System.out.println("La suma de enteros es " + suma((int) a, (int) b));
		System.out.print("La suma de números con decimales es " + suma(a, b));
		
		sc.close();
	}
	public static int suma (int a, int b) {
		int suma = a+b;
		return suma;
	}
	public static double suma (double a, double b) {
		double suma = a+b;
		return suma;
	}
}
