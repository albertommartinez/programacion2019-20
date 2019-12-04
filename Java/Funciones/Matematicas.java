package matematicas;

public class Matematicas {
	

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
		return pegarPorDetras(numeroA,numeroB);
	}

/**
 * devuelve el n�mero pasado por par�metro
 * en orden inverso
 * @param numero int
 * @return invertido int
 */
	public static int voltea(int numero) {
		int invertido = 0;
		int longitud = digitos(numero);
		for(int i=0;i<longitud;i++) {
			invertido = Matematicas.juntaNumeros(invertido, numero%10);
			numero = numero/10;
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
		if(numero==voltea(numero)) {
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
		return trozoDeNumero(numero,n,n+1);	
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
		}
		return -1;
	}
/**
 * quita una cantidad de cifras pasadas por par�metro
 * al n�mero pasado	
 * @param numero int
 * @param nCifras int
 * @return int
 */
	public static int quitarPorDetras(int numero, int nCifras) {
		for(int i=0;i<nCifras;i++) {
			numero = numero/10;
		}
		return numero;
	}
/**
 * quita el n�mero de cifras pasada por par�metro a un 
 * valor entero pasado	
 * @param numero int
 * @param nCifras int
 * @return int
 */
	public static int quitarPorDelante(int numero, int nCifras) {
		int longitud = digitos(numero);
		int posicionCorte = longitud - nCifras;//obtiene la posici�n desde donde se hace el corte
		int divisor = 10;
		
		if(posicionCorte>0) {
			for(int i=0;i<posicionCorte;i++) {//se multiplica por 10 tantas veces como cifras se quieren quitar
				divisor = divisor*10;
			}
			return numero%divisor;
		}
		return -1;
	}
/**
 * concatena dos n�meros enteros por detras	
 * @param numeroA int
 * @param numeroB int
 * @return int
 */
	public static int pegarPorDetras(int numeroA,int numeroB) {
		return Integer.valueOf(String.valueOf(numeroA) + String.valueOf(numeroB));
	}
/**
 * concatena dos n�meros enteros por delante
 * @param numeroA int
 * @param numeroB int
 * @return int
 */	
	public static int pegarPorDelante(int numeroA,int numeroB) {
		return Integer.valueOf(String.valueOf(numeroB) + String.valueOf(numeroA));
	}
/**
 * devuelve perte de un n�meropasado por par�metro
 * desde uno a otro indice pasado	
 * @param numero int
 * @param posicionInicio int
 * @param posicionFinal int
 * @return int
 */
	public static int trozoDeNumero(int numero,int posicionInicio,int posicionFinal) {
		int numeroResp;
		int longitud;
		
		longitud = digitos(numero);
		numero = quitarPorDetras(numero,(longitud-posicionFinal));
		numero = quitarPorDelante(numero,posicionInicio);
		return numero;
	}
	
}
