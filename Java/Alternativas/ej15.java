import java.util.Scanner;

/**
 * El director de una escuela está organizando un viaje de estudios, 
 * y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar 
 * a la compañía de viajes por el servicio. 
 * La forma de cobrar es la siguiente: 
 * 		si son 100 alumnos o más, el costo por cada alumno es de 65 euros; 
 * 		de 50 a 99 alumnos, el costo es de 70 euros, 
 * 		de 30 a 49, de 95 euros, 
 * 		y si son menos de 30, el costo de la renta del autobús es de 4000 euros, 
 * 		sin importar el número de alumnos. 
 * Realice un algoritmo que permita determinar el pago a la compañía de autobuses 
 * y lo que debe pagar cada alumno por el viaje.
 * 
 * @author Alberto Miguel Martinez Jimenez
 *
 */
/**
 * Algoritmo
 * almacenar número de alumnos
 * si alumnos >= 100 pagoPorAlumno = 65  pagoACompañia = 65*numeroAlumnos
 * si alumnos >= 50 y alumnos <= 99 pagoPorAlumno = 70  pagoACompañia = 70*numeroAlumnos
 * si alumnos >= 30 y alumnos <= 49 pagoPorAlumno = 95  pagoACompañia = 95*numeroAlumnos
 * si alumnos < 30 el costo total de autobus es de 4000 euros pago por alumno = 4000/ numeroAlumnos
 */    

public class ej15 {

	public static void main(String[] args) {
		int numeroAlumnos;
		double pagoPorAlumno = 0;
		double pagoACompannia = 0;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Calcular los costes de un viaje escolar---");
		System.out.println("Introduce el número de alumnos> ");
		numeroAlumnos = scanner.nextInt();
		if(numeroAlumnos>=100) {
			pagoPorAlumno = 65;
			pagoACompannia = 65 * numeroAlumnos;
		}else if((numeroAlumnos>=50)&&(numeroAlumnos<=99)) {
			pagoPorAlumno = 70;
			pagoACompannia = 70 * numeroAlumnos;
		}else if((numeroAlumnos>=30)&&(numeroAlumnos<=49)) {
			pagoPorAlumno = 95;
			pagoACompannia = 95 * numeroAlumnos;
		}else if(numeroAlumnos<30) {
			pagoPorAlumno = numeroAlumnos/4000;
			pagoACompannia = 4000;
		}
		
		System.out.println("Cada alumno debe pagar "+pagoPorAlumno+" y el pago a la comañia es "+pagoACompannia);
	}

}
