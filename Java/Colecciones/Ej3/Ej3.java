package ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * @author Alberto Miguel Martínez Jiménez
 *
 */
class Ej3 {
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	Scanner scanner = new Scanner(System.in);
/**
 * Pide los números enteros para introducirlos en el arraylist	
 */
	public void introducirValores() {
		for(int i=0;i<10;i++) {
			System.out.println("Introduce un n�mero entero: ");
			arraylist.add(scanner.nextInt());
		}
	}
/**
 * Ordena de menor a mayor los valores del arraylist	
 */
	public void ordenarValores() {
		Collections.sort(arraylist);
	}
	
	public void mostrarArrayList() {
		for(int i=0;i<arraylist.size()-1;i++) {
			System.out.println(arraylist.get(i));
		}
	}
}
