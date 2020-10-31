package senati;

import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float monto1 = 0;
		float monto2 = 0;
		float monto3 = 0;
		
		System.out.print("Ingrese primer monto: ");
		monto1 = scn.nextFloat();
		
		System.out.print("Ingrese segundo monto: ");
		monto2 = scn.nextFloat();
		
		System.out.print("Ingrese tercer monto: ");
		monto3 = scn.nextFloat();
		
		float rp1 = (float) (monto1 /5 + monto2 * 0.2);
		float rp2 = (float) (monto3 * 0.6)/2;
		float total = (float) (monto1 + monto2 + monto3);
		float rp3 = (float) (total - total * 0.08);
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Respuesta 1............: " + rp1);
		System.out.println("Respuesta 2............: " + rp2);
		System.out.println("Respuesta 3............: " + rp3);

	}

}
