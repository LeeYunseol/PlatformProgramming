
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
			throw new Exception("new info from method1", e); // e���ٰ� "new info from method2"�� save�ϰ� new info from method1�� generate �Ѵ�.
		}
	}
	
	public static void method2() throws Exception
	{
		throw new Exception("New info from method2");
	}
}