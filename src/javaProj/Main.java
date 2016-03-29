package javaProj;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane rootPane = new AnchorPane();
		rootPane.getChildren().add(new Button("Click me!"));
		Scene mainScene = new Scene(rootPane, 300.0, 300.0);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}

}
