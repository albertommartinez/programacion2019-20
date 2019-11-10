import java.util.Scanner; //Importar la clase Scanner

/**
 * Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales 
 * y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar caracter
 * transformar caracter a minuscula
 * si es distinto a 'a' o 'e' o 'i'o 'o' o 'u' no es vocal
 * si es igual es vocal
 * si es igual a espacio sale del programa
 */

public class ej3 {
	
	public static void main(String[] args) {
		char caracter;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		do {
			System.out.println("Introduce un caracter> ");
			caracter = scanner.next().toLowerCase().charAt(0);
			if((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
				System.out.println("VOCAL");
			}else{
				System.out.println("NO VOCAL");
			}
		}while(caracter!=' ');
		return;
	}

}
