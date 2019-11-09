import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI; //Importar la clase Scanner

/**
 * La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
 * la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. 
 * Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, 
 * se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, 
 * considerando lo siguiente: 
 * si es de tipo A,
 *   se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; 
 *   y 30 céntimos si es de tamaño 2. 
 * Si es de tipo B, 
 *   se rebajan 30 céntimos cuando es de tamaño 1, 
 *   y 50 céntimos cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */

/**
 * Algoritmo
 * Almacenar precioInicial
 * Almacenar Cantidad
 * Almacenar Tipo
 * Almacenar Tamaño
 * si es tipoA
 * comprobamos tamaño
 * si es tamaño 1, le sumamos 0,20 al kilo
 * si es tamaño 2, le sumamos 0,30 al kilo
 * si es tipoB
 * comprobamos tamaño
 * si es tamaño 1, le sumamos 0,30 al kilo
 * si es tamaño 2, le sumamos 0,50 al kilo
 * mostramos precioFinal
 * @author canucho
 *
 */
public class ej14 {

	public static void main(String[] args) {
		double precioInicial = 0;
		double precioFinal = 0;
		String tipo;
		int tamanno;
		double cantidad;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Asociación de Vinicultores.Calculo de ganancia");
		System.out.println("Introduce el precio inicial> ");
		precioInicial = scanner.nextDouble();
		System.out.println("Introduce Cantidad de kilos de uva> ");
		cantidad = scanner.nextDouble();
		System.out.println("Introduce tipo de uva[A o B]>");
		tipo = scanner.next().toUpperCase();
		if(tipo.equals("A")) {
			System.out.println("Introduce el tamaño de la uva[1 o 2]> ");
			tamanno = scanner.nextInt();
			if(tamanno==1) {
				precioFinal = (precioInicial+0.20)*cantidad;
			}else if(tamanno==2) {
				precioFinal = (precioInicial+0.30)*cantidad;
			}else{
				System.out.println("Valor erroneo.");
			}
			
		}else if(tipo.equals("B")) {
			System.out.println("Introduce el tamaño de la uva[1 o 2]> ");
			tamanno = scanner.nextInt();
			if(tamanno==1) {
				precioFinal = (precioInicial+0.30)*cantidad;
			}else if(tamanno==2) {
				precioFinal = (precioInicial+0.50)*cantidad;
			}else{
				System.out.println("Valor erroneo.");
			}
		}
		
		System.out.println("La ganancia es "+precioFinal);
	}

}
