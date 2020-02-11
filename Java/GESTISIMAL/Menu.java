package recursos;

import java.util.Scanner;

public class Menu {
/**
 * Pinta en pantalla un menu con el titulo
 * y las opciones pasadas por parametro	
 * @param titulo String
 * @param opciones String[]
 * @return opcion int
 */
	public static int crearMenu(String titulo,String[] opciones) {
		Scanner teclado = new Scanner(System.in);//instancia el objeto Scanner
		int longitudOpciones = opciones.length;
		int opcionMenu=0;
		
			do {//Vuelve a mostrar menu si la opcion no es valida
				int i=0;
				System.out.println("..::-- "+titulo+" --::..");
				do {//Bucle que pinta el menu
					System.out.println("      "+i+"."+opciones[i]);
					i++;
				}while((i>-1)&&(i<longitudOpciones));
				System.out.print("\n");
				System.out.println("Introduce opcion> ");
				opcionMenu = teclado.nextInt();//Recoge opcion
			}while((opcionMenu<0)||(opcionMenu>longitudOpciones-1));
		return opcionMenu;//Devuelve opcion
	}
}
