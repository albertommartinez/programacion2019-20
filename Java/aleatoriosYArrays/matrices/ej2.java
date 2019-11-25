package matrices;
import java.util.Scanner;

/**
 * Escribe un programa que pida 20 números enteros. 
 * Estos números se deben introducir en un array de 4 filas por 5 columnas. 
 * El programa mostrará las sumas parciales de filas y columnas 
 * igual que si de una hoja de cálculo se tratara. 
 * La suma total debe aparecer en la esquina inferior derecha.
 * @author Alberto Miguel Martinez Jimenez
 * 
 * ALGORITMO
 * almacenar 20 enteros en matriz[4][5]
 * hacer hasta 4
 * 		hacer hasta 5
 * 			introduce número entero
 * 			sumaColumnas = sumaColumnas + numero
 * 		fin hasta1
 * fin hasta
 */
public class ej2 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][5];
		int[] sumaColumnas = new int[4];
		int[] sumaFilas = new int[5];
		int sumatorio = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("Introduce número entero: ");
				matriz[i][j] = scanner.nextInt();
				sumatorio = sumatorio + matriz[i][j];
			}
		}
		
		
		
		
		
		System.out.println(matriz[0][0]+"    "+matriz[0][1]+"    "+matriz[0][2]+"    "+matriz[0][3]+"    "+matriz[0][4]+"    |"+(matriz[0][0]+matriz[0][1]+matriz[0][2]+matriz[0][3]+matriz[0][4]));
		System.out.println(matriz[1][0]+"    "+matriz[1][1]+"    "+matriz[1][2]+"    "+matriz[1][3]+"    "+matriz[1][4]+"    |"+(matriz[1][0]+matriz[1][1]+matriz[1][2]+matriz[1][3]+matriz[1][4]));
		System.out.println(matriz[2][0]+"    "+matriz[2][1]+"    "+matriz[2][2]+"    "+matriz[2][3]+"    "+matriz[2][4]+"    |"+(matriz[2][0]+matriz[2][1]+matriz[2][2]+matriz[2][3]+matriz[2][4]));
		System.out.println(matriz[3][0]+"    "+matriz[3][1]+"    "+matriz[3][2]+"    "+matriz[3][3]+"    "+matriz[3][4]+"    |"+(matriz[3][0]+matriz[3][1]+matriz[3][2]+matriz[3][3]+matriz[3][4]));
		System.out.println("----------------------------");
		System.out.print(matriz[0][0]+matriz[1][0]+matriz[2][0]+matriz[3][0]+"   ");
		System.out.print(matriz[0][1]+matriz[1][1]+matriz[2][1]+matriz[3][1]+"   ");
		System.out.print(matriz[0][2]+matriz[1][2]+matriz[2][2]+matriz[3][2]+"   ");
		System.out.print(matriz[0][3]+matriz[1][3]+matriz[2][3]+matriz[3][3]+"   ");
		System.out.print(matriz[0][4]+matriz[1][4]+matriz[2][4]+matriz[3][4]+"   ");
		System.out.print("|"+sumatorio);
	}

}
