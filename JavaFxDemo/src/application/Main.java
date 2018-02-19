package application;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;

public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private FlowPane pane;
	private Label label;

	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		pane = new FlowPane();
		label = new Label("Hello World!");
		pane.getChildren().add(label);
		scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
