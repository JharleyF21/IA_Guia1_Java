package senati;

import java.util.Scanner;
import  java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df =  new  DecimalFormat ("# .00");
		
		int cantidad =  0;
		float precio =  0;
		
		System.out.print( "Ingrese cantidad: ");
		cantidad = scn.nextInt ();
		System.out.print("Ingrese precio: ");
		precio = scn . nextFloat ();
		
		float importe = cantidad * precio;
		float dolar = importe / ( float ) 3.24 ;
		float euro = importe / ( float ) 3.75 ;
		
		System.out.println(" \n Resultados " );
		System.out.println("==========");
		System.out.println("El importe en S/ es ..: "  + df.format(importe));
		System.out.println("El importe en $ es ...: "  + df.format(dolar));
		System.out.println("El importe en € es ...: "  + df.format(euro));

	}

}
