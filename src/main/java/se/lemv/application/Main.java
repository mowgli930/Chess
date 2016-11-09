package se.lemv.application;

import javafx.application.Application;
import javafx.stage.Stage;
import se.lemv.game.Player;
import se.lemv.game.setup.NormalChessSetUp;
import se.lemv.graphics.Graphics;
import se.lemv.service.GameService;

public class Main extends Application {
	
	private Player[] players;
	private GameService gameService;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {

		players = NormalChessSetUp.createPlayers();
		gameService = new GameService(players[0], players[1]);
	}
	
	public void start(Stage mainStage) {
		Graphics graphics = new Graphics(mainStage);
		graphics.Initialize();
		
		game();
	}
	
	private void game() {
		boolean isRunning = true;
		while(isRunning) {
			gameService.drawBoard();
		}
	}

	public void stop() {}

}
