import java.util.Scanner;

/**
* Dadas dos variables num�ricas A y B, que el usuario debe teclear,�
* se pide realizar un algoritmo que intercambie los valores de ambas variables�
* y muestre cuanto valen al final las dos variables.
* @author Alberto Miguel Martinez Jimenez
*/

//Almacenar valor num�rico en variable A
//Almacenar valor num�rico en variable B
//Mostrar A y B
//Asignar el valor de A a variable aux
//Asignar el valor de la variable B a A
//Asignar el valor de la variable aux a B
//Mostrar A y B

public class ej15 {
	public static void main(String[] args) {
		int a;
		int b;
		int aux;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		
		System.out.println("Intercambiar valores de dos variables");
		System.out.println("Introduce el primer n�mero(A)> ");
		a = scanner.nextInt();
		
		System.out.println("Introduce el segundo n�mero(B)> ");
		b = scanner.nextInt();
		
		System.out.println("A->"+a+" B->"+b);
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("A->"+a+" B->"+b);
	}
}