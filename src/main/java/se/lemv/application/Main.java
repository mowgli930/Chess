package se.lemv.application;

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
	
	private Player[] createPlayers() {
		Player[] players = new Player[2];
		try {
			players[0] = new Player("Player1", Color.WHITE, createWhitePieces());
			players[1] = new Player("Player2", Color.BLACK, createBlackPieces());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return players;
	}
	private List<ChessPiece> createWhitePieces() throws URISyntaxException {
		List<ChessPiece> pieces; 
		pieces = Arrays.asList(
				new ChessPiece("wrook1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(0, 0), ChessPiece.Type.ROOK, "test_pawn.png"),
				new ChessPiece("wknight1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(1, 0), ChessPiece.Type.KNIGHT, "test_pawn.png"),
				new ChessPiece("wbishop1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(2, 0), ChessPiece.Type.BISHOP, "test_pawn.png"),
				new ChessPiece("wking", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(3, 0), ChessPiece.Type.QUEEN, "test_pawn.png"),
				new ChessPiece("wqueen", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(4, 0), ChessPiece.Type.KING, "test_pawn.png"),
				new ChessPiece("wbishop2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(5, 0), ChessPiece.Type.BISHOP, "test_pawn.png"),
				new ChessPiece("wknight2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(6, 0), ChessPiece.Type.KNIGHT, "test_pawn.png"),
				new ChessPiece("wrook2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(7, 0), ChessPiece.Type.ROOK, "test_pawn.png"),
				
				new ChessPiece("wpawn1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(0, 1), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("wpawn2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(1, 1), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("wpawn3", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(2, 1), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("wpawn4", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(3, 1), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("wpawn5", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(4, 1), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("wpawn6", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(5, 1), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("wpawn7", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(6, 1), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("wpawn8", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(7, 1), ChessPiece.Type.PAWN, "test_pawn.png")		
				);
		
		
		return pieces;
	}
	private List<ChessPiece> createBlackPieces() throws URISyntaxException {
		List<ChessPiece> pieces;
		pieces = Arrays.asList(
				new ChessPiece("bpawn1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(0, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("bpawn2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(1, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("bpawn3", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(2, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("bpawn4", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(3, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("bpawn5", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(4, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("bpawn6", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(5, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("bpawn7", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(6, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				new ChessPiece("bpawn8", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(7, 6), ChessPiece.Type.PAWN, "test_pawn.png"),
				
				new ChessPiece("brook1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(0, 7), ChessPiece.Type.ROOK, "test_pawn.png"),
				new ChessPiece("bknight1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(1, 7), ChessPiece.Type.KNIGHT, "test_pawn.png"),
				new ChessPiece("bbishop1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(2, 7), ChessPiece.Type.BISHOP, "test_pawn.png"),
				new ChessPiece("bking", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(3, 7), ChessPiece.Type.KING, "test_pawn.png"),
				new ChessPiece("bqueen", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(4, 7), ChessPiece.Type.QUEEN, "test_pawn.png"),
				new ChessPiece("bbishop2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(5, 7), ChessPiece.Type.BISHOP, "test_pawn.png"),
				new ChessPiece("bknight2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(6, 7), ChessPiece.Type.KNIGHT, "test_pawn.png"),
				new ChessPiece("brook2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(7, 7), ChessPiece.Type.ROOK, "test_pawn.png")
				);
		
		
		return pieces;
	}


}
