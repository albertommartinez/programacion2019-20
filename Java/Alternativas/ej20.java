import java.util.Scanner; //Importar la clase Scanner

/**
 * Una compañía de transporte internacional tiene servicio en algunos países de 
 * América del Norte, América Central, América del Sur, Europa y Asia. 
 * El costo por el servicio de transporte se basa en el peso del paquete y 
 * la zona a la que va dirigido. Lo anterior se muestra en la tabla:
 * ZONA			UBICACIÓN			COSTO/GRAMO
 * 1			América del Norte		24.00 euros
 * 2			América Central			20.00 euros
 * 3			América del Sur			21.00 euros
 * 4			Europa					10.00 euros
 * 5			Asia					18.00 euros
 * Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, 
 * esto por cuestiones de logística y de seguridad. 
 * Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, 
 * el rechazo de la entrega.
 * 
 * @author Alberto Miguel Martinez Jimenez
 */
/**
 * Algoritmo
 * Almacenar peso
 * Almacenar zona
 * si el peso es menos a 5kg
 * segun la zona
 * calcular peso*costeGramo
 */



public class ej20 {

	public static void main(String[] args) {
		double peso;
		int zona;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Paqueteria---");
		System.out.println("Introduce el peso del paquete(gr)> ");
		peso = scanner.nextDouble();
		if(peso>=5000) {
			System.out.println("El envio ha sido rechazado por exceso de peso");
		}else{
			System.out.println("------------------------------------");
			System.out.println("ZONA  UBICACIÓN         COSTO/GR    ");
			System.out.println("------------------------------------");
			System.out.println("1     América del N.     24.00 euros");
			System.out.println("2     América central    20.00 euros");
			System.out.println("3     América del sur    21.00 euros");
			System.out.println("4     Europa             10.00 euros");
			System.out.println("5     Asia               18.00 euros");
			System.out.println("------------------------------------");
			System.out.println("Introduce zona de envío> ");
			zona = scanner.nextInt();
			
			switch(zona) {
			case 1:
				System.out.println("El precio del envío es "+(peso*24.00)+" Euros");
				break;
			case 2:
				System.out.println("El precio del envío es "+(peso*20.00)+" Euros");
				break;
			case 3:
				System.out.println("El precio del envío es "+(peso*21.00)+" Euros");
				break;
			case 4:
				System.out.println("El precio del envío es "+(peso*10.00)+" Euros");
				break;
			case 5:
				System.out.println("El precio del envío es "+(peso*18.00)+" Euros");
				break;
			default:
				System.out.println("Los datos introducidos son erroneos");
			
			}
		}
		
	}

}
