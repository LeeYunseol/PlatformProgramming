import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HandleEvenet extends Application{
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 200);
		primaryStage.setTitle("MyJavaFx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
  