package se.lemv.game.setup;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import se.lemv.game.Color;
import se.lemv.game.Move;
import se.lemv.game.Player;
import se.lemv.game.Position;
import se.lemv.pieces.ChessPiece;

public abstract class NormalChessSetUp {

	public static Player[] createPlayers() {
		Player[] players = new Player[2];
		try {
			players[0] = new Player("Player1", Color.WHITE, createWhitePieces());
			players[1] = new Player("Player2", Color.BLACK, createBlackPieces());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return players;
	}
	private static List<ChessPiece> createWhitePieces() throws URISyntaxException {
		List<ChessPiece> pieces; 
		pieces = Arrays.asList(
				new ChessPiece("wrook1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(0, 0), ChessPiece.Type.ROOK, "white_rook.png"),
				new ChessPiece("wknight1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(1, 0), ChessPiece.Type.KNIGHT, "white_knight.png"),
				new ChessPiece("wbishop1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(2, 0), ChessPiece.Type.BISHOP, "white_bishop.png"),
				new ChessPiece("wking", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(3, 0), ChessPiece.Type.QUEEN, "white_queen.png"),
				new ChessPiece("wqueen", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(4, 0), ChessPiece.Type.KING, "white_king.png"),
				new ChessPiece("wbishop2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(5, 0), ChessPiece.Type.BISHOP, "white_bishop.png"),
				new ChessPiece("wknight2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(6, 0), ChessPiece.Type.KNIGHT, "white_knight.png"),
				new ChessPiece("wrook2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(7, 0), ChessPiece.Type.ROOK, "white_rook.png"),
				
				new ChessPiece("wpawn1", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(0, 1), ChessPiece.Type.PAWN, "white_pawn.png"),
				new ChessPiece("wpawn2", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(1, 1), ChessPiece.Type.PAWN, "white_pawn.png"),
				new ChessPiece("wpawn3", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(2, 1), ChessPiece.Type.PAWN, "white_pawn.png"),
				new ChessPiece("wpawn4", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(3, 1), ChessPiece.Type.PAWN, "white_pawn.png"),
				new ChessPiece("wpawn5", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(4, 1), ChessPiece.Type.PAWN, "white_pawn.png"),
				new ChessPiece("wpawn6", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(5, 1), ChessPiece.Type.PAWN, "white_pawn.png"),
				new ChessPiece("wpawn7", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(6, 1), ChessPiece.Type.PAWN, "white_pawn.png"),
				new ChessPiece("wpawn8", Color.WHITE, false, Arrays.asList(new Move(0, 1)), new Position(7, 1), ChessPiece.Type.PAWN, "white_pawn.png")		
				);
		return pieces;
	}
	private static List<ChessPiece> createBlackPieces() throws URISyntaxException {
		List<ChessPiece> pieces;
		pieces = Arrays.asList(
				new ChessPiece("bpawn1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(0, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				new ChessPiece("bpawn2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(1, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				new ChessPiece("bpawn3", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(2, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				new ChessPiece("bpawn4", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(3, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				new ChessPiece("bpawn5", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(4, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				new ChessPiece("bpawn6", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(5, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				new ChessPiece("bpawn7", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(6, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				new ChessPiece("bpawn8", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(7, 6), ChessPiece.Type.PAWN, "black_pawn.png"),
				
				new ChessPiece("brook1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(0, 7), ChessPiece.Type.ROOK, "black_rook.png"),
				new ChessPiece("bknight1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(1, 7), ChessPiece.Type.KNIGHT, "black_knight.png"),
				new ChessPiece("bbishop1", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(2, 7), ChessPiece.Type.BISHOP, "black_bishop.png"),
				new ChessPiece("bking", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(3, 7), ChessPiece.Type.KING, "black_king.png"),
				new ChessPiece("bqueen", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(4, 7), ChessPiece.Type.QUEEN, "black_queen.png"),
				new ChessPiece("bbishop2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(5, 7), ChessPiece.Type.BISHOP, "black_bishop.png"),
				new ChessPiece("bknight2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(6, 7), ChessPiece.Type.KNIGHT, "black_knight.png"),
				new ChessPiece("brook2", Color.BLACK, false, Arrays.asList(new Move(0, 1)), new Position(7, 7), ChessPiece.Type.ROOK, "black_rook.png")
				);
		return pieces;
	}


}
