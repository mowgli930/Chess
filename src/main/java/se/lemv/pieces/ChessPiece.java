package se.lemv.pieces;

import java.net.URI;
import java.util.List;

import se.lemv.game.Color;
import se.lemv.game.Move;
import se.lemv.game.Position;

public abstract class ChessPiece {
	
	protected String name;
	protected Color color;
	protected boolean isCaptured;
	protected List<Move> moves;
	protected Position position;
	protected URI resourceURI;

	public ChessPiece(String name, Color color, boolean isCaptured, List<Move> moves, Position position, URI resourceURI) {
		this.name = name;
		this.color = color;
		this.isCaptured = isCaptured;
		this.moves = moves;
		this.position = position;
		this.resourceURI = resourceURI;
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

	public URI getResourceURI() {
		return resourceURI;
	}
	
	
}
