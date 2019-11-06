import java.util.Scanner; //Importar la clase Scanner 
/**
 * Calcular el perímetro y área de un rectángulo dada su base y su altura.
 * @author Alberto Miguel Martinez Jimenez
 */

//Almacenar base
//Almacenar altura
//calcular perimetro = (base+altura)*2
//calcular area = base*altura
//mostrar perimetro
//mostrar area

public class ej2 {

	public static void main(String[] args) {
		double area;
		double perimetro;
		double base;
		double altura;
		
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner	
        
		System.out.print("Introduce la base del rectangulo> ");
		base = scanner.nextDouble();
		
		System.out.print("Introduce la altura del rectangulo> ");
		altura = scanner.nextDouble();
		
		area = base*altura;
		perimetro = (base+altura)*2;
		
		System.out.print("El rectangulo de base "+base+" y altura "+altura+" tiene un area de "+area+" y un perimetro de "+perimetro);
	}

}
