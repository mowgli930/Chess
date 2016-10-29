package se.lemv.pieces;

import java.util.List;

import se.lemv.game.Color;
import se.lemv.game.Move;

public abstract class ChessPiece {
	
	protected String name;
	protected Color color;
	protected boolean isCaptured;
	protected List<Move> moves;
}
