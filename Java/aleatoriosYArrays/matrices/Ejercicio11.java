package listadoArrays.bidimensional;
/**
 * Ejercicio 11
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 *
 * @author Alberto Miguel Martínez Jiménez
 *
 */
class Ejercicio11 {

	public static void main(String[] args) {
		int[][] array = new int[10][10];//array que contendra los valores
		int[] diagonal = new int[10];//vector que almacena los valores de la diagonal del array
		int valor;
		int minimoRango = 200;//valor minimo del rango
		int maximoRango =300;//valor maximo del rango
		int minimo = 300;
		int maximo = 200;
		int media = 0;
		int rango = (maximo - minimo) + 1; //rango de valores aleatorios
		
		//Calculo
		//esta estructura de bucles For anidados recorre el array
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				valor = (int)(Math.random() * rango);//genera un valor aleatorio dentro del rango
				array[i][j] = valor;//asigna el valor en la posicion del vector
				if(i==j) { 
					diagonal[j] = valor;//si los indices i y j coinciden(diagonal) se asignan al vector diagonal
					media += valor;
					if(minimo>=valor) minimo = valor;
					if(maximo<=valor) maximo = valor;
				}
			}
		}
		System.out.println("La media de la diagonal es "+(media/=10));
		System.out.println("El minimo de la diagonal es "+minimo);
		System.out.println("La media de la diagonal es "+maximo);
		

	}

}
