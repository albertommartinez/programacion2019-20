import java.util.Scanner;

/**
*  Calcular la media de tres n�meros pedidos por teclado
*  @author Alberto Miguel Martinez Jimenez
*/

//Almacenar numero1
//Almacenar numero2
//Almacenar numero3
//sumar los numeros
//dividir entre tres
//mostrar la media

public class ej6 {
	public static void main(String[] args) {
		double sumatorio;
		double media;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce primer n�mero> ");
		sumatorio = scanner.nextDouble();
		
		System.out.println("Introduce segundo n�mero> ");
		sumatorio += scanner.nextDouble();
		
		System.out.println("Introduce tercer n�mero> ");
		sumatorio += scanner.nextDouble();
		
		media = sumatorio/3;
		
		System.out.println("La media es "+media);
	}
}