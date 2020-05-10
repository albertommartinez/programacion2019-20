package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)  {
		try {
		    FXMLLoader fxml = new FXMLLoader();
		    fxml.load(this.getClass().getResource("/vistas/CajeroJFX.fxml"));
		    GridPane root = fxml.<GridPane>load();
		    Scene scene = new Scene(root);
		    primaryStage.setScene(scene);
		    primaryStage.setTitle("..::Cajero de cambio::..");
		    primaryStage.show();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
