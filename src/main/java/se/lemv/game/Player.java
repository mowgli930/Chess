package se.lemv.game;

import java.util.ArrayList;
import java.util.List;

import se.lemv.pieces.ChessPiece;

public final class Player {
	
	private final String name;
	private final Color color;
	private final List<ChessPiece> pieces;
	
	public Player(String name, Color color, List<ChessPiece> list) {
		this.name = name;
		this.color = color;
		this.pieces = list;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public List<ChessPiece> getPieces() {
		return pieces;
	}
	
	public List<Position> getPositions() {
		List<Position> list = new ArrayList<Position>();
		for(ChessPiece cp: pieces) 
			list.add(cp.getPosition());
		return list;
	}
		
}
