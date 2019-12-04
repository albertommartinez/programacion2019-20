package matematicas;

public class Matematicas {
	

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
		return pegarPorDetras(numeroA,numeroB);
	}

/**
 * devuelve el número pasado por parámetro
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
		if(numero==voltea(numero)) {
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
		return trozoDeNumero(numero,n,n+1);	
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
		}
		return -1;
	}
/**
 * quita una cantidad de cifras pasadas por parámetro
 * al número pasado	
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
 * quita el número de cifras pasada por parámetro a un 
 * valor entero pasado	
 * @param numero int
 * @param nCifras int
 * @return int
 */
	public static int quitarPorDelante(int numero, int nCifras) {
		int longitud = digitos(numero);
		int posicionCorte = longitud - nCifras;//obtiene la posición desde donde se hace el corte
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
 * concatena dos números enteros por detras	
 * @param numeroA int
 * @param numeroB int
 * @return int
 */
	public static int pegarPorDetras(int numeroA,int numeroB) {
		return Integer.valueOf(String.valueOf(numeroA) + String.valueOf(numeroB));
	}
/**
 * concatena dos números enteros por delante
 * @param numeroA int
 * @param numeroB int
 * @return int
 */	
	public static int pegarPorDelante(int numeroA,int numeroB) {
		return Integer.valueOf(String.valueOf(numeroB) + String.valueOf(numeroA));
	}
/**
 * devuelve perte de un númeropasado por parémetro
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
