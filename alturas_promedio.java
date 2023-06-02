package ejercicios;

import java.util.Scanner;

public class altura_promedio {

	public static void main(String[] args) {

		/*
		 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las persona
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int nAlturas, contador;
		float alturasTotales = 0, alturaPromedio;
		
		System.out.println("Ingresar el numero de personas: ");
		nAlturas = scanner.nextInt();
		contador = nAlturas; // nAlturas lo voy a usar mas adelante asi que no lo puedo usar como contador
		
		while(contador > 0) {
			
			System.out.println("Ingresar altura: ");
			alturasTotales += scanner.nextFloat(); // voy sumando cada una de las alturas
			
			contador--;
		}
		
		alturaPromedio = alturasTotales / nAlturas; // hago el promedio
		
		// aveces se bugean un poco los floats pero esta bien
		System.out.println("Altura promedio: " + alturaPromedio);
		
		scanner.close();
		
	}

}
