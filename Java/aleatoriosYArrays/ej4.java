package aleatorios;
import java.util.Scanner;
/**
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. 
 * La cabeza se representará con el carácter @ y se debe colocar  exactamente en la posición 13 
 * (con 12 espacios delante). 
 * A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: 
 * se generará de forma aleatoria un valor entre tres posibles que hará 
 * que el siguiente carácter se  coloque una posición a la izquierda del anterior, 
 * alineado con el anterior o una posición a la derecha del anterior. 
 * La longitud de la serpiente se pedirá por teclado y se supone que el usuario 
 * introducirá un dato correcto. 
 * @author Alberto Miguel Martínez Jiménez
 * 
 * Algoritmo
 * Almacenar longitud de la serpiente
 * pintar la cabeza '@' en la posición 13
 * hacer mientras menor longitud serpiente
 * 		aleatorio = generarAleatorio(1,3)
 * 		hacer hasta  11+aleatorio
 * 			pintar '*'
 */
public class ej4 {

	public static void main(String[] args) {
		int longitud = 0;
		int aleatorio = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("..::Pintemos una bicha::..");
		System.out.println("Introduce la longitud de la serpiente: ");
		longitud = scanner.nextInt();
		
		System.out.println("            @");
		
		for(int i=0;i<longitud;i++) {
			aleatorio = ((int)(Math.random()*3));
			for(int j=0;j<(11+aleatorio);j++){ 
				System.out.print(" ");
				
			}
			System.out.println("*");
		}
		

	}

}
