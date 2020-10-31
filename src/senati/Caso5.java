package senati;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("Ingrese primer número: ");
		num1= scn.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		num2= scn.nextInt();
		
		float promedio = (num1 + num2)/2;
		float rp2 = (float) (num1 + num1 * 0.2);
		float rp3 = (float) (num2 - num2 * 0.3);
		
		System.out.println("==================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Respuesta 1: " + promedio);
		System.out.println("Respuesta 2: " + rp2);
		System.out.println("Respuesta 2: " + rp3);
		

	}

}
