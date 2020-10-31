package senati;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
		
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		
		System.out.print("Ingrese lado 1 del triángulo: ");
		lado1 = scn.nextInt();
		
		System.out.print("Ingrese lado 2 del triángulo: ");
		lado2 = scn.nextInt();
		
		System.out.print("Ingrese lado 3 del triángulo: ");
		lado3 = scn.nextInt();
		
		int perimetro = lado1 + lado2 + lado3;
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Perimetro del triángulo............: " + perimetro);

	}

}
