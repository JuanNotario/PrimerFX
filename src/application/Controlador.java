package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controlador {
	
	@FXML
    private ImageView ftPeppa;   
	
	@FXML
    public void setblur() {           
       ftPeppa.setEffect(new GaussianBlur(20));
      
    }
	
	@FXML
	public void handleClose() {
		System.exit(0);
	}
}
