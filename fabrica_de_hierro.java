package ejercicios;

import java.util.Scanner;

public class fabrica_de_hierro {

	public static void main(String[] args) {

		/*
		 * Una planta que fabrica perfiles de hierro posee un lote de n piezas.
		 * Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar y luego ingrese la longitud de cada perfil; sabiendo que la
		 * pieza cuya longitud esté comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		// nPiezas es el contador
		int nPiezas, nPiezasAptas = 0;
		float longitudPerfil;
		
		System.out.println("Ingresar el numero de piezas: ");
		nPiezas = scanner.nextInt();
		
		// se va a ejecutar el codigo entre llaves hasta que nPiezas llegue a 0
		while(nPiezas > 0) {
			
			System.out.println("Ingresar longitud del perfil: ");
			longitudPerfil = scanner.nextFloat();
			
			// si se cumple la condicion, el numero de piezas aptas (nPiezasAptas) va a incrementar por 1
			if(longitudPerfil >= 1.20 && longitudPerfil <= 1.30) {
				nPiezasAptas++;
			}
			
			nPiezas--;
		}
		
		System.out.println("El numero de piezas aptas son: " + nPiezasAptas);
		
		// si queres que te saque el error, no es necasario
		scanner.close();
		
	}

}
