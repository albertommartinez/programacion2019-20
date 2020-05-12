package vistas;

import java.net.URL;
import java.util.ResourceBundle;

import application.Fraccion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;





public class FraccionJFXControlador implements Initializable{
   
   //Controles Fracción 1
   @FXML
   private TextField numerador1;
   
   @FXML
   private TextField denominador1;
   
   //Controles Fracción 2
   @FXML
   private TextField numerador2;
   
   @FXML
   private TextField denominador2;
   
   //Controles Fracción Resultado
   @FXML
   private TextField numeradorR;
   
   @FXML
   private TextField denominadorR;
   
 //Controles Calculo
   @FXML
   private RadioButton opcionSuma;
   
   @FXML
   private RadioButton opcionResta;
   
   @FXML
   private RadioButton opcionProducto;
   
   @FXML
   private RadioButton opcionDivision;
   
   @FXML
   private Button Bcalcula;

   @FXML
   private void manejadorBoton(ActionEvent event) {
       //Sumar
       if(opcionSuma.isSelected()) {
	 //Instanciar fraccion 1, fraccion2. El instanciamiento de resultado se hace junto con el calculo
	 Fraccion fraccion1 = new Fraccion(Integer.parseInt(numerador1.getText()),Integer.parseInt(denominador1.getText()));
	 Fraccion fraccion2 = new Fraccion(Integer.parseInt(numerador2.getText()),Integer.parseInt(denominador2.getText()));
	 Fraccion resultado = application.Fraccion.sumar(fraccion1, fraccion2);
	       
	 //Extraer de la fraccion resultado numerador y denominador, mostrar estos en sus caja de texto correspondientes
	 numeradorR.setText(String.valueOf(resultado.getNum()));
	 denominadorR.setText(String.valueOf(resultado.getDen())); 
       }
       //Restar
       if(opcionResta.isSelected()) {
	 //Instanciar fraccion 1, fraccion2. El instanciamiento de resultado se hace junto con el calculo
	 Fraccion fraccion1 = new Fraccion(Integer.parseInt(numerador1.getText()),Integer.parseInt(denominador1.getText()));
	 Fraccion fraccion2 = new Fraccion(Integer.parseInt(numerador2.getText()),Integer.parseInt(denominador2.getText()));
	 Fraccion resultado = application.Fraccion.restar(fraccion1, fraccion2);
		       
	 //Extraer de la fraccion resultado numerador y denominador, mostrar estos en sus caja de texto correspondientes
	 numeradorR.setText(String.valueOf(resultado.getNum()));
	 denominadorR.setText(String.valueOf(resultado.getDen())); 
	      }
       //Producto
       if(opcionProducto.isSelected()) {
	   //Instanciar fraccion 1, fraccion2. El instanciamiento de resultado se hace junto con el calculo
	   Fraccion fraccion1 = new Fraccion(Integer.parseInt(numerador1.getText()),Integer.parseInt(denominador1.getText()));
	   Fraccion fraccion2 = new Fraccion(Integer.parseInt(numerador2.getText()),Integer.parseInt(denominador2.getText()));
	   Fraccion resultado = application.Fraccion.multiplicar(fraccion1, fraccion2);
		       
	   //Extraer de la fraccion resultado numerador y denominador, mostrar estos en sus caja de texto correspondientes
	   numeradorR.setText(String.valueOf(resultado.getNum()));
	   denominadorR.setText(String.valueOf(resultado.getDen())); 
       }
       //Division
       if(opcionDivision.isSelected()) {
	   //Instanciar fraccion 1, fraccion2. El instanciamiento de resultado se hace junto con el calculo
	   Fraccion fraccion1 = new Fraccion(Integer.parseInt(numerador1.getText()),Integer.parseInt(denominador1.getText()));
	   Fraccion fraccion2 = new Fraccion(Integer.parseInt(numerador2.getText()),Integer.parseInt(denominador2.getText()));
	   Fraccion resultado = application.Fraccion.dividir(fraccion1, fraccion2);
		       
	   //Extraer de la fraccion resultado numerador y denominador, mostrar estos en sus caja de texto correspondientes
	   numeradorR.setText(String.valueOf(resultado.getNum()));
	   denominadorR.setText(String.valueOf(resultado.getDen())); 
       }
   }
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
   }
   
  

}
