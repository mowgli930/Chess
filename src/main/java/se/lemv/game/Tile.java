package se.lemv.game;

public class Tile {
	
	private final String name;
	private final Position position;
	private final Color color;
	
	public Tile(String name, Position position, Color color) {
		this.name = name;
		this.position = position;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	public Position getPosition() {
		return this.position;
	}
	public Color getColor() {
		return this.color;
	}
}
