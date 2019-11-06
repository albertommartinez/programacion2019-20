import java.util.Scanner; //Importar la clase Scanner

/**
* Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius
* @author Alberto Miguel Martinez Jimenez
*/

//Almacenar grados fahrenheit
//celsius = (fahrenheit - 32)*5/9
//Mostrar grados celsius

public class ej5 {
	public static void main(String[] arg) {
		double fahrenheit;
		double celsius;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce los grados Fahrenheit> ");
		fahrenheit = scanner.nextDouble();
		
		celsius = (fahrenheit - 32)*5/9;
		
		System.out.println(fahrenheit+" grados fahrenheit equivalen a "+celsius+" grados celsius");
		
	}
}

