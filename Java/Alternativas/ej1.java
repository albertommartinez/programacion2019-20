import java.util.Scanner; //Importar la clase Scanner 

/**
 * Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
 * @author Alberto Miguel Martinez Jimenez
 *
 */
/**
 * Algoritmo:
 * Almacena numero1
 * Almacena numero2
 * Comparar si numero1 es mayor que numero2
 * Si es verdadero numero1 es mayor
 * de lo contrario es menor
 * 
 */
public class ej1 {

	public static void main(String[] args) {
		double numero1 = 0;
		double numero2 = 0;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner	
		
		System.out.print("Introduce primer número> ");
		numero1 = scanner.nextDouble(); 
		
		System.out.print("Introduce el segundo número> ");
		numero2 = scanner.nextDouble();	
		
		if(numero1 > numero2) {
			System.out.println("El primer número es mayor.");
		}else if(numero1 < numero2) {
			System.out.println("El segundo número es el mayor.");
		}
	}

}
