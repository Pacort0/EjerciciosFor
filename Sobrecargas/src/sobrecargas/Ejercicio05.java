package sobrecargas;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int nums;
		int mayor;
		int menor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de números que desea generar: ");
		nums = sc.nextInt();
		
		System.out.println(numerosAleatorios(nums));
		
		System.out.print("Introduzca el número máximo de esos números aleatorios: ");
		mayor = sc.nextInt();
		
		System.out.println(numerosAleatorios(nums, mayor));
		
		System.out.print("Introduzca el número mínimo de esos números aleatorios: ");
		menor = sc.nextInt();
		
		System.out.println(numerosAleatorios(nums, mayor, menor));
		
		
		sc.close();
	}
	static double numerosAleatorios(int numNums) {
		double num = 0;
		
		for(int i = numNums; i > 0; i--) {
			num = Math.random();
			System.out.println(num);
		}
		return num;
	}
	
	static double numerosAleatorios(int numNums, int mayor) {
		double num = 0;
		
		for(int i = numNums; i > 0; i--) {
			num = Math.random()*mayor;
			System.out.println((int)num);
		}
		return (int)num;
	}
	
	static double numerosAleatorios(int numNums, int mayor, int menor) {
		double num = 0;
		
		for(int i = numNums; i > 0; i--) {
			num = (Math.random()*(mayor - menor));
			System.out.println((int) num);
		}
		
		return (int)num;
	}
}