import java.util.Scanner; //Importar la clase Scanner

/**
 * Pide una cadena y un car�cter por teclado y muestra cuantas veces aparece el car�cter en la cadena.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacena una cadena
 * Almacena un car�cter
 * Recorrer la cadena 
 * Incrementar contador conincidencias cada vez que coincida con car�cter
 */


public class ej10 {

	public static void main(String[] args) {
		String cadena;
		char caracter;
		int coincidencias = 0;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Buscar car�cter en una cadena---");
		System.out.println("Introduce una cadena> ");
		cadena = scanner.nextLine();
		System.out.println("Introduce un car�cter a buscar en la cadena anterior> ");
		caracter = scanner.next().charAt(0);
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==caracter) {
				coincidencias++;
			}
		}
		
		System.out.println("Existen "+coincidencias+"coincidencias");
	}

}
