package ficheroPrimos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroPrimos {
	
	public static void main(String[] args) throws IOException {
		String fichero = "primos.dat";
		try {
			BufferedWriter bFichero = new BufferedWriter(new FileWriter(fichero));
			int primo = 0;
			
			for(int i=0;i<500;i++) {
				//primo = obtenerPrimo();
				bFichero.write(obtenerPrimo());
			}
			bFichero.close();
			System.out.println("Proceso Concluido sin errores");
		}catch (FileNotFoundException e){
			System.err.println("Error de fichero.");
		}
		
	}
	
	private static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		
		while((primo)&&(contador!=numero)) {
			if(numero%contador==0) {
				primo = false;
			}
			contador++;
		}
		return primo;
	}
	
	private static int obtenerPrimo() {
		int aspirantePrimo = 2;
		while(true) {
			if(esPrimo(aspirantePrimo)) {
				return aspirantePrimo;
			}else{
				aspirantePrimo++;
			}
		}		
	}
}
