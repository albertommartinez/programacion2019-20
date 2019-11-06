import java.util.Scanner; //Importar la clase Scanner 

/**
*Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
*@author alberto Miguel Martinez Jimenez 
*/

//Almacenar numero1
//Almacenar numero2
//mostrar numero1 + numero2
//mostrar numero1 - numero2
//mostrar numero1 * numero2
//mostrar numero1 / numero2

public class ej4 {
	public static void main(String[] arg) {
		double numero1;
		double numero2;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce un numero> ");
		numero1 = scanner.nextDouble();
		
		System.out.println("Introduce un numero> ");
		numero2 = scanner.nextDouble();
		
		System.out.println(numero1+" + "+numero2+" = "+numero1+numero2);
		System.out.println(numero1+" - "+numero2+" = "+numero1-numero2);
		System.out.println(numero1+" X "+numero2+" = "+numero1*numero2);
		System.out.println(numero1+" / "+numero2+" = "+numero1/numero2);
		
		
	}
}
