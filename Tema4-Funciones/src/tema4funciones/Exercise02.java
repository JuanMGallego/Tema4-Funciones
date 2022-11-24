package tema4funciones;

import java.util.Scanner;

public class Exercise02 {

	static void range(int value1 , int value2) {
			
		for (int i = value1 ; i <= value2 ; i++ ) {
			
			System.out.println(i);
			
		}
		
	}
	
	public static void main(String[] args) {

		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		num2 = sc.nextInt();
		System.out.println();
		
		if (num1 < num2) {
			
			range(num1,num2);
			
		} else {
			
			range(num2, num1);
			
		}
		
		sc.close();
		
	}

}
