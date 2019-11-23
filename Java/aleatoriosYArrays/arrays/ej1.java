package arrays;


/**
 * Define un array de 12 n�meros enteros con nombre num y asigna los valores
 * seg�n la tabla que se muestra a continuaci�n. Muestra el contenido de todos
 * los elementos del array. �Qu� sucede con los valores de los elementos que no
 * han sido inicializados? Cuando no se le asigna valor se inicializa a 0
 * @author Alberto Miguel Mart�nez Jim�nez
 */
public class ej1 {

	public static void main(String[] args) {
		int[] num = new int[12];
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		for(int i=0;i<12;i++) {
			System.out.println(num[i]);
		}
	}

}
