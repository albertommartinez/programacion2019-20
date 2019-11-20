package numerosAleatorios;

/**
 * Realiza un programa que vaya generando n�meros aleatorios 
 * pares entre 0 y 100 y que no termine de generar n�meros 
 * hasta que no saque el 24. 
 * El  programa deber� decir al final cu�ntos n�meros se han generado.
 * @author Alberto Miguel Mart�nez Jim�nez
 */
/*
 * Algoritmo
 * hacer mientras aleatorios != 24
 * 		aleatorio = generarAleatorio(0,100)
 * 		si	aleatorio%2=0 
 * 			i++
 * 		si aleatorio == 24
 * 			salir
 * fin hacer
 */

public class ej2 {

	public static void main(String[] args) {
		int numeroAleatorio = 0;
		int cantidadAleatorios = 0;
		int i = 0;
		
		do {
			numeroAleatorio = (int)(Math.random()*100+1);
			if(numeroAleatorio%2==0) {
				System.out.println("-"+numeroAleatorio);
				i++;
				
			}	
		}while(numeroAleatorio!=24);
		System.out.println("Se ha generado "+i+" n�meros");
	}

}
