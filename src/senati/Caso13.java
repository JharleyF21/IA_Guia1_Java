package senati;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nombre = "";
		String apellido = "";
		
		System.out.print("Ingrese Nombre: ");
		nombre = scn.nextLine();
		
		System.out.print("Ingrese Apellido: ");
		apellido = scn.nextLine();
		
		System.out.println("===================");
		System.out.println("RESULTADOS");
		System.out.println("===================");
		System.out.println("Alumno: " + nombre + " " + apellido);

	}

}
