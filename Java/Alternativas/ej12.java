import java.util.Scanner; //Importar la clase Scanner

/**
 * Escribir un programa que lea un año indicar si es bisiesto. 
 * Nota: un año es bisiesto si es un número divisible por 4, 
 * pero no si es divisible por 100, excepto que también sea divisible por 400.
 * @author Alberto Miguel Martinez Jimenez
 */

/**
 * Algoritmo
 * Almacenar año
 * es bisiesto si anno%4=0
 * excepto anno%100=0
 * pero no si se da anno%400=0 
 */
public class ej12 {

	public static void main(String[] args) {
		int anno;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Comprobar si un año es bisiesto---");
		System.out.println("Introduce un año(Ej.:1994)> ");
		anno = scanner.nextInt();
		if((anno%4==0)&&(anno%100!=0)) {
			System.out.println("El año "+anno+" es bisiesto");
			
		}else if((anno%400==400)){
			System.out.println("El año "+anno+" es bisiesto");
		}else{
			System.out.println("El año "+anno+" no es bisiesto");
		}
	}

}
