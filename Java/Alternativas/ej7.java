import java.util.Scanner; //Importar la clase Scanner

/**
 * Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. 
 * Pueden ocurrir tres cosas:
 * El exponente sea positivo, sólo tienes que imprimir la potencia.
 * El exponente sea 0, el resultado es 1.
 * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar base
 * Almacenar exponente
 * Si el exponente es positivo muestra el resultado
 * Si el exponente es 0, muestra 1
 * Si el exponente es negativo, muestra 1/base^(esponente*(-1))
 */

public class ej7 {

	public static void main(String[] args) {
		double base;
		int exponente;
		double resultado = 0;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Exponenciación---");
		System.out.println("Introduce base y exponente> ");
		base = scanner.nextDouble();
		exponente = scanner.nextInt();
		
		if(exponente<0) {
			resultado = 1/Math.pow(base,(exponente*(-1)));
		}else if(exponente==0) {
			resultado = 1;
		}else if(exponente>0) {
			resultado = Math.pow(base, exponente);	
		}
		System.out.println("El resultado de elevar "+base+" a "+exponente+" es "+resultado);
	}

}
