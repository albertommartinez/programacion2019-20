import java.util.Scanner; //Importar la clase Scanner

/**
 * Introducir una cadena de caracteres e indicar si es un palíndromo. 
 * Una palabra palíndroma es aquella que se lee igual adelante que atrás.
 *
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar palabra
 * hacer hasta longitud de palabra
 * palabraAux[i] = palabra[longitu de palabra - i - 1]
 * fin hacer
 * mostrar palabraAux
 */




public class ej15 {

	public static void main(String[] args) {
		String palabra;
		String palabraAux = "";
		boolean palindromo = false;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("...---¿Es un palíndromo?---...");
		System.out.println("Introduce una palabra> ");
		palabra = scanner.next().toLowerCase();
		for(int i=0;i<palabra.length();i++) {
			palabraAux = palabraAux + palabra.charAt(palabra.length()-i-1);
		}
		if(palabra.equals(palabraAux)){
			System.out.println("La palabra "+palabra+" es un palíndromo");
		}else{
			System.out.println("La palabra "+palabra+" no es un palíndromo");
		}
	}

}
