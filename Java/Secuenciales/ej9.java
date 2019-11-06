import java.util.Scanner;

/**
* Una tienda ofrece un descuento del 15% sobre el total de la compra 
* y un cliente desea saber cuanto deberá pagar finalmente por su compra.
* @author Alberto Miguel Martinez Jimenez 
*/

//Almacenar el valor de la compra
//total=valorCompra*1.15
//mostrar total

public class ej9 {
	public static void main(String[] arg) {
		double valorCompra;
		double descuento;
		double total;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce el valor de la compra> ");
		valorCompra = scanner.nextDouble();
		descuento = valorCompra*0.10;
		total = valorCompra - descuento;
		
		System.out.println("El total a pagar es "+total);
	}
}