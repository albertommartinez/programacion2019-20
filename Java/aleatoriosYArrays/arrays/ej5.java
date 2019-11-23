package arrays;
import java.util.Scanner;

/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * @author Alberto Miguel Martinez Jimenez
 * 
 * ALGORITMO
 * almacenar 10 enteros
 * si el introducido es mayor al almacenado en la variable 'mayor'
 * se almacena tambien en la variable 'mayor'
 * si no, comprobamos si es menor que el almacenado en la variable 'menor'
 * si lo es, sustituimos el valor de 'menor'
 * mientras la posicion<10 repetir
 * 		mostrar numeros[posicion]
 * 		si numeros[posicion] == mayor
 * 			escribir "mayor"
 * 		sino
 * 			si numeros[posicion] == menor
 * 				escribir "menor"
 */
public class ej5 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int menor = Integer.MAX_VALUE;
		int mayor = Integer.MIN_VALUE;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("..::Te dire cual es el mayor y el menor::..");
		
		for(int i=0;i<10;i++) {
			System.out.println("Dime un entero: ");
			numeros[i] = scanner.nextInt();
			if(numeros[i]<menor) {
				menor = numeros[i];
			}else if(numeros[i]>mayor) {
				mayor = numeros[i];
			}
		}
		for(int i=0;i<10;i++) {
			if(numeros[i]==mayor) {
				System.out.println(numeros[i]+" MAYOR");
			}else if(numeros[i]==menor) {
				System.out.println(numeros[i]+" MENOR");
			}else{
				System.out.println(numeros[i]);
			}
		}
	}

}
