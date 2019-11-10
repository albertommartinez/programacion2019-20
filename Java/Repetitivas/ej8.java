
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
public class ej8 {

	public static void main(String[] args) {
		int segundos = 0;
		int minutos = 0;
		int horas = 0;
		
		while(true) {
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
			
			System.out.println(horas+":"+minutos+":"+segundos);
		}
	}
}
