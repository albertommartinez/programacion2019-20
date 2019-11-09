import java.util.Scanner; //Importar la clase Scanner

/**
 * Escribe un programa que pida un número entero entre uno y doce 
 * e imprima el número de días que tiene el mes correspondiente.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacena el mes del año (int)
 * si mes <1 o mes>12 devuelve error
 * si mes <= 7 y modulo2 de mes != 0
 * el mes tienes 31 dias
 * si mes <= 7 y modulo2 de mes == 0
 * el mes tiene 30
 * si el mes = 2 tiene 28
 * si mes > 7 y modulo2 de mes == 0
 * el mes tienes 31 dias
 * si mes > 7 y modulo2 de mes != 0
 */

public class ej19 {

	public static void main(String[] args) {
		int mes;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Dias del mes---");
		System.out.println("Introduce el número del mes a consultar su longitud> ");
		mes = scanner.nextInt();
		
		if((mes<1)||(mes>12)) {
			System.out.println("Dato erroneo. Ese mes o existe");
		}else if(mes<=7) {
			if(mes%2!=0) {
				System.out.println("El mes tiene 31 días");
			}else{
				if(mes==2) {
					System.out.println("El mes tiene 28 días");
				}else{
					System.out.println("El mes tiene 30 días");	
				}
			}
		}
	}

}
