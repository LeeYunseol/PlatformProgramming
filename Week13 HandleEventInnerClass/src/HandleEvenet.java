import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvenet extends Application{
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1);
		
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		
		// 이 부분 좀 신기하네
		pane.getChildren().addAll(btOK, btCancel);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	class OKHandlerClass implements EventHandler<ActionEvent>
	{

		@Override 
		public void handle(ActionEvent arg0) {
			System.out.println("OK button Clicked");
			
		}
		
	}

	class CancelHandlerClass implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent arg0) {
			System.out.println("Cancel button Clicked");
			
		}
		
	}
}
  
