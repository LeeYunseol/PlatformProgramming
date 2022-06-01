import java.util.Calendar; 
import java.util.GregorianCalendar;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class ClockPane extends Pane
{
   private int hour;
   private int minute;
   private int second;
   private Timeline animation;

   /** Construct a default clock with the current time
    * Here is what I added more.
    * Duration.millil(1000) means one second. every 1 seconds after, animation will be started. 
    * time should be changed every 1 seconds. so I implement moveClock() method to change a time. 
    *  */
   public ClockPane() {
       setCurrentTime();
       animation = new Timeline(
               new KeyFrame(Duration.millis(1000), e -> moveClock()));
       animation.setCycleCount(Timeline.INDEFINITE);
       animation.play();
   }
   /** Construct a clock with specified hour, minute, and second */
   public ClockPane(int hour, int minute, int second) {
       this.hour = hour;
       this.minute = minute;
       this.second = second;
       paintClock();
       animation = new Timeline(
               new KeyFrame(Duration.millis(1000), e -> moveClock()));
       animation.setCycleCount(Timeline.INDEFINITE);
       animation.play();
   }
   
   /** Return hour */
   public int getHour() {
       return hour;
   }
   /** Set a new hour */
   public void setHour(int hour) {
       this.hour = hour;
       paintClock();
   }
   /** Return minute */
   public int getMinute() {
       return minute;
   }
   /** Set a new minute */
   public void setMinute(int minute) {
       this.minute = minute;
       paintClock();
   }
   /** Return second */
   public int getSecond() {
       return second;
   }
   /** Set a new second */
   public void setSecond(int second) {
       this.second = second;
       paintClock();
   }
   @Override
   public void setWidth(double width) {
       super.setWidth(width);
       paintClock();
   }
   @Override
   public void setHeight(double height) {
       super.setHeight(height);
       paintClock();
   }
   /** paintClock method is at inside moveClock() method 
    *  Time will be painted new every second. Repaint the clock!*/
   public void moveClock() {
	   // if second is less than 60, plus one. if it is not, initialize to one.
       second = (second < 60 ? second + 1 : 1);
	   if (hour == 24) 
		   hour = 0;
       if (minute == 60) {
           hour += 1;
           minute = 0;
       }
       if (second == 60) {
           minute += 1;
           second = 0;
       }
       paintClock();
   }
   
   /* Set the current time for the clock */
   public void setCurrentTime() {
       // Construct a calendar for the current date and time
       Calendar calendar = new GregorianCalendar();
       // Set current hour, minute and second
       this.hour = calendar.get(Calendar.HOUR_OF_DAY);
       this.minute = calendar.get(Calendar.MINUTE);
       this.second = calendar.get(Calendar.SECOND);
       paintClock(); // Repaint the clock
   }
   /** Paint the clock */
   private void paintClock() {
       // Initialize clock parameters
       double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
       double centerX = getWidth() / 2;
       double centerY = getHeight() / 2;
       // Draw circle
       Circle circle = new Circle(centerX, centerY, clockRadius);
       circle.setFill(Color.WHITE);
       circle.setStroke(Color.BLACK);
       // Draw second hand
       double sLength = clockRadius * 0.8;
       double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
       double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
       Line sLine = new Line(centerX, centerY, secondX, secondY);
       sLine.setStroke(Color.RED);
       // Draw minute hand
       double mLength = clockRadius * 0.65;
       double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
       double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
       Line mLine = new Line(centerX, centerY, xMinute, minuteY);
       mLine.setStroke(Color.BLUE);
       // Draw hour hand
       double hLength = clockRadius * 0.5;
       double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
       double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
       Line hLine = new Line(centerX, centerY, hourX, hourY);
       hLine.setStroke(Color.GREEN);
       getChildren().clear();
       getChildren().addAll(circle, sLine, mLine, hLine);
       
       // This is the part I added to make more detailed clock.
       Group ticks = new Group();
       Group numbers = new Group();
       /** Creating the big ticks (12) */
       for (int i = 0; i < 12; i++) {
           /** Creating a line with a width of 10 and placing at 'clockRadius' distance away from center */
           Line tick = new Line(0, clockRadius, 0, clockRadius - 10);
           // setTranslate means parallel movement of the X, Y, and Z axes in each direction.
           tick.setTranslateX(centerX);
           tick.setTranslateY(centerY);
           // Applying proper rotation to rotate the tick(An hour means 30 degrees in clock.)
           tick.getTransforms().add(new Rotate(i * (360 / 12)));
           // Adding to ticks group
           ticks.getChildren().add(tick);
       }
       /** Creating the small ticks (60) */
       for (int i = 0; i < 60; i++) {
           // Lines will have a width of 5 (line of minute is shorter than line of an hour).
           Line tick = new Line(0, clockRadius, 0, clockRadius - 5);
           tick.setTranslateX(centerX);
           tick.setTranslateY(centerY);
           tick.getTransforms().add(new Rotate(i * (360 / 60))); // (An minute means 6 degrees in clock.)
           ticks.getChildren().add(tick);
       }
       /** Creating the numbers */
       int num = 12; // Starting with 12
       for (int i = 0; i < 12; i++) {
           // Finding proper position x and y by applying the equation. It is similar with equation at drawing a hour hand.
           double x = centerX + (clockRadius - 20) * Math.sin((i % 12) * (2 * Math.PI / 12));
           double y = centerY - (clockRadius - 20) * Math.cos((i % 12) * (2 * Math.PI / 12));
           // Defining a text about hour , x-5 and y+5 are used to align text in proper position, considering  width & height of clock)
           Text t = new Text(x - 5, y + 5, "" + num);
           // adding to display.
           numbers.getChildren().add(t);
           num++;
           if (num > 12) {
               num = 1;
           }
       }
       // Adding ticks and numbers
       getChildren().add(ticks);
       getChildren().add(numbers);   
   }
}
