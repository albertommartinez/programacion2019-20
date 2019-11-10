import java.util.Scanner; //Importar la clase Scanner

/**
 * Mostrar en pantalla los N primero n�mero primos.
 *  Se pide por teclado la cantidad de n�meros primos que queremos mostrar.
 *  @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar cantidad n�meros primos
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
		
		System.out.println("Introduce la cantidad de n�meros primos que deseas> ");
		cantidadPrimos = scanner.nextInt();
		
		for(int i=0;i<cantidadPrimos-1;i++) {
			primo = true;
			for(int j=3;j<=numero;j++) {
				if(j%numero==0) {
					primo = false;
				}else{
					System.out.println(numero);
				}
			}
			
		}

	}

}
