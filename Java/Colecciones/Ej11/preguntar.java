package ej11;

import java.util.Scanner;

public class preguntar {
	int correctas = 0;
	int erroneas = 0;
	String respuesta;
	String respuestaCorrecta;
	
	Scanner teclado = new Scanner(System.in);
	Diccionario diccionario = new Diccionario();
	
	public void preguntas() {
		int contador = 0;
		for(String key : diccionario.diccionario.keySet()) {
			respuestaCorrecta = diccionario.diccionario.get(key);
			System.out.println("¿Como se dice "+key+" en ingles? ");
			respuesta = teclado.next();
				if(respuesta==respuestaCorrecta) {
					correctas++;
				}else{
					erroneas++;
				}
			if(contador<5) {
				contador++;
			}else{
				break;
			}
		}
			
	}
	
}
