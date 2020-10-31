package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df =  new  DecimalFormat ("# .0");
		
		float rp1 = 17 * 2 + (float) Math.pow(3,  2) - (float) (6);
		float rp2 = (int) 2 * (float) (4.7 - 1.2 * 2);
		float rp3 = rp1 /5;
		float total = rp3  - rp2;
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Respuesta............: " + df.format(total));

	}

}
