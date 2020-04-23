package recursos;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase menu
 * @author Alberto Miguel Martinez Jimenez
 *
 */
public class Menu {
/**
 * Pinta en pantalla un menu con el titulo
 * y las opciones pasadas por parametro	
 * @param titulo String
 * @param opciones String[]
 * @return opcion int
 */
	public static int crearMenu(String titulo,String[] opciones) {
		int longitudOpciones = opciones.length;
		int opcionMenu=0;
		
		try {
			do {//Vuelve a mostrar menu si la opcion no es valida
				int i=0;
				System.out.println("..::-- "+titulo+" --::..");
				do {//Bucle que pinta el menu
					System.out.println("      "+(i+1)+"."+opciones[i]);
					i++;
				}while((i>-1)&&(i<longitudOpciones));
				System.out.print("\n");
				opcionMenu = Teclado.leerEntero("Introduce opcion: ");
			}while((opcionMenu<0)||(opcionMenu>longitudOpciones-1));
		}catch(Exception e){
			System.out.println("Ha ocurrido un error referente al menu");
		}
		return opcionMenu;//Devuelve opcion
	}
	
}
