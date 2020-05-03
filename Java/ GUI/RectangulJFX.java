package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
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
		try {
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();
			primaryStage.setTitle("..::Rectangulo::..");
			GridPane root = new GridPane();
			root.setHgap(10);
			root.setVgap(10);
			root.setPadding(new Insets(10,10,10,10));
			
			//Añade label base al Grid
			Label base = new Label("Base: ");
			root.add(base, 0, 0);
			
			//Añade caja de texto base al Grid
			TextField tBase = new TextField();
			root.add(tBase, 1, 0);
			root.setHalignment(tBase, HPos.LEFT);
			
			//Añade label altura al Grid
			Label altura = new Label("Altura: ");
			root.add(altura, 0, 1);
			
			//Añade caja de texto altura al Grid
			TextField tAltura = new TextField();
			root.add(tAltura, 1, 1);
			root.setHalignment(tAltura, HPos.LEFT);
			
			//Añade boton para calcular
			Button btn = new Button("Calcular");
			btn.setDefaultButton(true);
			root.add(btn, 0, 2);
			
			root.setHalignment(btn, HPos.CENTER);
			
			//Añade teaxtArea resultado
			TextArea resultado = new TextArea();
			resultado.setEditable(false);
			root.add(resultado, 0, 3);
			
			Scene scene = new Scene(root, 500, 500);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e)  {
					//Accion del evento
					try {
						double base = Double.parseDouble(tBase.getText());
						double altura = Double.parseDouble(tAltura.getText());
						double perimetro;
						double area;
						perimetro = base*2+altura*2;
						area = base*altura;
						
						resultado.clear();
						resultado.appendText("Perímetro: "+perimetro+"\n");
						resultado.appendText("Área: "+area);
					}catch(Exception e1){
						resultado.clear();
						resultado.appendText("Todos los valores introducidos deben ser numéricos");
					}
					
				}
			});
			
			
			
		} catch(Exception expc) {
			expc.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
