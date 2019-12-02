package matematicas;

public class Matematicas {
	
//******Funciones Básicas******
/**
 * devuelve si el entero pasado por parámetro
 * es primo o no	
 * @param numero int
 * @return boolean
 */
	public static boolean esPrimo(int numero) {
		for(int i=2;i<numero;i++) {
			if((numero%i)==0) {
				return false;
			}
		}
		return true;
	}

/**
 * calcula una potencia dado base y exponente
 * @param base double
 * @param exponente int
 * @return double
 */
	public static double potencia(double base,int exponente) {
		return Math.pow(base, exponente);
	}
	
/**
 * devuelve la longitud de un número entero
 * @param numero int
 * @return longitud int
 */
	public static int digitos(int numero) {
		int longitud = 0;
		
		if(numero==0) {
			return 1;
		}else{
			while(numero>0) {
				numero = numero/10;
				longitud++;
			}
			return longitud;
		}
	}
/**
 * devuelve la concatenación de dos números enteros	
 * @param numeroA int
 * @param numeroB int
 * @return numeroC int
 */
	public static int juntaNumeros(int numeroA, int numeroB) {
		return Integer.valueOf(String.valueOf(numeroA) + String.valueOf(numeroB));
	}
//******Funciones Complejas******
/**
 * devuelve el número pasado por parámetro
 * en orden inverso
 * @param numero int
 * @return invertido int
 */
	public static int voltea(int numero) {
		int invertido = 0;
		for(int i=0;i<digitos(numero);i++) {
			invertido = invertido*10+(numero%10);
			numero/=10;
		}
		return invertido;
	}
/**
 * devuelve el primer número primo
 * desde un entero pasado por parámetro
 * @param numero int
 * @return numero int
 */
	public static int siguientePrimo(int numero) {
		while(!esPrimo(numero)){
			numero++;
		}
		return numero;
	}
/**
 * devuelve true si el número pasado por parámetro
 * es capicúa	
 * @param numero int
 * @return boolean
 */
	public static boolean esCapicua(int numero) {
		if(voltea(numero)==numero) {
			return true;
		}else{
			return false;
		}
	}
/**
 * devuelve el digito de la posición n pasada por parámetro	
 * @param n int
 * @return int
 */
	public static int digitoN(int numero,int n) {
		return Integer.valueOf(String.valueOf(numero).charAt(n));//obtiene la cifra como caracter de una cadena y lo devuelve como entero	
	}
/**
 * devuelve la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.	
 * @param numero int
 * @param digito int
 * @return int
 */
	public static int posicionDeDigito(int numero,int digito) {
		for(int i=0;i<digitos(numero);i++) {
			if(digito==digitoN(numero,i)) {
				return i;
			}
			return -1;
		}
		return -1;
	}
	
}
