package se.lemv.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import se.lemv.game.Player;
import se.lemv.game.setup.NormalChessSetUp;
import se.lemv.graphics.Board;
import se.lemv.service.GameService;

public class Main {

	public static void main(String[] args) {
		Application.launch(Board.class);
	}

	private void game() {
		boolean isRunning = true;
		while (isRunning) {
			// TODO implement main game loop
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setTitle("Chess");
			FlowPane rootNode = new FlowPane();
			Scene scene = new Scene(rootNode, 100, 100);
			Button button = new Button("Turn");
			rootNode.getChildren().addAll(button);
			stage.setScene(scene);
			stage.showAndWait();
		}
	}
	
}
