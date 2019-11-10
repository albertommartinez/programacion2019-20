import java.util.Scanner; //Importar la clase Scanner

/**
 * Escribir un programa que imprima todos los números pares 
 * entre dos números que se le pidan al usuario.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * int numeroInicio;
 * int numeroFin;
 * if numero%2=0, mostrar número
 */

public class ej4 {

	public static void main(String[] args) {
		int numeroInicio;
		int numeroFin;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("-Mostrar números pares en un rango-");
		System.out.println("número de comienzo de rango> ");
		numeroInicio = scanner.nextInt();
		System.out.println("número de fin de rango> ");
		numeroFin = scanner.nextInt();
		
		for(int i=numeroInicio;i<=numeroFin;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
