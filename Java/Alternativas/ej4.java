import java.util.Scanner; //Importar la clase Scanner 

/**
 * Crea un programa que pida al usuario dos números y 
 * muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo:
 * Almacenar numero1
 * Almacenar numero2
 * Si numero2 es 0 mostrar aviso
 * Si no mostrar numero1/numero2
 */
public class ej4 {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Dividir---");
		System.out.println("Introduce dos números> ");
		numero1 = scanner.nextDouble();
		numero2 = scanner.nextDouble();
		
		if(numero2!=0) {
			System.out.println("El resultado de la división es "+numero1/numero2);
		}else{
			System.out.println("El segundo número no puede ser 0");
		}
	}

}
