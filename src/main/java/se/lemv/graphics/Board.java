package se.lemv.graphics;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import se.lemv.game.Player;
import se.lemv.game.Position;
import se.lemv.game.setup.NormalChessSetUp;
import se.lemv.pieces.ChessPiece;
import se.lemv.service.GameService;

public class Board extends Application {
	
	private Stage primaryStage;
	private final GridPane gridPane;
	private Group[][] group;
	private Player[] players;
	GameService gameService;
	
	public Board() {
		this.gridPane = createGridPaneWithGroups();
	}
	
	@Override
	public void init() {
		players = NormalChessSetUp.createPlayers();
		gameService = new GameService(players[0], players[1]);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		primaryStage.setTitle("Chess");
		FlowPane rootNode = new FlowPane();
		Scene scene = new Scene(rootNode, 800, 800);		
		rootNode.getChildren().addAll(gridPane);
		primaryStage.setScene(scene);
		primaryStage.show();
		drawAllPieces();
	}

	public void drawAllPieces() {
		for(ChessPiece cp: players[0].getPieces()){
			drawPiece(cp);
		}
		for(ChessPiece cp: players[1].getPieces()) {
			drawPiece(cp);
		}
	}
	public void drawPiece(ChessPiece piece) {
		Position pos = piece.getPosition();
		ImageView imageView = (ImageView) this.group[pos.getX()][pos.getY()].getChildren().get(1);
		imageView.setImage(loadImage(piece.getResourcePath()));
	}
	
	private GridPane createGridPaneWithGroups() {
		Group[][] groups = createGroupsWithImageView();
		GridPane gridPane = new GridPane();
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				gridPane.add(groups[i][j], i, j);
			}
		}
		return gridPane;
	}
	private Group[][] createGroupsWithImageView() {
		this.group = new Group[8][8];
		Image darkTile = loadImage("dark_tile.png");
		Image lightTile = loadImage("light_tile.png");
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(i%2==0 && j%2==0 || i%2==1 && j%2==1)
					group[i][j] = new Group(new ImageView(darkTile), new ImageView());
				else
					group[i][j] = new Group(new ImageView(lightTile), new ImageView());
			}
		}
		return group;
	}
	private Image loadImage(String resourcePath) {
		return new Image(loadFile(resourcePath).toURI().toString());
	}
	private File loadFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		return new File(classLoader.getResource(fileName).getFile());
	}
	
}
