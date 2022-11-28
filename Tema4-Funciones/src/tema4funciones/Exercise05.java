package tema4funciones;

import java.util.Scanner;

public class Exercise05 {

	public static boolean vocal(String letter) {
		
		boolean isVocal;
		
		isVocal = letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")? true : false;
		
		return isVocal;
			
	}
	
	public static void main(String[] args) {

		String letter;
		boolean isVocal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca una letra: ");
		letter = sc.nextLine();
		System.out.println();
		
		isVocal = vocal(letter);
		
		System.out.println("¿Es vocal?: " + isVocal);
		
		sc.close();

	}
	
}
