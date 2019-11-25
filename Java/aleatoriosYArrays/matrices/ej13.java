package matrices;

/**
 * Realiza un programa que calcule la estatura media, m�nima y m�xima en
 * cent�metros de personas de diferentes pa�ses. 
 * El array que contiene los nombres de los paises es el siguiente: 
 * pais = {�Espa�a�, �Rusia�, �Jap�n�, �Australia�}. 
 * Los datos sobre las estaturas se deben simular mediante un array de 
 * 4 filas por 10 columnas con n�meros aleatorios generados al azar entre 140 y 210. 
 * Los decimales de la media se pueden despreciar. Los nombres de los pa�ses se 
 * deben mostrar utilizando el array de pa�ses (no se pueden escribir directamente).
 * @author Alberto Miguel Martinez Jimenez
 * ALGORITMO
 * generar matriz[4,10] con aleatorios de 140 a 210
 *	hacer hasta 4
 * 		hacer hasta 10
 * 			almacenar minimo
 * 			almacenar maximo
 * 			incrementar sumatorio
 * 		fin hasta
 * fin hasta
 */
public class ej13 {

	public static void main(String[] args) {
		String[] PAIS = {"Espa�a", "Rusia", "Jap�n", "Australia"};
		int sumatorioPais;
		int mayorPais;
		int menorPais;
		int mediaPais;
		int[][] matriz = new int[4][10];
		
		//rellenar la matriz con valores enteros aleatorios entre 140 y 210, ambos inclusive
		for(int i=0;i<4;i++) {
			for(int j=0;j<10;j++) {
				matriz[i][j] = (int)(Math.floor(Math.random()*(210-140+1)+140));
			}
		}
		
		for(int i=0;i<4;i++) {//recorre paises
			mayorPais = 140;
			menorPais =  210;
			mediaPais = 0;
			sumatorioPais = 0;
			for(int j=0;j<10;j++) {//recorre alturas
				if(matriz[i][j]>mayorPais) {
					mayorPais = matriz[i][j];
				}else if(matriz[i][j]<menorPais) {
					menorPais = matriz[i][j];
				}
				sumatorioPais = sumatorioPais +matriz[i][j];
			}
			mediaPais = sumatorioPais/10;
			System.out.println("Media de altura de "+PAIS[i]+": "+mediaPais);
			System.out.println("Maxima altura de "+PAIS[i]+": "+mayorPais);
			System.out.println("Minima altura de "+PAIS[i]+": "+menorPais);
			System.out.println("---------------------------------------------");
		}
		
	}

}
