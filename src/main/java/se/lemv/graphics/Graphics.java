package se.lemv.graphics;

import java.io.File;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import se.lemv.game.Position;
import se.lemv.pieces.ChessPiece;

public class Graphics {
	
	private final Stage mainStage;
	private final GridPane gridPane;
	private Group[][] group;
	
	public Graphics(Stage mainStage) {
		this.mainStage = mainStage;
		this.gridPane = createGridPaneWithGroups();
	}
	public void Initialize() {
		mainStage.setTitle("Chess");
		FlowPane rootNode = new FlowPane();
		Scene scene = new Scene(rootNode, 800, 800);		
		rootNode.getChildren().addAll(gridPane);
		mainStage.setScene(scene);
		mainStage.show();
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
		Image darkTile = getDarkTile();
		Image lightTile = getLightTile();
		
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
	private Image getDarkTile() {
		return new Image(loadFile("dark_tile.png").toURI().toString());
	}
	private Image getLightTile() {
		return new Image(loadFile("light_tile.png").toURI().toString());
	}
	private Image loadImage(String resourcePath) {
		return new Image(loadFile(resourcePath).toURI().toString());
	}
	private File loadFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		return new File(classLoader.getResource(fileName).getFile());
	}
	
}
