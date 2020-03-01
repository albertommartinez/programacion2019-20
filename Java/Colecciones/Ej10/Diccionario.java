package ej10;

import java.util.HashMap;

public class Diccionario {
	HashMap<String,String> diccionario = new HashMap<String,String>();
	
	Diccionario() {
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("raton", "mouse");
		diccionario.put("pez", "fish");
		diccionario.put("leon", "lion");
		diccionario.put("mono", "monkey");
		diccionario.put("rojo", "red");
		diccionario.put("verde", "green");
		diccionario.put("azul", "blue");
		diccionario.put("amarillo", "yellow");
		diccionario.put("naranja", "orange");
		diccionario.put("negro", "black");
		diccionario.put("blanco", "white");
		diccionario.put("bicicleta", "bike");
		diccionario.put("puerta", "door");
		diccionario.put("ventana", "window");
		diccionario.put("lapiz", "pencil");
		diccionario.put("fresa", "strawberry");
		diccionario.put("limon", "lemon");
		diccionario.put("manzana", "apple");
	}
	
	public String consultar(String palabra) {
		return diccionario.get(palabra);
	}
}
