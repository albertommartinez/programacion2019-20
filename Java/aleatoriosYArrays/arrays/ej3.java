package arrays;
import java.util.Scanner;

/**
 * Escribe un programa que lea 10 n�meros por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el �ltimo en mostrarse
 * y viceversa.
 * @author Alberto Miguel Martinez Jimenez
 */
public class ej3 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Introdce un n�mero entero: ");
			numeros[i] = scanner.nextInt();
		}
		for(int i=9;i>=0;i--) {
			System.out.println(numeros[i]);
		}
	}

}
