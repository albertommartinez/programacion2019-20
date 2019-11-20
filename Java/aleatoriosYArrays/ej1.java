package aleatorios;

/**
 *  Escribe un programa que muestre tres apuestas de la quiniela 
 *  en tres columnas para los 14 partidos y el pleno al quince (15 filas) 
 *  de forma que la probabilidad de que salga un 1 sea  de 1/2, 
 *  la probabilidad de que salga x sea de 1/3 y 
 *  la probabilidad de que salga 2 sea de 1/6. 
 *  Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * crear un que representa la apuesta (int[15])
 * generar 15 enteros aleatorios entre 0 y 4
 * la probabilidad de que salga 1 será el triple de que salga 2
 * y la probabilidadde que salga 2 será el doble de que salga 2
 */


public class ej1 {
	
	public static void main(String[] args) {
		char[] apuesta = new char[15];
		//La repetición de valores en el array corresponde a las probabilidades
		String[] equivalencias = {"1  ","1  ","1  "," X "," X ","  2"};
		int aleatorio;
		
		for(int i=0;i<15;i++) {
			aleatorio = (int)(Math.floor(Math.random()*6));
			System.out.println("Partido "+(i+1)+". "+equivalencias[aleatorio]);
		}		
	}
}
