package aleatorios;
import java.util.Scanner;

/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. 
 * Muestra también el máximo, el mínimo, la moda, la media, la mediana y la desviación típica de esos números.
 * @author Alberto Miguel Martínez Jiménez
 *
 * ALGORITMO
 * repetir hasta i=50
 * 	generar aleatorio entre 100 y 199
 * 	almacenar aleatorio en vector
 * 	mayor = 100
 * 	menor = 199
 * 	sumatorio = 0
 * 	si i>0
 * 		si vector[i]>vector[i-1]
 * 			mayor = vector[i]
 * 		si no
 * 			menor = vector[i]
 * 		sumatorio += vector[i]
 * fin hasta
 * media = sumatorio/i
 */ 
public class ej5 {

	public static void main(String[] args) {
		//int aleatorio = 0;
		int[] numeros = new int[50];
		int mayor = 100;
		int menor = 199;
		int sumatorio = 0;
		int media = 0;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		
		for(i=0;i<50;i++) {
			numeros[i] = (int)(Math.floor(Math.random()*(100-200)+200));
			if(i>0) {
				if(numeros[i]>numeros[i+1]) {
					mayor = numeros[i];
				}else if(numeros[i]<numeros[i+1]){
					menor = numeros[i+1];
				}else{
					continue;
				}
				sumatorio += numeros[i];
			}
		}
		media = sumatorio/(i+1);
	}

}
