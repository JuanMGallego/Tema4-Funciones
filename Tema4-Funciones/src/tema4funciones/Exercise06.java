package tema4funciones;

import java.util.Scanner;

public class Exercise06 {

	public static boolean esPrimo(int n) {
		
		boolean esPrimo = true;
		
		for (int i = n-1 ; i > 1 ; i--) {
			
			if (n % i == 0) {
				
				esPrimo = false;
				break;
				
			}
			
		}
		
		return esPrimo;
		
	}
	
	public static void main(String[] args) {

		int num;
		boolean esPrimo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		System.out.println();
		num = sc.nextInt();
		
		esPrimo = esPrimo(num);
		
		if (esPrimo == true) {
			
			System.out.println("El número SI es primo");
			
		} else {
			
			System.out.println("El número NO es primo");
			
		}
		
		sc.close();
		
	}

}
