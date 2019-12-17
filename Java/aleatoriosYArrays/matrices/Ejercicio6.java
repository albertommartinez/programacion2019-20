package listadoArrays.bidimensional;
/**
 * Ejercicio 5
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo.No se podrán repetir los valores en el array
 * @author Alberto Miguel Martínez Jiménez
 *
 */
class Ejercicio6 {
	
	public static void main(String[] args) {
		int[][] array = new int[6][10];//vector bidimensional que contendra los valores
		int minimoRango = 0;//valor minimo del rango
		int maximoRango =1000;//valor maximo del rango
		int minimo = 1000;
		int maximo = 0;
		int rango = (maximo - minimo) + 1; //rango de valores aleatorios
		int valorPosicion = 0;//valor a asignar
		//Calculos
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				valorPosicion = (int)(Math.random() * rango);
				//falta la linea para verificar la no repeticion
				array[i][j] = valorPosicion;//cuando se verifique que no se repite se asignara 
				if(minimo >= array[i][j]) {
					minimo = array[i][j];
				}
				if(maximo <= array[i][j]) {
					maximo = array[i][j];
				}
			}
		}
		System.out.print("El valor maximo es "+maximo+" y el valor minimo "+minimo);
		
	}
}
