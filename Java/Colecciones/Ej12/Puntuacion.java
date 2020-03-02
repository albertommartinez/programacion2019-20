package ej12;

import java.util.HashMap;

class Puntuacion {
	HashMap<String,Integer> puntos = new HashMap<String,Integer>();
		
		Puntuacion() {
			puntos.put("AS", 11);
			puntos.put("TRES", 10);
			puntos.put("SOTA", 2);
			puntos.put("CABALLO", 3);
			puntos.put("REY", 4);
		}
}
