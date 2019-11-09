import java.util.Scanner; //Importar la clase Scanner 

/**
 * Escribe un programa que lea un número e indique si es par o impar.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo:
 * Almacenar un número (int)
 * Calcularle al número el módulo 2
 * Si es igual a cero, es par
 * Si no, es impar 
 *
 */
public class ej3 {

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Par o impar---");
		System.out.println("Introduce un número entero> ");
		numero = scanner.nextInt();
		
		if(numero%2==0) {
			System.out.println(numero+" es par");
		}else{
			System.out.println(numero+" es impar");
		}

	}

}
