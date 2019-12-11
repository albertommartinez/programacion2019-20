package arrays;
/**
 * Compendio de funciones para trabajar con arrays(una dimensión)
 * @author Alberto Miguel Martínez Jiménez
 */
class Arrays {

/**
 * crea un array y lo inicializa con valores enteros aleatorios
 * @param tamano int
 * @param min int
 * @param max int
 */
	public static int[] generaArrayInt(int tamano,int min,int max) {
		int[] array = new int[tamano];
		
		for(int i=0;i<max;i++) {
			array[i] = (int)(Math.floor(Math.random()*(max-min+1)+min));
		}
		return array;
	}

/**
 * devuelve el valor mínimo del array
 * @param array int[]
 * @return int
 */
	public static int minimoArrayInt(int[] array) {
		int minimo = Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(minimo>array[i]) {
				minimo = array[i];
			}
		}
		return minimo;
	}
	
/**
 * devuelve el valor máximo del array
 * @param array int[]
 * @return int
 */
	public static int maximoArrayInt(int[] array) {
		int maximo = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(maximo<array[i]) {
				maximo = array[i];
			}
		}
		return maximo;
	}
/**
 * devuelve la media de los valores del array
 * de enteros pasado por parámetro	
 * @param array int[]
 * @return double
 */
	public static double mediaArrayInt(int[] array) {
		int sumatorio = 0;
		
		for(int i=0;i<array.length;i++) {
			sumatorio += array[i];
		}
		
		return sumatorio/array.length;
	}
/**
 * devuelve true si encuentra el número pasado por
 * parámetro en el array y false en caso contrario	
 * @param array int[]
 * @param nABuscar int
 * @return boolean
 */
	public static boolean estaEnArrayInt(int[] array,int nABuscar) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==nABuscar) {
				return true;
			}
		}
		return false;
	}
/**
 * devuelve le posición de un número pasado por parámetro.
 * Si no lo encuentra devuelve -1
 * @param array int[]
 * @param nABuscar int
 * @return int
 */
	public static int posicionEnArray(int[] array,int nABuscar) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==nABuscar) {
				return i;
			}
		}
		return -1;
	}
/**
 * invierte el orden de los valores del array pasado
 * por paámetro.	
 * @param array int[]
 * @return int[]
 */
	public static int[] volteaArrayInt(int[] array) {
		int aux = 0;
		int longitud = array.length;
		int indiceExtremo = array.length - 1;
		
		for(int i=0;i<longitud;i++) {
			aux = array[longitud-i];
			array[longitud-i] = array[i];
			array[i] = aux;
		}
		
		return array;
	}
/**
 * mueve n posiciones los valores de un array
 * hacia la derecha	
 * @param array int[]
 * @param n int
 */
	public static void rotaDerechaArrayInt(int[] array, int n) {
		int longitud = array.length;
		int[] arrayAux = new int[longitud];
		
		for(int i=0;i<longitud;i++) {
			if((i+n)>longitud) {
				arrayAux[(i+n)%longitud] = array[i];
			}else{
				arrayAux[i+n] = array[i];
			}
		}
		for(int i=0;i<longitud;i++) {
			array[i] = arrayAux[i];
		}
	}
	
/**
 * mueve n posiciones los valores de un array
 * hacia la izquierda	
 * @param array int[]
 * @param n int
 */
	public static void rotaIzquierdaArrayInt(int[] array, int n) {
		int longitud = array.length;
		int[] arrayAux = new int[longitud];	
		
		for(int i=longitud-1;i>-1;i--) {
			if((i-n)<0) {
				arrayAux[(longitud-1)-(n-i)] = array[i];
			}else{
				arrayAux[i-n] = array[i];
			}
		}
		for(int i=0;i<longitud;i++) {
			arrayAux[i] = array[i];
		}
	}
}
