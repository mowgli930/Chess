package se.lemv.pieces;

import java.net.URI;
import java.util.List;

import se.lemv.game.Color;
import se.lemv.game.Move;
import se.lemv.game.Position;

public class Pawn extends ChessPiece {

	public Pawn(String name, Color color, boolean isCaptured, List<Move> moves, Position position, URI resourcesURI) {
		super(name, color, isCaptured, moves, position, resourcesURI);
	}

}
