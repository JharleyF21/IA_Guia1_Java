package senati;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
		
		float valor = 0;
		
		System.out.print("Ingrese el valor de un gasto: ");
		valor = scn.nextFloat();
		
		float Nvalor = (float) (valor - valor * 0.12);
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Nuevo valor de la venta............: " + Nvalor);

	}

}
