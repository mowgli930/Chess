package se.lemv.graphics;

import java.io.File;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
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
	}
	
	private GridPane createGridPane() {
		ImageView[][] imageView = createImageViewArray();
		GridPane gridPane = new GridPane();
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				gridPane.add(imageView[i][j], i, j);
			}
		}
		return gridPane;
	}
	private ImageView[][] createImageViewArray() {
		ImageView[][] imageView = new ImageView[8][8];
		Image darkTile = getDarkTile();
		Image lightTile = getLightTile();
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(i%2==0 && j%2==0 || i%2==1 && j%2==1)
					imageView[i][j] = new ImageView(darkTile);					
				else
					imageView[i][j] = new ImageView(lightTile);
			}
		}
		return imageView;
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
