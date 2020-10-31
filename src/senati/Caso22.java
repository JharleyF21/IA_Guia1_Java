package senati;

import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nom = "";
		String ape = "";
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		
		System.out.print("Nombre: ");
		nom = scn.nextLine();
		
		System.out.print("Apellido: ");
		ape = scn.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		nota1 = scn.nextInt();
		
		System.out.print("Ingrese nota 2: ");
		nota2 = scn.nextInt();
		
		System.out.print("Ingrese nota 3: ");
		nota3 = scn.nextInt();
		
		float promedio = (float) (nota1 * 0.2 + nota2 * 0.3 + nota3 *0.5);
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Alumno............: " + nom + " " + ape);
		System.out.println("Promedio..........: " + promedio);

	}

}
