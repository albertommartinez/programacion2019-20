import java.util.Scanner; //Importar la clase Scanner

/**
 * Introducir una cadena de caracteres e indicar si es un pal�ndromo. 
 * Una palabra pal�ndroma es aquella que se lee igual adelante que atr�s.
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
		
		System.out.println("...---�Es un pal�ndromo?---...");
		System.out.println("Introduce una palabra> ");
		palabra = scanner.next().toLowerCase();
		for(int i=0;i<palabra.length();i++) {
			palabraAux = palabraAux + palabra.charAt(palabra.length()-i-1);
		}
		if(palabra.equals(palabraAux)){
			System.out.println("La palabra "+palabra+" es un pal�ndromo");
		}else{
			System.out.println("La palabra "+palabra+" no es un pal�ndromo");
		}
	}

}
