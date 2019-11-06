import java.util.Scanner;

/**
*Un alumno desea saber cual será su calificación final en la materia de Algoritmos. 
*Dicha calificación se compone de los siguientes porcentajes:
* 55% del promedio de sus tres calificaciones parciales.
* 30% de la calificación del examen final.
* 15% de la calificación de un trabajo final.
*/

//Almacenar nota primer parcial
//Almacenar nota segundo parcial
//Almacenar nota tercer parcial
//Almacenar nota examen final
//Almacenar nota trabajo final
//sumar parcial y dividir entre tres(media parciales)
//calcular el 55% de la media parciales y almacenarlo en variable final
//calcular el 30% del examen final y sumarlo a variable final
//calcular el 15% del trabajo final y sumarlo a variable final
//mostrar variable final

public class ej10 {
	public static void main(String[] args) {
		double sumatorioParciales;
		double mediaParciales;
		double examenFinal;
		double trabajoFinal;
		double notaFinal;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introducir nota del primer parcial> ");
		sumatorioParciales = scanner.nextDouble();
		
		System.out.println("Introducir nota del segundo parcial> ");
		sumatorioParciales += scanner.nextDouble();
		
		System.out.println("Introducir nota del tercer parcial> ");
		sumatorioParciales += scanner.nextDouble();
		
		System.out.println("Introducir la nota del examen final> ");
		examenFinal = scanner.nextDouble();
		
		System.out.println("Introducir nota del trabajo final> ");
		trabajoFinal = scanner.nextDouble();
		
		mediaParciales = sumatorioParciales/3;
		
		notaFinal = (mediaParciales*0.55+examenFinal*0.3+trabajoFinal*0.15);
		
		System.out.println("La nota final es "+notaFinal);
		
		
		
	}
}