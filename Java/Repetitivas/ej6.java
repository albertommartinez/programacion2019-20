import java.util.Scanner; //Importar la clase Scanner

/**
 * Escribe un programa que dados dos números, 
 * uno real (base) y un entero positivo (exponente), 
 * saque por pantalla el resultado de la potencia. 
 * No se puede utilizar el operador de potencia.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar base
 * Almacenar exponente
 * repetir hasta el exponente
 * base*base
 */


public class ej6 {

	public static void main(String[] args) {
		int base;
		int exponente;
		int resultado;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Calculo de potencias---");
		System.out.println("Introduce la base y el exponente(ej.: 4 5)> ");
		base = scanner.nextInt();
		exponente = scanner.nextInt();
		
		resultado = base;
		for(int i=1;i<exponente;i++) {
		resultado = resultado*base; 	
		}
		System.out.println("El resultado de elevar "+base+" a "+exponente+" es "+resultado);
	}

}
