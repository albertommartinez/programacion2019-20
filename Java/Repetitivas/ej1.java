import java.util.Scanner; //Importar la clase Scanner

/**
 * Crea una aplicaci�n que permita adivinar un n�mero. 
 * La aplicaci�n genera un n�mero aleatorio del 1 al 100. 
 * A continuaci�n va pidiendo n�meros y va respondiendo 
 * si el n�mero a adivinar es mayor o menor que el introducido,
 * adem�s de los intentos que te quedan (tienes 10 intentos para acertarlo). 
 * El programa termina cuando se acierta el n�mero 
 * (adem�s te dice en cuantos intentos lo has acertado), 
 * si se llega al limite de intentos te muestra el n�mero que hab�a generado.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * generar un n�mero aleatorio de 1 a 100. Math.floor(Math.random()*(nMayor-nMenor+1)+nMenor);  
 * pedir entero
 * si entero < aleatorio,mostrar "el n�mero es mayor"
 * si entero > aleatorio,mostrar "el n�mero es menor"
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
		
		System.out.println("---Juego adivinar n�mero---");
		aleatorio = (int)(Math.random()*(100-1+1)+1);//Genera n�mero aleatorio de 1 a 100
		
		do {
			System.out.println("�Que n�mero del 1 a 100 estoy pensando?> ");
			numero = scanner.nextInt();
			if(numero==aleatorio) {
				acierto = true;
				System.out.println("Has acertado en "+(intentos+1)+" intentos");
			}else if(intentos==10){
				System.out.println("Has perdido agotaste los 10 intentos");
				break;
			}else{
				if(aleatorio<numero) {
					System.out.println("El n�mero que he pensado es menor");
				}else{
					System.out.println("El n�mero que he pensado es mayor");
				}
			}
			intentos++;
		}while(acierto!=true);
		
	}

}
