package ejercicio2;

import java.util.ArrayList;

/**
 * introduce valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * @author Alberto Miguel Martínez Jiménez
 */
public class Ej2 {
	private int suma;
	private double media;
	private int maximo;
	private int minimo;
	ArrayList<Integer> aleatorios = new ArrayList<Integer>();
	
	Ej2() {
		introducirValores(generarEnteroAleatorio(10,20),0,100);
	}
	

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
		int aleatorio = 0;
		for(int i=0;i<nValores;i++) {
			aleatorio = generarEnteroAleatorio(minimo,maximo);//0-100
			aleatorios.add(aleatorio);
			System.out.println(aleatorios.get(i));
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
/**
 * Devuelve el valor máximo del arrayList 	
 * @return
 */
	public int maximo() {
		int maximo = Integer.MIN_VALUE;//inicializar maximo al mínimo valor de un int, para que el primero siempre sea el máximo 
		int valor = aleatorios.get(0);//el primer valor extraido siempre sera el índice 0
		for(int i=0;i<aleatorios.size()-1;i++) {
			valor = aleatorios.get(i);
			if(maximo<valor) {
				maximo = valor;
			}
		}
		return maximo;
	}
	
/**
 * Devuelve el valor mínimo del arrayList 	
 * @return
 */
	public int minimo() {
		int minimo = Integer.MAX_VALUE;//inicializar minimo al máximo valor de un int, para que el primero siempre sea el mínimo 
		int valor = aleatorios.get(0);//el primer valor extraido siempre sera el índice 0
		for(int i=0;i<aleatorios.size()-1;i++) {
			valor = aleatorios.get(i);
			if(minimo>valor) {
				minimo = valor;
			}
		}
		return minimo;
	}
	

//Getters y Setters
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public int getMaximo() {
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
