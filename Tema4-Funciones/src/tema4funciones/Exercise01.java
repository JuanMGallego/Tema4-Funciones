package tema4funciones;

import java.util.Scanner;

public class Exercise01 {

	static void eco(int times) {
		
		for (int eco = 1 ; eco <= times ; eco++) {
			
			System.out.println("Eco...");
			
		}
		
	}
	
	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		System.out.println();
		num = sc.nextInt();
		eco(num);
		
		sc.close();
		
	}

}
