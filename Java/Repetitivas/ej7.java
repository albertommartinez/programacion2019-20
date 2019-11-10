

/**
 * Una persona adquirió un producto para pagar en 20 meses. 
 * El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. 
 * Realizar un programa para determinar cuánto debe pagar mensualmente 
 * y el total de lo que pagará después de los 20 meses.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * pago = 10
 * pagado = 10
 * repetir de mes 0 hasta 20
 * pagado = pago+(pago*2) 
 * mostrar pagado
 * terminar repetir
 * mostrar pagado
 */


public class ej7 {

	public static void main(String[] args) {
		int pago = 10;
		int pagado = 10;
		
		System.out.println("El pago inicial es 10 Euros");
		for(int i=0;i<20;i++) {
			pago = pago*2;
			pagado = pagado + pago;
			System.out.println("En el mes "+(i+1)+" ha pagado "+pago+" Euros");
		}
		System.out.println("En total ha pagado "+pagado+" Euros");
	}

}
