package se.lemv.application;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;
import se.lemv.game.Color;
import se.lemv.game.Move;
import se.lemv.game.Player;
import se.lemv.game.Position;
import se.lemv.graphics.Graphics;
import se.lemv.pieces.ChessPiece;
import se.lemv.pieces.Pawn;
import se.lemv.service.GameService;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {

		Player[] players = createPlayers();
		GameService gameService = new GameService(players[0], players[1]);
	}
	
	public void start(Stage mainStage) {
		Graphics graphics = new Graphics(mainStage);
		graphics.Initialize();
	}
	
	public void stop() {}
	
	public List<ChessPiece> createWhitePieces() throws URISyntaxException {
		List<ChessPiece> pieces; 
		pieces = Arrays.asList(
				new Pawn("wrook1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(0, 0), new URI("test_pawn.png")),
				new Pawn("wknight1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(1, 0), new URI("test_pawn.png")),
				new Pawn("wbishop1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(2, 0), new URI("test_pawn.png")),
				new Pawn("wking", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(3, 0), new URI("test_pawn.png")),
				new Pawn("wqueen", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(4, 0), new URI("test_pawn.png")),
				new Pawn("wbishop2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(5, 0), new URI("test_pawn.png")),
				new Pawn("wknight2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(6, 0), new URI("test_pawn.png")),
				new Pawn("wrook2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(7, 0), new URI("test_pawn.png")),
				
				new Pawn("wpawn1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(0, 1), new URI("test_pawn.png")),
				new Pawn("wpawn2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(1, 1), new URI("test_pawn.png")),
				new Pawn("wpawn3", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(2, 1), new URI("test_pawn.png")),
				new Pawn("wpawn4", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(3, 1), new URI("test_pawn.png")),
				new Pawn("wpawn5", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(4, 1), new URI("test_pawn.png")),
				new Pawn("wpawn6", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(5, 1), new URI("test_pawn.png")),
				new Pawn("wpawn7", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(6, 1), new URI("test_pawn.png")),
				new Pawn("wpawn8", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(7, 1), new URI("test_pawn.png"))		
				);
		
		
		return pieces;
	}
	public List<ChessPiece> createBlackPieces() throws URISyntaxException {
		List<ChessPiece> pieces;
		pieces = Arrays.asList(
				new Pawn("bpawn1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(0, 6), new URI("test_pawn.png")),
				new Pawn("bpawn2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(1, 6), new URI("test_pawn.png")),
				new Pawn("bpawn3", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(2, 6), new URI("test_pawn.png")),
				new Pawn("bpawn4", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(3, 6), new URI("test_pawn.png")),
				new Pawn("bpawn5", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(4, 6), new URI("test_pawn.png")),
				new Pawn("bpawn6", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(5, 6), new URI("test_pawn.png")),
				new Pawn("bpawn7", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(6, 6), new URI("test_pawn.png")),
				new Pawn("bpawn8", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(7, 6), new URI("test_pawn.png")),
				
				new Pawn("brook1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(0, 7), new URI("test_pawn.png")),
				new Pawn("bknight1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(1, 7), new URI("test_pawn.png")),
				new Pawn("bbishop1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(2, 7), new URI("test_pawn.png")),
				new Pawn("bking", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(3, 7), new URI("test_pawn.png")),
				new Pawn("bqueen", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(4, 7), new URI("test_pawn.png")),
				new Pawn("bbishop2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(5, 7), new URI("test_pawn.png")),
				new Pawn("bknight2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(6, 7), new URI("test_pawn.png")),
				new Pawn("brook2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(7, 7), new URI("test_pawn.png"))
				);
		
		
		return pieces;
	}
	public Player[] createPlayers() {
		Player[] players = new Player[2];
		try {
			players[0] = new Player("Player1", Color.WHITE, createWhitePieces());
			players[1] = new Player("Player2", Color.BLACK, createBlackPieces());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return players;
	}


}
