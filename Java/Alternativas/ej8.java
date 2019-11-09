import java.util.Scanner; //Importar la clase Scanner

/**
 * Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
 * mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
 * dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
 * imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
 * @author Alberto Miguel Martinez Jimenez
 */

/**
 * Algoritmo.
 * Almacenar nota (double)
 * Almacenar edad (int)
 * Almacenar sexo (char)
 * si nota >= 5 y edad >= 18 y sexo = F muestra ACEPTADA
 * Si nota >= 5 y edad >= 18 y sexo = M muestra POSIBLE
 * Si no se cumple muestra NO ACEPTADA
 * 
 */

public class ej8 {

	public static void main(String[] args) {
		double nota;
		int edad;
		char sexo;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce nota> ");
		nota = scanner.nextDouble();
		System.out.println("Introduce edad> ");
		edad = scanner.nextInt();
		System.out.println("Introduce sexo(F o M o f o m)> ");
		sexo = scanner.next().charAt(0);
		
		if((sexo!='F')&&(sexo!='M')&&(sexo!='f')&&(sexo!='m')) {
			System.out.println("El campo sexo tiene un valor erroneo.");
		}
		
		if((nota >= 5)&&(edad >= 18)&&(sexo == 'F')||(sexo == 'f')) {
			System.out.println("ACEPTADA");
		}else if((nota >= 5)&&(edad >= 18)&&(sexo == 'M')||(sexo == 'm')) {
			System.out.println("POSIBLE");
		}else{
			System.out.println("NO ACEPTADA");
		}
	}

}
