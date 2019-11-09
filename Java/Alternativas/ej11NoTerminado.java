import java.util.Scanner; //Importar la clase Scanner

/**
 * Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones 
 * de los lados de un triángulo. 
 * El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
 * Si se cumple Pitágoras entonces es triángulo rectángulo
 * Si sólo dos lados del triángulo son iguales entonces es isósceles.
 * Si los 3 lados son iguales entonces es equilátero.
 * Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 *
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Almacenar A, B y C
 * Comprobar si los tres lados son iguales
 * Si se cumple será equilatero
 * Si no, comprobamos si cumple Pitágoras
 * Si lo cumple es rectangulo
 * Cumpla o no Pitágoras, comprobamos si es isósceles
 * si no lo es es escaleno
 */
public class ej11NoTerminado {

	public static void main(String[] args) {
		double ladoA;
		double ladoB;
		double ladoC;
		double mayor;
		double hipotenusa;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Identificar el tipo de triángulo---");
		System.out.println("Introduce el tamañode los tres lados(Ej.: 4 6 2)> ");
		ladoA = scanner.nextDouble();
		ladoB = scanner.nextDouble();
		ladoC = scanner.nextDouble();
		
		if((ladoA==ladoB)&&(ladoB==ladoC)){
			System.out.println("El triángulo es equilatero");
		}else{
			
		}
	}

}
