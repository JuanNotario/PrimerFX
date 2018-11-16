package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private AnchorPane mypane;
	
	@Override
	public void start(Stage stage) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("prueba_fxml.fxml"));
			mypane = (AnchorPane) loader.load();
			
			stage.setTitle("Esto es un titulo :)");
			stage.setScene(new Scene(mypane));
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
