import java.util.Scanner; //Importar la clase Scanner

/**
 * Escribe un programa que pida el limite inferior y superior de un intervalo. 
 * Si el l�mite inferior es mayor que el superior lo tiene que volver a pedir.�
 * A continuaci�n se van introduciendo n�meros hasta que introduzcamos el 0. 
 * Cuando termine el programa dar� las siguientes informaciones:
 * 		La suma de los n�meros que est�n dentro del intervalo (intervalo abierto).
 * 		Cuantos n�meros est�n fuera del intervalo.
 * 		Informa si hemos introducido alg�n n�mero igual a los l�mites del intervalo.
 * 
 * @author Alberto Miguel Martinez Jimenez
 *
 */


public class ej5 {

	public static void main(String[] args) {
		int limiteInferior;
		int limiteSuperior;
		int numero;
		int sumaDentroRango = 0;
		int fueraRango = 0;
		boolean limiteIntervalo = false;
		boolean validado = true;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Valores de un intervalo de enteros---");
		do {
			if(!validado) {
				System.out.println("Datos erroneos. Debes reintroducirlos");
			}
			System.out.println("Limite Inferior> ");
			limiteInferior = scanner.nextInt();
			System.out.println("Limite Superior> ");
			limiteSuperior = scanner.nextInt();
			if(limiteInferior<limiteSuperior) {
				validado = true;
			}
		}while(!validado);
		
		do {
			System.out.println("Introduce un n�mero> ");
			numero = scanner.nextInt();
			if((numero>limiteInferior)&&(numero<limiteSuperior)) {
				sumaDentroRango = sumaDentroRango + numero;
			}else if((numero<limiteInferior)||(numero>limiteSuperior)) {
				fueraRango++;
			}else if((numero==limiteInferior)||(numero==limiteSuperior)) {
				limiteIntervalo = true;
			}
		}while(numero!=0);
		System.out.println("La suma de los n�meros dentro del intervalo es "+sumaDentroRango);
		System.out.println("Hay "+fueraRango+" n�mero fuera del rango");
		if(limiteIntervalo) {
			System.out.println("Hay n�meros que coinciden con los l�mites");
		}else{
			System.out.println("No hay n�meros que coinciden con los l�mites");
		}
	}

}
