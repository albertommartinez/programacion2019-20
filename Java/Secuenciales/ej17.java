import java.util.Scanner;

/**
* Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
* El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
* Escribir un algoritmo que determine la hora de llegada a la ciudad B
* @author Alberto Miguel Martinez Jimenez
*/

//almacenar Hora de salida
//almacenar minuto de salida
//almacenar segundo de salida
//almacenar segundos de duración
//transformar segundos a horas, minutos y segundos
//añadir la duración a los valores de la salida

public class ej17 {
	public static void main(String[] args) {
		int horaSalida;
		int minutoSalida;
		int segundoSalida;
		
		int segundosDuracion;
		int duracionHH;
		int duracionMM;
		int duracionSS;
		
		int horaLlegada;
		int minutoLlegada;
		int segundoLlegada;
		Scanner scanner = new Scanner(System.in);//Intanciar el objeto Scanner
		
		System.out.println("Determinar hora de llegada");
		System.out.println("---------------------------------");
		System.out.println("Introducir hora,minuto y segundo de salida");
		System.out.println("Hora de salida(HH)>");
		horaSalida = scanner.nextInt();
		
		System.out.println("Minuto de salida(MM)>");
		minutoSalida = scanner.nextInt();
		
		System.out.println("Segundo de salida(SS)>");
		segundoSalida = scanner.nextInt();
		
		System.out.println("---------------------------------");
		System.out.println("Introducir los segundos que dura el trayecto> ");
		segundosDuracion = scanner.nextInt();
		
		duracionHH = segundosDuracion / 3600;
		duracionMM = segundosDuracion % 3600;
		duracionSS = duracionMM & 60;
		
		horaLlegada = horaSalida + duracionHH;
		minutoLlegada = minutoSalida + duracionMM;
		segundoLlegada = segundoSalida + duracionSS;
		
		minutoLlegada = minutoLlegada+(segundoLlegada/60);
		segundoLlegada = segundoLlegada%60;
		
		horaLlegada = horaLlegada+(minutoLlegada/60);
		minutoLlegada = minutoLlegada%60;
		
		horaLlegada =horaLlegada%24;
		
		System.out.println(horaLlegada+":"+minutoLlegada+":"+segundoLlegada);
		
		
		
		
		
		
		
	}
}