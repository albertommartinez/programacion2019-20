package numerosAleatorios;
import java.util.Scanner;
/**
 * Realiza un programa que llene la pantalla de 
 * caracteres aleatorios (a lo Matrix) con el código ascii 
 * entre el 32 y el 126. 
 * Puedes hacer casting con (char) para  convertir un entero en un carácter.
 * @author Alberto Miguel Martínez Jiménez
 */
public class ej3 {

	public static void main(String[] args) {
		char caracter;
		char tecla = 's';
		int ascii;
		Scanner scanner = new Scanner(System.in);
		
		int anchoLinea = (int)(Math.floor(Math.random()*(200-20+1)+20));
		do {
			for(int i=0;i<anchoLinea;i++) {
				caracter = (char)((int)(Math.random()*255+1));
				System.out.print(caracter);
			}
			System.out.print("\n");
			try{
				Thread.sleep(500);
			}catch(InterruptedException e ) {
				}
		}while(true);
		

	}

}
