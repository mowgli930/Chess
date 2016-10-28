package se.lemv.pieces;

import java.util.List;

import se.lemv.board.Move;

public abstract class ChessPiece {
	
	protected String name;
	protected String color;
	protected boolean isActive;
	protected List<Move> moves;
}
