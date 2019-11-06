import java.util.Scanner; //Importar la clase Scanner 
/**
* Dados los catetos de un triángulo rectángulo, calcular su hipotenusa
*/

//Almacenar cateto1
//Almacenar cateto2
//Calcular hipotenusa = Math.pow((Math.pow(cateto1,2)+Math.pow(cateto2,2)),(1/2))

public class ej3 {
	public static void main(String[] args) {
		double cateto1;
		double cateto2;
		double hipotenusa;
		
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner	
		
		System.out.println("Introduce cateto1> ");
		cateto1 = scanner.nextDouble();
		
		System.out.println("Introduce cateto2> ");
		cateto2 = scanner.nextDouble();
		
		hipotenusa = Math.pow((Math.pow(cateto1, 2)+Math.pow(cateto2, 2)), (1/2));
		
		System.out.println("El tringulo cuyos catetos valen "+cateto1+" y "+cateto2+" tiene como hipotenusa "+hipotenusa);
	}
}