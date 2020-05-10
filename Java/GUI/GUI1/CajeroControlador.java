package vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CajeroControlador implements Initializable {
	//@FXML uno por cada control grafico con el que interactua
    	@FXML
    	private TextField txtCalcular;
    	
    	@FXML 
    	private Button Bcalcular;
    	
    	@FXML
    	private TextField m1c;
	
    	@FXML
    	private TextField m2c;
    	
    	@FXML
    	private TextField m5c;
    	
    	@FXML
    	private TextField m10c;
    	
    	@FXML
    	private TextField m20c;
    	
    	@FXML
    	private TextField m50c;
    	
    	@FXML
    	private TextField m1e;
    	
    	@FXML
    	private TextField m2e;
    	
    	@FXML
    	private TextField b5e;
    	
    	@FXML
    	private TextField b10e;
    	
    	@FXML
    	private TextField b20e;
    	
    	@FXML
    	private TextField b50e;
    	
    	@FXML
    	private TextField b100e;
    	
    	@FXML
    	private TextField b200e;
    	
    	@FXML
    	private TextField b500e;
    	
    	@Override
    	public void initialize(URL location, ResourceBundle resource) {
    	    
    	}
    	
	double[][] valores = {{500.00,200.00,100.00,50.00,20.00,10.00,5.00,2.00,1.00,0.50,0.20,0.10,0.05,0.02,0.01},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}};
	
	CajeroControlador() {
			
	}
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
    		int nDivisas = 0;
    		double cantidad = Double.parseDouble(txtCalcular.getText());
    		for(int i=0;i<valores[0].length;i++) {
    			nDivisas  = (int)(cantidad/valores[0][i]);//cantidad monedas/billete de esa cantidad
    			cantidad = cantidad%valores[0][i];
    			valores[1][i] = nDivisas;	
    		}
    		//Asigna valores a las cajas de texto correspondientes
    		m1c.setText(String.valueOf(valores[1][0]));//moneda 1 centimo
    		m2c.setText(String.valueOf(valores[1][1]));
    		m5c.setText(String.valueOf(valores[1][2]));
    		m10c.setText(String.valueOf(valores[1][3]));
    		m20c.setText(String.valueOf(valores[1][4]));
    		m50c.setText(String.valueOf(valores[1][5]));
    		m1e.setText(String.valueOf(valores[1][6]));//moneda 1 euro
    		m2e.setText(String.valueOf(valores[1][7]));
    		b5e.setText(String.valueOf(valores[1][8]));//billete 5 euros
    		b10e.setText(String.valueOf(valores[1][9]));
    		b20e.setText(String.valueOf(valores[1][10]));
    		b50e.setText(String.valueOf(valores[1][11]));
    		b100e.setText(String.valueOf(valores[1][12]));
    		b200e.setText(String.valueOf(valores[1][13]));
    		b500e.setText(String.valueOf(valores[1][14]));
	}

	
}

