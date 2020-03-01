package ej8;

import java.util.ArrayList;
import java.util.Collections;



public class Baraja {
	ArrayList<Carta> baraja = new ArrayList<Carta>();

	Baraja() {
		this.llenarBaraja();
		this.barajar();
	}
/**
 * Llena el objeto baraja de objetos Carta	
 */
	private void llenarBaraja() {
		for(palos palo : palos.values()) {//itera la enumeración que almacena los palos
			for(figuras figura : figuras.values()) {//itera la enumeración que almacena las figuras
				Carta carta = new Carta(palo,figura);//instancia una carta con la figura y el palo actual en las iteraciones
				baraja.add(carta);//añade el objeto carta al arrayList baraja
			}
		}
		
	}
/**
 * Desordena los valores del objeto baraja	
 */
	public void barajar() {
		Collections.shuffle(baraja);
	}
/**
 * Muestra el numero de cartas que se le pasa por parámetro	
 * @param cuantasCartas int
 */
	public void sacarCartas(int cuantasCartas) {
		for(int i=0;i<cuantasCartas;i++) {
			System.out.println(baraja.get(i));
			baraja.remove(i);
		}
	}
}


