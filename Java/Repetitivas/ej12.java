import java.util.Scanner; //Importar la clase Scanner

/**
 * Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
 * sustituye la aparición del primer carácter en la cadena por el segundo carácter.
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar cadena
 * Almacenar caracter1
 * Almacenar caracter2
 * hacer mientras i < longitud de cadena
 * si caracter posicion i = caracter1
 * caracter1 posicion1 = caracter2
 * posicion1 i =i +1
 * fin mientras
 * mostrar cadena
 */


public class ej12 {

	public static void main(String[] args) {
		String cadena1;
		String cadena2 = "";
		char caracter1;
		char caracter2;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Sustituir caracteres de una cadena");
		System.out.println("Introduce la cadena a modificar> ");
		cadena1 = scanner.nextLine();
			System.out.println(cadena1);
		System.out.println("Introduce caracter a sustituir> ");
		caracter1 = scanner.next().charAt(0);
			System.out.println(caracter1);
		System.out.println("Introduce caracter por cuál sustituir> ");
		caracter2 = scanner.next().charAt(0);
			System.out.println(caracter2);
		
		for(int i=0;i<cadena1.length();i++) {
			if(cadena1.charAt(i)==caracter1){
				cadena2 = cadena2 + caracter2;
			}else{
				cadena2 = cadena2 + cadena1.charAt(i);
			}
		}
		
		System.out.println("Cadena original: "+cadena1);
		System.out.println("Cadena actual: "+cadena2);
	}

}
