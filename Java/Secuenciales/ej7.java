import java.util.Scanner;

/**
* Realiza un programa que reciba una cantidad de minutos 
* y muestre por pantalla a cuantas horas y minutos corresponde
*/

//Almacenar minutos
//minutos entre 60 devuelve horas
//minutos módulo 60 devuelve minutos restantes
//mostrar horas
//mostrar minutos restantes

public class ej7 {
	public static void main(String[] args) {
		int minutos;
		int minutos2;
		int horas;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce una cantidad de minutos para pasar a horas y minutos> ");
		minutos = scanner.nextInt();
		horas = (int)minutos/60;
		minutos2 = minutos%60;
		
		System.out.println(minutos+" minutos equivalen a "+horas+" horas y "+minutos2+" minutos");
	}
}