package se.lemv.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {
		//TODO initialize game, players and things
	}
	
	public void start(Stage mainStage) {
		mainStage.setTitle("Chess");
		
		FlowPane rootNode = new FlowPane();
		Scene scene = new Scene(rootNode, 750, 750);
		
		GridPane gridPane = createGridPane();

		//TODO add things to rootNode
		rootNode.getChildren().addAll();
		mainStage.setScene(scene);
		mainStage.show();
	}
	
	public void stop() {}
	
	private ImageView[][] createImageViewArray() {
		ImageView[][] imageView = new ImageView[8][8];

		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				imageView[i][j] = new ImageView();
			}
		}
		return imageView;
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
	
}
