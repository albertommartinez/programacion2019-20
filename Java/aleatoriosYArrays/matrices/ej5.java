package matrices;

/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * n�meros enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). 
 * A continuaci�n, el programa deber� dar la posici�n tanto 
 * del m�ximo como del m�nimo.
 * @author Alberto Miguel Martinez Jimenez
 * 
 * Algoritmo
 * generar 60 enteros aleatorios entre 0 y 1000
 * almacenarlos en matriz[6][10]
 * si el n�mero actual, es mayor que el mayor, almacenar posici�n
 * si el n�mero actual, es menor que el menor, almacenar posici�n
 */
public class ej5 {

	public static void main(String[] args) {
		int[][] matriz = new int[6][10];
		int mayorX = 0;
		int mayorY = 0;
		int menorX = 0;
		int menorY = 0;
		int numero = 0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				numero = ((int)(Math.random()*1001));
				if(numero>(matriz[mayorX][mayorY])) {
					mayorX = i;
					mayorY = j;
				}else if(numero<(matriz[menorX][menorY])) {
					menorX = i;
					menorY = j;
				}
				matriz[i][j] = numero;
				//System.out.println(matriz[i][j]);
			}
		}
		System.out.println("Posici�n del mayor: "+mayorX+", "+mayorX);
		System.out.println("Posici�n del menor: "+menorX+", "+menorX);

	}

}
