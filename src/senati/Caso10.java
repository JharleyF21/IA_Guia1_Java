package senati;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int radio = 0;
		
		System.out.print("Ingrese radio del c�rculo: ");
		radio = scn.nextInt();
		float area = (float) (3.1416) * (radio * radio);
		float perimetro = (float) (2 * 3.1416 * radio);
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("�rea del c�rculo............: " + area);
		System.out.println("Perimmetro del c�rculo......: " + perimetro);

	}

}
