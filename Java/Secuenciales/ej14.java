import java.util.Scanner;

/**
* Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.
* @author Alberto Miguel Martinez Jimenez
*/

//Almacenar número
//dividir entre 10 para obtener la primera cifra
//el modulo será la segunda cifra
//se suman las dos cifras y el resultado es el número invertido
//mostrar resultado

public class ej14 {
	public static void main(String[] args) {
		int numero;
		int unidad;
		int decena;
		int numeroFinal;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce un número entero de dos cifras para invertirlo> ");
		numero = scanner.nextInt();
		decena = numero/10;
		unidad = numero%10;
		numeroFinal =(unidad*10)+decena;
		
		System.out.println("El número "+numero+" invertido es "+numeroFinal);
	}
	
}