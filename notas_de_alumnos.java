package ejercicios;

import java.util.Scanner;

public class notas_de_alumnos {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int nota, mayor = 0, menor = 0, contador = 0;
		
		while(contador < 10) {
			
			System.out.println("Ingresar nota: ");
			nota = scanner.nextInt();
			
			if(nota >= 7) {
				mayor++;
			} else {
				menor++;
			}
			
			contador++;
		}
		
		System.out.println(mayor + " alumnos tienen una nota mayor o igual a 7 y " + menor + " alumnos una nota menor a 7");
		
		scanner.close();
		
	}

}
