import java.util.Scanner; //Importar la clase Scanner


/**
 * Realiza un programa que pida el día de la semana (del 1 al 7) 
 * y escriba el día correspondiente. Si introducimos otro número nos da un error.
 * 
 * @author Alberto Miguel Martinez Jimenez 
 */
/**
 * Algoritmo
 * Almacenar diaSemana(int)
 * devolver dia con ese numero de orden
 * si el numero < 1 o numero > 7 devuelve error
 */

public class ej18 {

	public static void main(String[] args) {
		int dia;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Día de la semana---");
		System.out.println("Introduce día de la semana(Ej.: Lunes=1)> ");
		dia = scanner.nextInt();
		switch(dia) {
			case 1:
				System.out.println("El día "+dia+" es lunes");
				break;
			case 2:
				System.out.println("El día "+dia+" es martes");
				break;
			case 3:
				System.out.println("El día "+dia+" es miércoles");
				break;
			case 4:
				System.out.println("El día "+dia+" es jueves");
				break;
			case 5:
				System.out.println("El día "+dia+" es viernes");
				break;
			case 6:
				System.out.println("El día "+dia+" es sábado");
				break;
			case 7:
				System.out.println("El día "+dia+" es domingo");
				break;
			default:
				System.out.println("Valor erroneo");
		}
	}

}
