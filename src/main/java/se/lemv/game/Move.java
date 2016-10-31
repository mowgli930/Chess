package se.lemv.game;

public final class Move {
	private final int xMovement;
	private final int yMovement;
	
	public Move(int xMovement, int yMovement) {
		this.xMovement = xMovement;
		this.yMovement = yMovement;
	}
	
	public int getXMovement() {
		return this.xMovement;
	}
	public int getYMovement() {
		return this.yMovement;
	}
}
