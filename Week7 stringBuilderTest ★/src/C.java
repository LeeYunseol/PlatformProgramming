
public class C {
	private int p;
	public C(int p) {this.p = p;}
	public C()
	{
		System.out.println("시발진짜");
		this(0);
	}
	public void SetP(int p)
	{
		this.p = p;
	}

}
