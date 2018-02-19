package application;

import java.io.IOException;

import javafx.application.Application
;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;

public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private AnchorPane pane;
	private Label label;

	@Override
	public void start(Stage stage){
		this.stage = stage;
		try {
		pane = (AnchorPane) FXMLLoader.load(Main.class.getResource("helloWorld.fxml"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
