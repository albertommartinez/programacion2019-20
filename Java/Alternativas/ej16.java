import java.util.Scanner;

/**
 * La política de cobro de una compañía telefónica es: 
 * cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, 
 * de tal forma que los primeros cinco minutos cuestan 1 euro, 
 * los siguientes tres, 80 céntimos, 
 * los siguientes dos minutos, 70 céntimos, 
 * y a partir del décimo minuto, 50 céntimos. 
 * Además, se carga un impuesto de 3 % cuando es domingo, 
 * y si es otro día, 
 * 		en turno de mañana, 15 %, 
 * 		y en turno de tarde, 10 %. 
 * Realice un algoritmo para determinar cuánto debe pagar 
 * por cada concepto una persona que realiza una llamada.
 * @author Alberto Miguel Martinez Jimenez
 *
 */


public class ej16 {

	public static void main(String[] args) {
		int duracion;
		double precioLLamada = 0;
		double precioTotal = 0;
		String domingo;
		String turno;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("---Tarificación de llamada---");
		System.out.println("Introduce la duración de la llamada> ");
		duracion = scanner.nextInt();
		
		if((duracion<=10)&&(duracion>8)) {
			precioLLamada = 2.50;
		}else if((duracion<=8)&&(duracion>5)) {
			precioLLamada = 1.80;
		}else if(duracion<=5) {
			precioLLamada = 1;
		}else if(duracion>10) {
			precioLLamada = 3;
		}else{
			System.out.println("Datos erroneos");
		}
		
		
		
		
		System.out.println("¿Es Domingo?[s/n]> ");
		domingo = scanner.next().toLowerCase();
		if(domingo.equals("s")) {
			precioTotal = precioLLamada * 1.03;
		}else if(domingo.equals("n")) {
			System.out.println("Introduce el turno[matutino o vespertino]> ");
			turno = scanner.next().toLowerCase();
			if(turno.equals("matutino")){
				precioTotal = precioLLamada * 1.15;
			}else if(turno.equals("vespertino")) {
				precioTotal = precioLLamada * 1.10;
			}else{
				System.out.println("El turno no es correcto");
			}
		}
		
		System.out.println("El coste de la llamada es "+precioTotal);
	}

}
