package ej2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EtiquetasHTML {

	public static void main(String[] args) {
		//comprobar parametros
		if(args.length != 2) {
			System.err.println("Error en el numero de parametros");
			System.exit(1);
		}
		
		//Par�metros
		String urlALeer = args[0];
		String etiqueta = args[1];
		String html = "";
		
		try {
			//Abrir y definir conexion
			URL url = new URL(urlALeer);
			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");
			
			//Establecer conexion y leer
			System.out.println("Respuesta servidor web: " + conexion.getResponseCode() + "\n");
			BufferedReader bf = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;
			while((linea = bf.readLine()) != null) {
				html += linea + "\n";
			}
			bf.close();
			
			// Buscar el contenido de la etiqueta en el html leido
			Pattern patron = Pattern.compile("<" + etiqueta + "[^>]*>(.*?)</" + etiqueta + ">", Pattern.DOTALL); // deshabilita multil�nea
			Matcher matcher = patron.matcher(html);
			
			int n = 0;
			while(matcher.find()) {
				System.out.println("Ocurrencia numero " + ++n + ": " + matcher.group(1));
			}
			
			System.out.println("\nTotal etiquetas <" + etiqueta + "> encontradas: " + n);
			
		}catch (Exception e) {
			System.err.println("Error en la URL "+ e.getMessage());
		}

	}

}
