package ejercicios;

import java.util.Scanner;

public class suelods_empleados {

	public static void main(String[] args) {

		/*
		 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que lea los sueldos que cobra cada empleado e informe
		 * cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa deberá informar el importe que gasta la empresa en sueldos
		 * al personal
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		// nSueldos1 sera el n de empleados que cobra entre 100$ y 300$
		// nSueldos2 sera el n de empleados que cobra mas de 300
		int nEmpleados, sueldo, nSueldos1 = 0, nSueldos2 = 0, sueldosTotal = 0;
		
		System.out.println("Ingresar el numero de empleados: ");
		nEmpleados = scanner.nextInt();
		
		while(nEmpleados > 0) {
			
			System.out.println("Ingresar sueldo: ");
			sueldo = scanner.nextInt();
			
			if(sueldo < 300) {
				nSueldos1++;
			} else {
				nSueldos2++;
			}
			
			sueldosTotal += sueldo;
			
			nEmpleados--;
		}
		
		// para ir a una nueva linea hay que poner '\n'
		System.out.println(nSueldos1 + " empleados cobran entre 100$ y 300$ y " + nSueldos2 + " empleados cobran mas de 300$.\nTotal gastado en sueldos: " + sueldosTotal + '$');
		
		scanner.close();
		
	}

}
