package se.lemv.service;

import se.lemv.game.Player;
import se.lemv.pieces.ChessPiece;

/**
 * This class contains all game logic
 * @author leo
 *
 */
public final class GameService {
	
	private final Player players[] = new Player[2];
	private final ChessPiece[][] boardMatrix = new ChessPiece[8][8];

	
	public GameService(Player player1, Player player2) {
		this.players[0] = player1;
		this.players[1] = player2;
	}


	public void drawBoard() {
		// TODO Auto-generated method stub
		
	}
	
}
