package recursos;

import java.util.Scanner;

/**
 * Facilita el manejo de entrada de datos por teclado
 * @author Alberto Miguel Martinez Jimenez
 *
 */
public class Teclado {
	
	static Scanner Teclado = new Scanner(System.in);

/**
 * lee un valor entero por teclado
 * @return int valor entero de lectura sino devuelve 0
 */
	public static int leerEntero() {
			return Teclado.nextInt();
	}
/**
 * lee un valor entero por teclado
 * despues de mostrar el mensaje pasado por parametro
 * @param String msg mensaje a mostrar
 * @return int valor entero de lectura sino devuelve 0
 */
	public static int leerEntero(String msg) {
		System.out.print(msg);
		return leerEntero();
	}

/**
 * lee un valor decimal por teclado
 * @return double valor decimal de lectura sino devuelve 0
 */
	public static double leerDecimal() {
			return Teclado.nextDouble();
	}
/**
 * lee un valor decimal por teclado
 * despues de mostrar el mensaje pasado por parametro
 * @param String msg mensaje a mostrar
 * @return double valor decimal de lectura sino devuelve 0
 */
	public static double leerDecimal(String msg) {
		System.out.print(msg);
		return leerDecimal();
	}
	
/**
 * lee una cadena por teclado
 * @return String devuelve cadena sino devuelve null
 */
	public static String leerCadena() {
			return Teclado.next();
	}
/**
 * lee una cadena por teclado
 * despues de mostrar el mensaje pasado por parametro
 * @param String msg mensaje a mostrar
 * @return String devuelve cadena sino devuelve null
 */
	public static String leerCadena(String msg) {
		System.out.print(msg);
		return leerCadena();
	}


}
