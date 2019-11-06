import java.util.Scanner;

/**
* Un vendedor recibe un sueldo base mas un 10% extra por comisión 
* de sus ventas, el vendedor desea saber cuanto dinero obtendrá por concepto 
* de comisiones por las tres ventas que realiza en el mes y el total que recibirá 
* en el mes tomando en cuenta su sueldo base y comisiones.
*/

//Almacenar sueldoBase
//Almacenar valor venta1
//Almacenar valor venta2
//Almacenar valor venta3
//Calcular total = sueldoBase + (venta1*0.10+venta2*0.10+venta3*0.10)

public class ej8 {
	public static void main(String[] args) {
		double sueldoBase;
		double venta1;
		double venta2;
		double venta3;
		double total;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce el sueldo base> ");
		sueldoBase = scanner.nextDouble();
		
		System.out.println("Introduce la primera venta del mes> ");
		venta1 = scanner.nextDouble();
		
		System.out.println("Introduce la segunda venta del mes> ");
		venta2 = scanner.nextDouble();
		
		System.out.println("Introduce la tercera venta del mes> ");
		venta3 = scanner.nextDouble();
		
		total = sueldoBase + (venta1*0.10+venta2*0.10+venta3*0.10);
		
		System.out.println("El total de ganancia en el mes es "+total);
		
	}
}