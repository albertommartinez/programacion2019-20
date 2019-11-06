import java.util.Scanner;

/**
* Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. 
* Calcula y muestra la distancia entre ellos.
* @author Alberto Miguel Martinez Jimenez 
*/

//Almacenar el valor x del punto1
//Almacenar el valor y del punto1
//Almacenar el valor x del punto2
//Almacenar el valor y del punto2
//Aplicar fórmula distancia = Math.sqrt((x2-x1)**2+(y2-y1)**2)
//mostrar distancia

public class ej12 {
	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		double distancia;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Introduce la coordenada X del punto1>");
		x1 = scanner.nextInt();
		
		System.out.println("Introduce la coordenada Y del punto1>");
		y1 = scanner.nextInt();
		
		System.out.println("Introduce la coordenada X del punto2>");
		x2 = scanner.nextInt();
		
		System.out.println("Introduce la coordenada Y del punto2>");
		y2 = scanner.nextInt();
		
		distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2-y1,2));
		System.out.println("La distancia entre ambos puntos es "+distancia);
	}
}