package sobrecargas;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int num;
		String cad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca 0 o 1: ");
		num = sc.nextInt();
		System.out.print("Escriba 'true' o 'false': " );
		cad = sc.next();
		
		if(num != 1 && num != 0) {
			System.out.print("Mal. MAL.  M A L.");
		}
		else {
			System.out.println(parseToBoolean(num));
			System.out.print(parseToBoolean(cad));
		}
		
		sc.close();
	}
	public static Boolean parseToBoolean(int num) {
		Boolean parse = false;
		if(num == 1) {
			parse = true;
		}
		return parse;
	}
	
	public static Boolean parseToBoolean(String cadena) {
		Boolean parse = false;
		if(cadena.equals("true")) {
			parse = true;
		}
		return parse;
	}
}
