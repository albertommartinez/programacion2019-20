import java.util.Scanner;

/**
* Pide al usuario dos números y muestra la "distancia" entre ellos 
* (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).
*/

//Almacenar numero1
//Almacenar numero2
//distancia = Math.abs(numero1-numero2)
//mostrar distancia

public class ej11 {
	public static void main(String[] args) {
		double numero1;
		double numero2;
		double distancia;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Calcular la distancia entre dos números");
		System.out.println("Introduce el primer número> ");
		numero1 = scanner.nextDouble();
		System.out.println("Introduce el segundo número> ");
		numero2 = scanner.nextDouble();
		
		distancia = Math.abs(numero1-numero2);
		
		System.out.println("La distancia entre "+numero1+" y "+numero2+" es "+distancia);
	}
}