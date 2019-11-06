import java.util.Scanner;

/**
* Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener el�n�mero invertido.
* @author Alberto Miguel Martinez Jimenez
*/

//Almacenar n�mero
//dividir entre 10 para obtener la primera cifra
//el modulo ser� la segunda cifra
//se suman las dos cifras y el resultado es el n�mero invertido
//mostrar resultado

public class ej14 {
	public static void main(String[] args) {
		int numero;
		int unidad;
		int decena;
		int numeroFinal;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce un n�mero entero de dos cifras para invertirlo> ");
		numero = scanner.nextInt();
		decena = numero/10;
		unidad = numero%10;
		numeroFinal =(unidad*10)+decena;
		
		System.out.println("El n�mero "+numero+" invertido es "+numeroFinal);
	}
	
}