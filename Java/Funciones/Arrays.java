package arrays;
/**
 * Compedio de funciones para trabajar con arrays(una dimensi�n)
 * @author Alberto Miguel Mart�nez Jim�nez
 */
class Arrays {

/**
 * crea un array y lo inicializa con valores enteros aleatorios
 * @param tamano int
 * @param min int
 * @param max int
 */
	public static void generaArrayInt(int tamano,int min,int max) {
		int[] array = new int[tamano];
		
		for(int i=0;i<max;i++) {
			array[i] = (int)(Math.floor(Math.random()*(max-min+1)+min));
		}
		
	}

/**
 * devuelve el valor m�nimo del array
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
 * devuelve el valor m�ximo del array
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
 * de enteros pasado por par�metro	
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
 * devuelve true si encuentra el n�mero pasado por
 * par�metro en el array y false en caso contrario	
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
 * devuelve le posici�n de un n�mero pasado por par�metro.
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
 * por pa�metro.	
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
	
	
}
