
public class ChainedExceptionDemo {
	public static void main(String[] args)
	{
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws Exception 
	{
		try {
			method2();
		} catch (Exception e) {
			//throw new Exception("new info from method1");			
			//throw e;
			throw new Exception("new info from method1", e); // e에다가 "new info from method2"를 save하고 new info from method1를 generate 한다.
		}
	}
	
	public static void method2() throws Exception
	{
		throw new Exception("New info from method2");
	}
}
