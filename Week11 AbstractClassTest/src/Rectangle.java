
public class Rectangle extends GeometricObject {
	double Width, Height;
	public Rectangle(double Width, double Height) {
		this.Width = Width;
		this.Height = Height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Width*Height;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return Width;
	}
	
}
