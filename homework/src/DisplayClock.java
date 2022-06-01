import java.util.*;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
// Class ClockPane derived from Pane class
class DetailedClockPane extends Pane
{
// Instance variable to store hour, minute and second value
private int hourValue;
private int minuteValue;
private int secondValue;
// Clock panes width and height
private double width = 500, height = 500;
// Default construct definition to create clock with the current time
public DetailedClockPane()
{
setPrefHeight(height);
setPrefWidth(width);
// Calls the method to set the current time
setCurrentTime();
}// End of default constructor
// Parameterized construct definition to create a clock with specified hour, minute, and second
public DetailedClockPane(int hour, int minute, int second)
{
// Calls the default constructor
this();
// Assigns the parameter values to the instance variables
hourValue = hour;

minuteValue = minute;
secondValue = second;
// Calls the method to display the clock
displayClock();
}// End of parameterized constructor
// Method to return hour time
public int getHour()
{
return hourValue;
}// End of method
// Method to set hour time

public void setHour(int hour)
{
hourValue = hour;
// Calls the method to display the clock
displayClock();
}// End of method
// Method to return minute time
public int getMinute()
{
return minuteValue;
}// End of method
// Method to set minute time
public void setMinute(int minute)
{
minuteValue = minute;
// Calls the method to display the clock
displayClock();
}// End of method
// Method to return second time
public int getSecond()
{
return secondValue;
}// End of method
// Method to set second time
public void setSecond(int second)
{
secondValue = second;
// Calls the method to display the clock
displayClock();
}// End of method
// Method to return clock panes width
public double getPaneWidth()
{
return width;
}// End of method
// Method to set clock panes width
public void setPaneWidth(double width)
{
this.width = width;
// Calls the method to display the clock
displayClock();
}// End of method
// Method to return clock panes height
public double getPaneHeight()
{
return height;
}// End of method
// Method to set clock panes height
public void setPaneHeight(double height)
{
this.height = height;
// Calls the method to display the clock
displayClock();
}// End of method
// Method to set the current time for the clock
public void setCurrentTime()
{
// Construct a Calendar class object for the current date and time
Calendar calendar = new GregorianCalendar();
// Set current hour, minute and second
hourValue = calendar.get(Calendar.HOUR_OF_DAY);
minuteValue = calendar.get(Calendar.MINUTE);
secondValue = calendar.get(Calendar.SECOND);
// Calls the method to display the clock
displayClock();
}// End of method
// Method to display the clock
private void displayClock()
{
// Initialize clock radius
double clockRadius = Math.min(width, height) * 0.8 * 0.5;
// Initialize clock center x co-ordinate
double centerX = width / 2;
// Initialize clock center y co-ordinate

double centerY = height / 2;
// Creates a Point2D class object with centerX and centerY
Point2D center = new Point2D(centerX, centerY);
// Creates a circle for clock with centerX, centerY and radius as a parameter
Circle clockCircle = new Circle(centerX, centerY, clockRadius);
// Sets the fill color of clock
clockCircle.setFill(Color.YELLOW);
// Sets the line color of the clock
clockCircle.setStroke(Color.BLACK);
// Draw time numbers
// Creates a Text array of size 12 to store time numbers 1 - 12
Text[] timeNumber = new Text[12];
// Loops 12 times
for (int co = 0; co < 12; co++)
{
int time = (co + 3 > 12) ? co + 3 - 12 : co+3;
Point2D b = new Point2D(
centerX + clockRadius * Math.cos(co * 2 * Math.PI / 12),
centerY + clockRadius * Math.sin(co * 2 * Math.PI / 12));
b = getPointCloser(center, b, 0.82);
timeNumber[co] = new Text(
b.getX() - (clockRadius * 0.03125), b.getY() + (clockRadius * 0.025), "" + time);
}// End of for loop
// Line array to store each second line
Line[] secondDashes = new Line[60];
// Loops 60 times to generate second dashed lines
for (int co = 0; co < secondDashes.length; co++)
{
Point2D start = new Point2D(

centerX + clockRadius * Math.cos(co * 2 * Math.PI / 60),
centerY + clockRadius * Math.sin(co * 2 * Math.PI / 60));
double coefficient = (co % 5 == 0) ? 0.91 : 0.955;
Point2D end = getPointCloser(center,start, coefficient);
secondDashes[co] = new Line(start.getX(), start.getY(), end.getX(), end.getY());
}// End of for loop
// Procedure to draw second hand
double secondHandLength = clockRadius * 0.8;
double secondHandX = centerX + secondHandLength * Math.sin(secondValue * (2 * Math.PI / 60));
double secondHandY = centerY - secondHandLength * Math.cos(secondValue * (2 * Math.PI / 60));
Line secondLine = new Line(centerX, centerY, secondHandX, secondHandY);
secondLine.setStroke(Color.RED);
// Procedure to draw minute hand
double minuteHandLength = clockRadius * 0.65;
double minuteHandX = centerX + minuteHandLength * Math.sin(minuteValue * (2 * Math.PI / 60));
double minuteHandY = centerY - minuteHandLength * Math.cos(minuteValue * (2 * Math.PI / 60));
Line minuteLine = new Line(centerX, centerY, minuteHandX, minuteHandY);
minuteLine.setStroke(Color.BLUEVIOLET);
// Procedure to draw hour hand
double hourHandLength = clockRadius * 0.5;
double hourHandX = centerX + hourHandLength * Math.sin((hourValue % 12 + minuteValue / 60.0) * (2 *
Math.PI / 12));
double hourHandY = centerY - hourHandLength * Math.cos((hourValue % 12 + minuteValue / 60.0) * (2 *
Math.PI / 12));
Line hourLine = new Line(centerX, centerY, hourHandX, hourHandY);
hourLine.setStroke(Color.GREEN);
// Stores time HH:MM:SS
String hms = "" + getHour() + ":" + getMinute() + ":" + getSecond();
// Sets the time HH:MM:SS to Text
Text timeTextHMS = new Text(getPaneWidth() * 0.47, getPaneHeight() - 20, hms);
// Clears the nodes added
getChildren().clear();
// Creates an ObjservableList object
ObservableList<Node> observableList = getChildren();
// Adds the circle to observable list
observableList.add(clockCircle);
// Adds the second dahses
Collections.addAll(observableList, secondDashes);
// Adds the time numbers
Collections.addAll(observableList, timeNumber);
// Adds hour, minute, second lines and text for the time
observableList.addAll(secondLine, minuteLine, hourLine, timeTextHMS);
}// End of method
// Method to return the closest point
private Point2D getPointCloser(Point2D one, Point2D two, double coefficient)
{
// Calculate delta x and y coordinate
double deltaX = two.getX() - one.getX();
double deltaY = two.getY() - one.getY();
// Calculates return closest point
return new Point2D( one.getX() + coefficient * deltaX, one.getY() + coefficient * deltaY);
}// End of method
}// End of class
// Defines driver class DetailedClock derived from class Application

public class DisplayClock extends Application
{
// Overrides start method of class Application
@Override
public void start(Stage stage)
{
// Creates an object of class ClockPane using default constructor
ClockPane clockTwo = new ClockPane();
// Creates an HBox object to attach ClockPane object
HBox hBox = new HBox(clockTwo);
// Creates a Scene and adds HBox object
Scene sceneObj = new Scene(hBox);
// Places the scene in the stage
stage.setScene(sceneObj);
// Sets the title
stage.setTitle("Detailed Clock");
// Display the stage
stage.show();
}// End of method
// main method definition
public static void main(String[] args)
{
launch(args);
}// End of main method
}// End of DetailedClock class
