package senati;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float valor = 0;
		
		System.out.print("Ingrese el valor de una venta: ");
		valor = scn.nextFloat();
		
		float Nvalor = (float) (valor + valor * 0.42);
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Nuevo valor de la venta............: " + Nvalor);

	}

}
