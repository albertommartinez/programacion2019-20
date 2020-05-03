package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Modelo {
  
  public void combinarFicheros(String fichero1,String fichero2,String ficheroNuevo) {
      try {
	  String linea = "";
	  BufferedReader bFichero1 = new BufferedReader(new FileReader(fichero1));//abre fichero1 para leer 
	  BufferedReader bFichero2 = new BufferedReader(new FileReader(fichero2));//abre fichero2 para leer
	  BufferedWriter bFicheroNuevo = new BufferedWriter(new FileWriter(ficheroNuevo));//abre fichero3 para esccribir
	  
	  //leer ficheros y escribir en ficheroNuevo
	  do {
	      linea = bFichero1.readLine();
	      bFicheroNuevo.write(linea);
	      bFicheroNuevo.newLine();
	      
	      linea = bFichero2.readLine();  
	      bFicheroNuevo.write(linea);
	      bFicheroNuevo.newLine();
	      
	  }while((bFichero1.readLine()!=null)&&(bFichero2.readLine()!=null));   
      }catch (IOException e) {
	  System.out.println("Error E/S: "+e);
      }
  }
}
