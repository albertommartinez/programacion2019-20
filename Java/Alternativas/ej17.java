import java.util.Scanner; //Importar la clase Scanner

/**
 * Realiza un programa que pida por teclado el resultado (dato entero) 
 * obtenido al lanzar un dado de seis caras y muestre por pantalla 
 * el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
 * Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, 
 * se mostrará el mensaje: “ERROR: número incorrecto.”.
 * 
 * @author Alberto Miguel Mmartinez Jimenez
 *
 */
/**
 * Algoritmo
 * Almacenar numeroDado (int)
 * Devolver el número de la cara opuesta (String)
 */

public class ej17 {

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---El lado opuesto de la cara del dado---");
		System.out.println("Introduce el número de la cara de un dado> ");
		numero = scanner.nextInt();
		
		switch(numero) {
			case 1:
				System.out.println("El lado opuesto a "+numero+" es 6");
				break;
			case 2:
				System.out.println("El lado opuesto a "+numero+" es 5");
				break;
			case 3:
				System.out.println("El lado opuesto a "+numero+" es 4");
				break;
			case 4:
				System.out.println("El lado opuesto a "+numero+" es 3");
				break;
			case 5:
				System.out.println("El lado opuesto a "+numero+" es 2");
				break;
			case 6:
				System.out.println("El lado opuesto a "+numero+" es 1");
				break;
		}
	}

}
