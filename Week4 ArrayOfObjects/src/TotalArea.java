
public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] circleArray = createCircleArray();
		for(int i = 0 ; i<circleArray.length ;i++)
		{
			System.out.println(i+1+"번쨰 원의 반지름은 "+ circleArray[i]);
		}
		printCircleArray(circleArray);
		
	}
	
	public static Circle[] createCircleArray() {
		Circle[] circleArray = new Circle[5];
		for(int i = 0 ; i<circleArray.length ;i++)
		{
			circleArray[i] = new Circle(Math.random() * 1000);
		}
		return circleArray;
	}
	
	public static void printCircleArray(Circle[] circleArray)
	{
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i =0; i< circleArray.length;i++)
		{
			System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}
	}

}
