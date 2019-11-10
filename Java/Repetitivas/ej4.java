import java.util.Scanner; //Importar la clase Scanner

/**
 * Escribir un programa que imprima todos los n�meros pares 
 * entre dos n�meros que se le pidan al usuario.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * int numeroInicio;
 * int numeroFin;
 * if numero%2=0, mostrar n�mero
 */

public class ej4 {

	public static void main(String[] args) {
		int numeroInicio;
		int numeroFin;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("-Mostrar n�meros pares en un rango-");
		System.out.println("n�mero de comienzo de rango> ");
		numeroInicio = scanner.nextInt();
		System.out.println("n�mero de fin de rango> ");
		numeroFin = scanner.nextInt();
		
		for(int i=numeroInicio;i<=numeroFin;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
