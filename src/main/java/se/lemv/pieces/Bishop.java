package se.lemv.pieces;

import java.net.URI;
import java.util.List;

import se.lemv.game.Color;
import se.lemv.game.Move;
import se.lemv.game.Position;

public class Bishop extends ChessPiece {

	public Bishop(String name, Color color, boolean isCaptured, List<Move> moves, Position position, URI resourceURI) {
		super(name, color, isCaptured, moves, position, resourceURI);
	}

}
