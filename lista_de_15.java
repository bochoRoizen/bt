package ejercicios;

import java.util.Scanner;

public class listas_de_15 {

	public static void main(String[] args) {

		
		/*
		 * Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual de las dos listas tiene un valor acumulado
		 * mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
		 * Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int lista1 = 0, lista2 = 0;
		
		// contadores
		int i = 1, j = 1;
		
		while(i <= 2) {
			
			while(j <= 15) {
				
				System.out.println("Ingresar valor " + j + " de la lista " + i + ": ");
				if(i == 1) {
					lista1 += scanner.nextInt();
				} else {
					lista2 += scanner.nextInt();
				}
				
				j++;
			}
			
			j = 1;
			
			i++;
		}
		
		if(lista1 > lista2) {
			System.out.println("Lista 1 mayor");
		} else if(lista1 < lista2) {
			System.out.println("Lista 2 mayor");
		} else {
			System.out.println("Listas iguales");
		}
		
		scanner.close();
		
	}

}
