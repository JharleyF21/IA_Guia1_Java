package senati;

import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String producto;
		int cantidad;
		float precio;
		
		System.out.print("Ingrese el nombre del producto: ");
		producto = scn.nextLine();
		
		System.out.print("Ingrese el precio del producto: ");
		precio = scn.nextFloat();
		
		System.out.print("Ingrese la cantidad del producto: ");
		cantidad = scn.nextInt();
		
		float importe = precio * cantidad;
		
		float igv = (float) (importe * 0.18);
		
		
		float descuento = (float) (importe *0.3);
		
		float total = importe - descuento + igv;
		
		
		System.out.println("R E S U L T A D O S");
		System.out.println("===========");
		System.out.println("IMPORTE DEL IGV: "+ igv);
		System.out.println("DESCUENTO: " + descuento);
		System.out.println("TOTAL: "+ total);

	}

}
