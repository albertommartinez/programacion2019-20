import java.util.Scanner;

/**
* Realizar un algoritmo que lea un n�mero y que muestre su ra�z cuadrada�y su ra�z c�bica.�
* Python no tiene ninguna funci�n predefinida que permita calcular la ra�z c�bica,�
* �c�mo se puede calcular?
* @author Alberto Miguel Martinez Jimenez
*/

//Almacenar un n�mero
//Elevarlo a 1/2, para obtener su ra�z cuadrada
//Elevarlo a 1/3, para obtener su ra�z c�bica
//Mostrar resultados

public class ej13 {
	public static void main(String[] args) {
		double numero;
		double resultado;
		double raiz2;
		double raiz3;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Obtener ra�z cuadrada y ra�z c�bica de un n�mero ");
		System.out.println("Introduce el n�mero> ");
		numero = scanner.nextDouble();
		
		raiz2 = Math.pow(numero,1/2);
		raiz3 = Math.pow(numero,1/3);
		
		System.out.println("Dado el n�mero "+numero+" la ra�z cuadrada es "+raiz2);
		System.out.println("y la ra�z c�bica es "+raiz3);
	}
}