import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application{
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Text text = new Text(20, 20, "Programming is fun");
		pane.getChildren().addAll(text);
		text.setOnMouseDragged(e -> {
			text.setX(e.getX());
			text.setY(e.getY());
		});
		
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Mouse EVENT DEMO");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
