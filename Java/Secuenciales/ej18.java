import java.util.Scanner;

/**
*Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
* @author Alberto Miguel Martinez Jimenez
*/

//Almacenar nombre
//Almacenar primerApellido
//Almacenar segundoApellido
//Obtener el primer carácter de nombre
//Obtener el primer carácter de primerApellido
//Obtener el primer carácter de segundoApellido
//Mostrar caracteres

public class ej18 {
	public static void main(String[] args) {
		String nombre;
		String primerApellido;
		String segundoApellido;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Mostrar Iniciales");
		System.out.println("Introduce tu nombre> ");
		nombre = scanner.next();
		
		System.out.println("Introduce tu primer apellido> ");
		primerApellido = scanner.next();
		
		System.out.println("Introduce tu segundo apellido> ");
		segundoApellido = scanner.next();
		
		System.out.println(nombre.charAt(0)+"."+primerApellido.charAt(0)+"."+segundoApellido.charAt(0)+".");
	}
}