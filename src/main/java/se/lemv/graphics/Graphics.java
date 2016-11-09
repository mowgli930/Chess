package se.lemv.graphics;

import java.io.File;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Graphics {
	
	private final Stage mainStage;
	private final GridPane gridPane;
	
	public Graphics(Stage mainStage) {
		this.mainStage = mainStage;
		this.gridPane = createGridPane();
	}
	public void Initialize() {
		mainStage.setTitle("Chess");
		FlowPane rootNode = new FlowPane();
		Scene scene = new Scene(rootNode, 800, 800);		
		rootNode.getChildren().addAll(gridPane);
		mainStage.setScene(scene);
		mainStage.show();
		testPawnImage(gridPane);
	}

	private void testPawnImage(GridPane gridPane) {
		Image pawn = new Image(loadImage("test_pawn.png").toURI().toString());
		Group group = (Group) gridPane.getChildren().get(0);
		ImageView imageView = (ImageView) group.getChildren().get(1);
		imageView.setImage(pawn);
	}
	private GridPane createGridPane() {
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
		Group[][] group = new Group[8][8];
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
		return new Image(loadImage("dark_tile.png").toURI().toString());
	}
	private Image getLightTile() {
		return new Image(loadImage("light_tile.png").toURI().toString());
	}
	private File loadImage(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		return new File(classLoader.getResource(fileName).getFile());
	}
	
}
