import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class DisplayClock extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a clock, a pane and a label in side a EventHandler.
    ClockPane clock = new ClockPane();
    BorderPane pane = new BorderPane();
    // Make a event to change a time text.
    EventHandler<ActionEvent> eventHandler = e -> {
    	String timeString = String.format("%02d:%02d:%02d", clock.getHour(), clock.getMinute(), clock.getSecond());
    	Label lblCurrentTime = new Label(timeString);
    	pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
    };
    // 1000 means one second. every one second animation will be start and it means change a text.
    Timeline animation = new Timeline(
    		new KeyFrame(Duration.millis(1000), eventHandler));
    animation.setCycleCount(Timeline.INDEFINITE); 
    animation.play(); // Start animation
            
    // Place clock and label in border pane
    pane.setCenter(clock);
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("DisplayClock"); // Set the stage title (It makes sense more than exercise 14-27).
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  // start 
  public static void main(String[] args) {
	 System.out.println("Name : Hyunjae Lee");
	 System.out.println("School Number : 201746135");
	 launch(args);
  }
}