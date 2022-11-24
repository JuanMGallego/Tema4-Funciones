package tema4funciones;

import java.util.Scanner;

public class Exercise03 {

	static void sel(int option, double radio, double height) {
		
		if (option == 1) {
			
			System.out.println("El área es: " + 2 * Math.PI * radio * (height + radio) + " u^2");
			
		} else if (option == 2) {
			
			System.out.println("El volumen es: " + Math.PI * radio * radio * height + " u^3");
			
		} else {
			
			System.err.println("ERROR: Ha introducido una opción inválida");
			
		}
		
	}
	
	public static void main(String[] args) {

		int option;
		double radio;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Área [1]");
		System.out.println("Volumen [2]");
		System.out.println("-------------------");
		System.out.print("Elija una opción: ");
		option = sc.nextInt();
		System.out.print("Introduzca el radio: ");
		radio = sc.nextDouble();
		System.out.print("Introduzca la altura: ");
		height = sc.nextDouble();
		System.out.println();
		
		sel(option, radio, height);
		
		sc.close();
		
	}

}
