
public class TotalArea_nook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] circleArray;
		
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
	}
	
	public static Circle[] createCircleArray() {
		Circle[] circleArray = new Circle[5];
		
		for(int i = 0 ; i<circleArray.length ; i++ ) {
			circleArray[i] = new Circle(Math.random() * 1000);
		}
		
		return circleArray;
	}
	
	public static void printCircleArray(Circle[] circleArray) {
		for(int i = 0 ; i<circleArray.length ; i++ ) {
			System.out.println(i+1+"¹ø Â°ÀÇ ¹ÝÁö¸§ : " + circleArray[i].getRadius());
			System.out.println(i+1+"¹ø Â°ÀÇ ³ÐÀÌ : " +circleArray[i].getArea());
		}
		System.out.println("³ÐÀÌ ÃÑÇÕ : "+ sum(circleArray));
	}
	
	public static double sum(Circle[] circleArray) {
		double sum = 0;
		
		for (int i = 0 ; i < circleArray.length ; i++)
		{
			sum += circleArray[i].getArea();
		}
		return sum;
	}

}
