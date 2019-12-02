package matematicas;

public class Matematicas {
	
//******Funciones B�sicas******
/**
 * devuelve si el entero pasado por par�metro
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
 * devuelve la longitud de un n�mero entero
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
 * devuelve la concatenaci�n de dos n�meros enteros	
 * @param numeroA int
 * @param numeroB int
 * @return numeroC int
 */
	public static int juntaNumeros(int numeroA, int numeroB) {
		return Integer.valueOf(String.valueOf(numeroA) + String.valueOf(numeroB));
	}
//******Funciones Complejas******
/**
 * devuelve el n�mero pasado por par�metro
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
 * devuelve el primer n�mero primo
 * desde un entero pasado por par�metro
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
 * devuelve true si el n�mero pasado por par�metro
 * es capic�a	
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
 * devuelve el digito de la posici�n n pasada por par�metro	
 * @param n int
 * @return int
 */
	public static int digitoN(int numero,int n) {
		return Integer.valueOf(String.valueOf(numero).charAt(n));//obtiene la cifra como caracter de una cadena y lo devuelve como entero	
	}
/**
 * devuelve la posici�n de la primera ocurrencia de un d�gito
 * dentro de un n�mero entero. Si no se encuentra, devuelve -1.	
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
