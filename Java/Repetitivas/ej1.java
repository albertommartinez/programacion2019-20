import java.util.Scanner; //Importar la clase Scanner

/**
 * Crea una aplicación que permita adivinar un número. 
 * La aplicación genera un número aleatorio del 1 al 100. 
 * A continuación va pidiendo números y va respondiendo 
 * si el número a adivinar es mayor o menor que el introducido,
 * además de los intentos que te quedan (tienes 10 intentos para acertarlo). 
 * El programa termina cuando se acierta el número 
 * (además te dice en cuantos intentos lo has acertado), 
 * si se llega al limite de intentos te muestra el número que había generado.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * generar un número aleatorio de 1 a 100. Math.floor(Math.random()*(nMayor-nMenor+1)+nMenor);  
 * pedir entero
 * si entero < aleatorio,mostrar "el número es mayor"
 * si entero > aleatorio,mostrar "el número es menor"
 * si entero == aleatorio y intentos <= 10, mostrar "Acertaste, en " + i + "intentos"
 * si no, mostrar "has perdido" 
 */


public class ej1 {

	public static void main(String[] args) {
		int aleatorio;
		int numero;
		int intentos = 0;
		boolean acierto = false;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Juego adivinar número---");
		aleatorio = (int)(Math.random()*(100-1+1)+1);//Genera número aleatorio de 1 a 100
		
		do {
			System.out.println("¿Que número del 1 a 100 estoy pensando?> ");
			numero = scanner.nextInt();
			if(numero==aleatorio) {
				acierto = true;
				System.out.println("Has acertado en "+(intentos+1)+" intentos");
			}else if(intentos==10){
				System.out.println("Has perdido agotaste los 10 intentos");
				break;
			}else{
				if(aleatorio<numero) {
					System.out.println("El número que he pensado es menor");
				}else{
					System.out.println("El número que he pensado es mayor");
				}
			}
			intentos++;
		}while(acierto!=true);
		
	}

}
