package tema4funciones;

import java.util.Scanner;

public class Exercise04 {

	static int max(int num1, int num2) {
		
		int maxNum;
		
		maxNum = num1 >= num2 ? num1 : num2;
		
		return maxNum;
		
	}
	
	public static void main(String[] args) {

		int num1, num2;
		int maxNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		num2 = sc.nextInt();
		System.out.println();

		maxNum = max(num1, num2);
		
		System.out.println("El número más grande es: " + maxNum);
		
		sc.close();
		
	}

}
