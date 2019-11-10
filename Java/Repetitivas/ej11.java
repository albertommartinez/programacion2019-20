import java.util.Scanner; //Importar la clase Scanner

/**
 * Suponiendo que hemos introducido una cadena por teclado que representa una frase 
 * (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar una cadena de texto
 * Identificar y contar los espacios
 * palabras = espacios + 1
 */



public class ej11 {

	public static void main(String[] args) {
		String cadena;
		int espacios = 0;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Contar palabras---");
		System.out.println("Introduce una frase> ");
		cadena = scanner.nextLine();
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==' ') {
				espacios++;
			}
		}
		System.out.println("Esta frase tiene "+(espacios+1)+" palabras");
	}

}
