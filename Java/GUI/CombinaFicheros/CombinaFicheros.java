package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		/*try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
	    Modelo modelo = new Modelo();//Instancia
	    
	    primaryStage.setTitle("Combina Ficheros");
	    GridPane root = new GridPane();
	    root.setHgap(10);
	    root.setVgap(10);
	    root.setPadding(new Insets(10,10,10,10));
	 
	    //Controles----------------------------------------------------
	    //Añade label al Grid
	    Label fichero1 = new Label("Fichero1:");
	    root.add(fichero1, 0, 0);
	    
	    //Añade caja de texto al grid
	    TextField tFichero1 = new TextField();
	    root.add(tFichero1, 0, 1);
	    
	    //Añade label al Grid
	    Label fichero2 = new Label("Fichero2:");
	    root.add(fichero2, 1, 0);
	    
	    //Añade caja de texto al grid
	    TextField tFichero2 = new TextField();
	    root.add(tFichero2, 1, 1);
	    
	  //Añade label al Grid
	    Label ficheroNuevo = new Label("Fichero Nuevo:");
	    root.add(ficheroNuevo, 0, 2);
	    
	    //Añade caja de texto al grid
	    TextField tFicheroNuevo = new TextField();
	    root.add(tFicheroNuevo, 0, 3);
	    root.setColumnSpan(tFicheroNuevo, 2);
	    
	    //Añade caja de texto al grid
	    //Añade boton de accion
	    Button btn = new Button("Combinar Ficheros");
	    btn.setDefaultButton(true);
	    root.add(btn, 0, 4);
	    root.setColumnSpan(btn, 2);
	    root.setHalignment(btn, HPos.CENTER);
	    
	    //Añade textSalida
	    TextArea tSalida = new TextArea();
	    root.add(tSalida, 0, 5);
	    root.setColumnSpan(tSalida, 2);
	   
	    /*Evento-------------------------------------------------------
	    btn.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e)  {
		    //Accion del evento
		    modelo.combinarFicheros(tFichero1.getText(), tFichero1.getText(), ficheroNuevo);
		    try {
			
		    }catch(Exception e1) {
			
		    }
		    
		}
	   
	    //-------------------------------------------------------------
	    */
	    Scene scene = new Scene(root, 300, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
