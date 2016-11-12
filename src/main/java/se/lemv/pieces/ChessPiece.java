package se.lemv.pieces;

import java.util.ArrayList;
import java.util.List;

import se.lemv.game.Color;
import se.lemv.game.Move;
import se.lemv.game.Position;

public class ChessPiece {
	
	private String name;
	private Color color;
	private boolean isCaptured;
	private List<Move> moves;
	private Position position;
	private Type piece;
	private String resourcePath;

	public enum Type {
		PAWN, ROOK, KNIGHT, BISHOP, KING, QUEEN
	}
	public ChessPiece(String name, Color color, boolean isCaptured, List<Move> moves, Position position, Type piece, String resourceString) {
		this.name = name;
		this.color = color;
		this.isCaptured = isCaptured;
		this.moves = moves;
		this.position = position;
		this.piece = piece;
		this.resourcePath = resourceString;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public boolean isCaptured() {
		return isCaptured;
	}

	public List<Move> getMoves() {
		return moves;
	}

	public Position getPosition() {
		return position;
	}
	
	public Type getType() {
		return this.piece;
	}

	public String getResourcePath() {
		return resourcePath;
	}
	
	
}
