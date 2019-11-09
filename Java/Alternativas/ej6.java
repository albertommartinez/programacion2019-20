import java.util.Scanner; //Importar la clase Scanner 

/**
 * Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo:
 * Almacenar letra
 * Duplicar variable letra
 * transformar copia de letra a mayúscula
 * comparamos ambas variables
 * si son iguales letra es mayúscula
 * si no es minúscula
 */

public class ej6 {

	public static void main(String[] args) {
		char letra;
		String entradaLetra;
		char letraCopia;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Comprobar si una letra es mayúscula o minúscula---");
		System.out.println("Introduce una letra> ");
		entradaLetra = scanner.next();
		letra = entradaLetra.charAt(0);
		letraCopia = Character.toUpperCase(entradaLetra.charAt(0));
		if(letra==letraCopia) {
			System.out.println("La letra introducida es mayúscula.");
		}else{
			System.out.println("La letra introducida es minúscula.");
		}
		
		
	}

}
