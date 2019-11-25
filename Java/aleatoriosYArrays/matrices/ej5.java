package matrices;

/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). 
 * A continuación, el programa deberá dar la posición tanto 
 * del máximo como del mínimo.
 * @author Alberto Miguel Martinez Jimenez
 * 
 * Algoritmo
 * generar 60 enteros aleatorios entre 0 y 1000
 * almacenarlos en matriz[6][10]
 * si el número actual, es mayor que el mayor, almacenar posición
 * si el número actual, es menor que el menor, almacenar posición
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
		System.out.println("Posición del mayor: "+mayorX+", "+mayorX);
		System.out.println("Posición del menor: "+menorX+", "+menorX);

	}

}
