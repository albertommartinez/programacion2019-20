import java.util.Scanner; //Importar la clase Scanner

/**
 * Mostrar en pantalla los N primero número primos.
 *  Se pide por teclado la cantidad de números primos que queremos mostrar.
 *  @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar cantidad números primos
 * repetir 1 hasta cantidad-1 (-1 porque empezamos en 1)
 * 		primo = false
 * 		repetir divisor=3 hasta divisor=numero
 * 			si numero%divisor!=0
 * 			primo = false
 * 		si primo = true
 * 			contadorPrimos = contadorPrimos + 1
 * fin repetir
 * 
 */


public class ej9NoTerminado {

	public static void main(String[] args) {
		int cantidadPrimos;
		int contadorPrimos;
		int numero = 3;
		boolean primo;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce la cantidad de números primos que deseas> ");
		cantidadPrimos = scanner.nextInt();
		
		for(int i=0;i<cantidadPrimos-1;i++) {
			primo = true;
			for(int j=3;j<=Math.sqrt(numero) && primo;j++) {
				if(j%numero==0) {
					primo = false;
				}else{
					System.out.println(numero);
				}
			}
			
		}

	}

}
