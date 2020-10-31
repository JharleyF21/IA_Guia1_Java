package senati;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nombre =  " " ; // Crea un objeto de tipo String
		
		System.out.println( " Ingrese un nombre: " );
		nombre = scn.nextLine();
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Número de caracteres ...: "  + nombre . length ());
	}

}
