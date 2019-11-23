package arrays;
import java.util.Scanner;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * @author Alberto Miguel Martinez Jimenez
 * 
 * ALGORITMO
 * almacenar temperaturas en vector
 * hacer hasta longitudVector
 * 		mostrar mes
 * 		hacer hasta vector[n]
 * 			
 * fin hacer
 */

public class ej8 {

	public static void main(String[] args) {
		//notese de que se nombra en mayúscula, porque va a ser constante
		String[] MESES = {"ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC"}; 
		int[] temperatura = new int[12];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("..::Gráfica Temperaturas Medias Mensuales::..");
		for(int i=0;i<12;i++) {
			System.out.println("Introduce temperatura media de "+MESES[i]+": ");
			temperatura[i] = scanner.nextInt();
		}
		for(int j=0;j<MESES.length;j++) {
			System.out.print(MESES[j]+"   ");
			for(int i=0;i<temperatura[j];i++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}

}
