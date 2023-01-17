package sobrecargas;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca el primer valor (puede tener decimales): ");
		a = sc.nextInt();
		System.out.print("Introduzca el segundo valor (puede tener decimales): ");
		b = sc.nextInt();
		System.out.print("Introduzca el tercer valor (no puede tener decimales): ");
		c = sc.nextInt();
		
		System.out.println("La media de los dos primeros valores es " + media(a, b));
		System.out.print("La media de los tres valores es " + media ((int) a, (int) b, c));
		
		sc.close();
	}
	public static double media (int a, int b) {
		double media = (a+b)/2;
		return media;
	}
	public static double media (int a, int b, int c) {
		double media = (a+b+c)/3;
		return media;
	}
}
