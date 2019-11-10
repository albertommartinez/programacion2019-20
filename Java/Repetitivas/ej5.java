import java.util.Scanner; //Importar la clase Scanner

/**
 * Escribe un programa que pida el limite inferior y superior de un intervalo. 
 * Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 
 * A continuación se van introduciendo números hasta que introduzcamos el 0. 
 * Cuando termine el programa dará las siguientes informaciones:
 * 		La suma de los números que están dentro del intervalo (intervalo abierto).
 * 		Cuantos números están fuera del intervalo.
 * 		Informa si hemos introducido algún número igual a los límites del intervalo.
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
			System.out.println("Introduce un número> ");
			numero = scanner.nextInt();
			if((numero>limiteInferior)&&(numero<limiteSuperior)) {
				sumaDentroRango = sumaDentroRango + numero;
			}else if((numero<limiteInferior)||(numero>limiteSuperior)) {
				fueraRango++;
			}else if((numero==limiteInferior)||(numero==limiteSuperior)) {
				limiteIntervalo = true;
			}
		}while(numero!=0);
		System.out.println("La suma de los números dentro del intervalo es "+sumaDentroRango);
		System.out.println("Hay "+fueraRango+" número fuera del rango");
		if(limiteIntervalo) {
			System.out.println("Hay números que coinciden con los límites");
		}else{
			System.out.println("No hay números que coinciden con los límites");
		}
	}

}
