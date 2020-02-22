package ejercicios;

import java.util.ArrayList;

/**
 * introduce valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * @author Alberto Miguel Martínez Jiménez
 */
public class ej2 {
	private int suma;
	private double media;
	private int maximo;
	private int minimo;
	ArrayList<Integer> aleatorios = new ArrayList<Integer>();


/**
 * Genera entero aleatorio entre 0 y 100 ambos inclusive
 * @param minimo int
 * @param maximo int
 * @return int
 */
	private int generarEnteroAleatorio(int minimo,int maximo) {
		return (int) Math.floor(Math.random()*(maximo-minimo)+minimo);
	}
/**
 * Rellena el ArrayList con valores enteros aleatorios	
 * @param nValores int
 * @param minimo int
 * @param maximo int
 */
	private void introducirValores(int nValores,int minimo, int maximo) {
		for(int i=0;i<nValores;i++) {
			aleatorios.add(generarEnteroAleatorio(0,100));
		}
	}
/**
 * Calcula la suma de todos los elementos del ArrayList	
 * @return int
 */
	public int suma() {
		int suma = 0;
		for(int i=0;i<aleatorios.size();i++) {
			suma = suma + aleatorios.get(i);
		}
		return suma;
	}
	
	public double media() {
		return suma()/aleatorios.size();
	}
	
	

//Getters y Setters
	public static int getSuma() {
		return suma;
	}
	public static void setSuma(int suma) {
		this.suma = suma;
	}
	public static double getMedia() {
		return media;
	}
	public static void setMedia(double media) {
		this.media = media;
	}
	public static int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

}
