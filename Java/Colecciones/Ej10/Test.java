package ej10;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		String palabra;
		Scanner teclado = new Scanner(System.in);
		
		Diccionario diccionario = new Diccionario();
		
		System.out.println("Introduce una palabra en ingles para  traducirla: ");
		palabra = teclado.next();
		
		System.out.println(diccionario.diccionario.get(palabra));

	}

}
