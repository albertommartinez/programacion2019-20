import java.util.Scanner;

/**
* Realizar un algoritmo que lea un número y que muestre su raíz cuadrada y su raíz cúbica. 
* Python no tiene ninguna función predefinida que permita calcular la raíz cúbica, 
* ¿cómo se puede calcular?
* @author Alberto Miguel Martinez Jimenez
*/

//Almacenar un número
//Elevarlo a 1/2, para obtener su raíz cuadrada
//Elevarlo a 1/3, para obtener su raíz cúbica
//Mostrar resultados

public class ej13 {
	public static void main(String[] args) {
		double numero;
		double resultado;
		double raiz2;
		double raiz3;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Obtener raíz cuadrada y raíz cúbica de un número ");
		System.out.println("Introduce el número> ");
		numero = scanner.nextDouble();
		
		raiz2 = Math.pow(numero,1/2);
		raiz3 = Math.pow(numero,1/3);
		
		System.out.println("Dado el número "+numero+" la raíz cuadrada es "+raiz2);
		System.out.println("y la raíz cúbica es "+raiz3);
	}
}