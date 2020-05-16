package vistas;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;


public class expRegJFXController implements Initializable {
	@FXML
	private TextArea textoBusqueda;
	@FXML
	private TextArea tCoincidencias;
	@FXML
	private TextField textoPatron;
	@FXML
	private Button bCargarFichero;
	@FXML
	private Button bBuscar;
	@FXML
	private ComboBox cFuente;
	
	
	@FXML
	private void manejadorBuscarCoincidencias(ActionEvent event) { 
	  //Crea un patron con la expresion regular obtenida de la caja de texto textoPatron
	  Pattern patron = Pattern.compile(textoPatron.getText());
	  Matcher matcher = patron.matcher(textoBusqueda.getText());
	  tCoincidencias.appendText("Entra");
	  while(matcher.find()) {
	    tCoincidencias.appendText(matcher.group(1));
	  }
	  tCoincidencias.appendText("Sale");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    
	    
	}
	
	

}
