import java.util.Scanner; //Importar la clase Scanner

/**
 * Realizar un algoritmo que pida números 
 * (se pedirá por teclado la cantidad de números a introducir). 
 * El programa debe informar de cuantos números introducidos son 
 * mayores que 0, menores que 0 e iguales a 0.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar cantidad de nùmeros
 * Almacenar número
 * Si es mayor que 0 incrementar contadorPositivo
 * Si es menor a 0 incrementar contadorNegatico
 * Si es igual a 0 incrementar contadorCero
 * Mostrar los tres contadores
 */

public class ej2 {

	public static void main(String[] args) {
		int cantidadNumeros;
		double numero;
		int positivos = 0;
		int cero = 0;
		int negativos = 0;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Introducir números---");
		System.out.println("¿Cuantos números quieres introducir?> ");
		cantidadNumeros = scanner.nextInt();
		
		for(int i=0;i<cantidadNumeros;i++) {
			System.out.println("Introduce un numero> ");
			numero = scanner.nextDouble();
			if(numero>0) {
				positivos++;
			}else if(numero<0) {
				negativos++;
			}else {
				cero++;
			}
		}
		System.out.println("Has introducido "+positivos+" positivos, "+negativos+" negativos "+" y "+cero+" ceros");
	}

}
