import java.util.Scanner;

/**
* Escribir un algoritmo para calcular la nota final de un estudiante, 
* considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1 y por 
* respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
* @author Alberto Miguel Martinez Jimenez
*/

public class ej19 {
	public static void main(String[] args) {
		int correctas;
		int incorrectas;
		int enBlanco;
		int nota;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Cuantas respuestas correctas> ");
		correctas = scanner.nextInt();
		
		System.out.println("Cuantas respuestas incorrectas> ");
		incorrectas = scanner.nextInt();
		
		System.out.println("Cuantas respuestas en blanco> ");
		enBlanco = scanner.nextInt();
		
		nota = correctas*5 + incorrectas*(-1);
		System.out.println("La nota final es "+nota);
		
	}
}