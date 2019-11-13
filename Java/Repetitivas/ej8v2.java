import java.io.IOException;
import java.util.Scanner;

/**
 * Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
 * @author Alberto Miguel Martinez Jimenez
 *
 */
/**
 * Algoritmo
 * segundos = 0
 * minutos = 0
 * horas = 0
 * incremenar segundo cada 1000milisegundos 
 * incrementar minutos cada 60 segundos
 * poner segundos a 0
 * incrementar horas cada 60 minutos
 * poner a 0 minutos
 */
public class ej8v2 {

	public static void main(String[] args) throws IOException {
		int segundos = 0;
		int minutos = 0;
		int horas = 0;
		String cadenaSegundos;
		String cadenaMinutos;
		String cadenaHoras;
		
		while(true){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e ) {
				}
			
			if(segundos!=59) {
				segundos++;
			}else{
				if(minutos!=59) {
					minutos++;
					segundos = 0;
				}else{
					horas++;
					minutos = 0;
				}
			}
			
			if(segundos<10) {
				cadenaSegundos = "0"+segundos;
			}else{
				cadenaSegundos = String.valueOf(segundos);
			}
			if(minutos<10) {
				cadenaMinutos = "0"+minutos;
			}else{
				cadenaMinutos = String.valueOf(minutos);
			}
			
			if(horas<10) {
				cadenaHoras = "0"+horas;
			}else{
				cadenaHoras = String.valueOf(horas);
			}
			
			
			System.out.println(cadenaHoras+":"+cadenaMinutos+":"+cadenaSegundos);
			System.out.println("\b\b\b\b\b\b\b\b");
		}
	}
}
