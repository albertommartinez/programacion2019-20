import java.util.Scanner; //Importar la clase Scanner

/**
 * Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
 * circunferencias y las clasifique en uno de estos estados:
 * exteriores
 * tangentes exteriores
 * secantes
 * tangentes interiores
 * interiores
 * concéntricas
 * @author Alberto Miguel Martinez Jimenez
 */

/**
 * Algoritmo:
 * almacenar coordenadas del centro de la cirrcunferencia1
 * almacenar coordenadas del centro de la cirrcunferencia2
 * comprobar los siguentes valores:
 *
 * exteriores distanciaCentros>sumaRadios
 * tangentes exteriores distanciaCentros=sumaRadios
 * secantes distanciaCentros>restaRadios
 * tangentes interiores distanciaCentros=restaRadios
 * interiores distanciaCentros<restaRadios
 * concéntricas (x1,y1)=(x2,y2)
 *
 */


public class ej10 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double r1;
		double r2;
		double distancia;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Sistema para clasificar circunferencias por su posicion respecto a otra");
		System.out.println("Circunferencia1.Punto central______________________________________________________________");
		System.out.println("Introduce las coordenadas(ej.:x y)> ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		System.out.println("Introduce el radio de la circunferencia> ");
		r1 = scanner.nextDouble();
		System.out.println("Circunferencia2.Punto central______________________________________________________________");
		System.out.println("Introduce las coordenadas(ej.:x y)>");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		System.out.println("Introduce el radio de la circunferencia> ");
		r2 = scanner.nextDouble();

		
		distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));//Calcular la distancia entre dos puntos cartesianos
		  
		if(distancia==(r1+r2)){
		    System.out.println("Estas circunferencias son exteriores entre si");
		}else if(distancia==(r1+r2)){
			System.out.println("Estas circunferencias son tangentes entre si");
		}else if(distancia<(r1+r2)){
			System.out.println("Estas circunferencias son exteriores entre si");
		}else if(distancia==0){
			System.out.println("Estas circunferencias son concentricas entre si");
		}else if(distancia==(r1-r2)){
			System.out.println("Estas circunferencia son tangentes interiores entre si");
		}else if(distancia<(r1-r2)){
			System.out.println("Estas circunferencias son interiores entre si");
		}
	}

}
