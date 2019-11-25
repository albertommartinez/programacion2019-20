package arrays;

/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. 
 * El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. 
 * Utiliza arrays auxiliares si es necesario.
 * @author Alberto Miguel Martinez Jimenez
 * 
 * ALGORITMO
 * almacenar 20 enteros aleatorios en array
 * hacer hasta longitud array
 * 		si array[posicion] es par
 * 			contadorPar = contadorPar + 1
 * 			arrayAuxiliar[contadoPar-1] = array[posicion]
 * 		sino
 * 			contadorImpar = contadorImpar + 1
 * 			arrayAuxiliar[(longitud-1)-contadorImpar] = array[posicion]
 * fin hacer
 * mostrar arrayAuxiliar
 */

public class ej10 {

	public static void main(String[] args) {
		int[] array = new int[20];
		//int[] arrayAux = new int[20];
		int contadorPar = -1;
		int contadorImpar = -1;
		int numero = 0;
		
		for(int i=0;i<21;i++) {
			numero = ((int)(Math.random()*21));
			if(numero%2==0) {
				contadorPar++;
				array[contadorPar] = numero;
			}else{
				contadorImpar--;
				array[(array.length-1)-contadorImpar] = numero;
			}
		}
		for(int i=0;i<20;i++) {
			System.out.println(array[i]);
		}
		
	}

}
