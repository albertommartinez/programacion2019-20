import java.util.Scanner;

/**
* Dise�ar un algoritmo que nos diga el dinero que tenemos (en euros y c�ntimos)�
* despu�s de pedirnos cuantas monedas tenemos de 2e, 1e, 50 c�ntimos, 20 c�ntimos�o 10 c�ntimos).
* @author Alberto Miguel Martinez Jimenez
*/

public class ej20 {
	public static void main(String[] args) {
		double e2;
		double e1;
		double e050;
		double e020;
		double e010;
		double cantidad;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("�Cuanto dinero tienes?> ");
		cantidad = scanner.nextDouble();
		e2 = (int)cantidad/2;
		cantidad = cantidad-(e2*2);
		e1 = (int)cantidad;
		cantidad = cantidad - e1;
		e050 = (int)cantidad/0.50;
		cantidad = cantidad - (e050*0.50);
		e020 = (int)cantidad/0.20;
		cantidad = cantidad - (e020*0.20);
		e010 = (int)cantidad/0.10;
		cantidad = cantidad - (e010*0.10);
		
		System.out.println(cantidad+" Euros equivale a ");
		System.out.println(e2+" monedas de 2 euros");
		System.out.println(e1+" monedas de 1 euros");
		System.out.println(e050+" monedas de 0.50 euros");
		System.out.println(e020+" monedas de 0.20 euros");
		System.out.println(e010+" monedas de 0.10 euros");
		
	}
}