import java.util.Scanner; //Importar la clase Scanner

/**
 * Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar cadena
 * hacer mientras i < longitud cadena
 * si cadena[i] es minuscula 
 * cadena[i] a mayuscula
 * sino 
 * caden[i] a minuscula
 */



public class ej13 {

	public static void main(String[] args) {
		String cadena;
		String cadena2 = "";
		char caracter;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Coversor de minúscula y mayúsculas---");
		System.out.println("Introduce una cadena> ");
		cadena = scanner.nextLine();
		
		for(int i=0;i<cadena.length();i++) {
			caracter = cadena.charAt(i);
			if(caracter==Character.toLowerCase(cadena.charAt(i))) {
				cadena2 = cadena2 + Character.toUpperCase(cadena.charAt(i));
			}else{
				cadena2 = cadena2 + Character.toLowerCase(cadena.charAt(i));
			}
		}
		System.out.println(cadena2);
	}

}
