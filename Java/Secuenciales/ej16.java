import java.util.Scanner;

/**
* Dos veh�culos viajan a diferentes velocidades (v1 y v2) y est�n distanciados�por una distancia d.�
* El que est� detr�s viaja a una velocidad mayor. 
* Se pide hacer un algoritmo�para ingresar la distancia entre los dos veh�culos (km) 
* y sus respectivas�velocidades (km/h) y con esto determinar y mostrar 
* en que tiempo (minutos)�alcanzar� el veh�culo m�s r�pido al otro.
* @author Alberto Miguel Martinez Jimenez
*/

//almacenar distancia
//almacenar velocidadMayor
//almacenar velocidadMenor
//tiempo = distancia/(velocidadMayor-velocidadMenor)
//tiempo(min) = tiempo*60
//mostrar tiempo

public class ej16 {
	public static void main(String[] args) {
		double distancia;
		double velocidadMayor;
		double velocidadMenor;
		double tiempo;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Calcular el tiempo en alcanzar un vehiculo a otro");
		System.out.println("Introduce la distancia entre ambos vehiculos> ");
		distancia = scanner.nextDouble();
		
		System.out.println("Introduce la velocidad mayor> ");
		velocidadMayor = scanner.nextDouble();
		
		System.out.println("Introduce la velocidad menor> ");
		velocidadMenor = scanner.nextDouble();
		
		tiempo = (distancia/(velocidadMayor/velocidadMenor))*60;
		
		System.out.println("El coche de atr�s alcanzar� al de delante en "+tiempo+" minutos");
	}
}