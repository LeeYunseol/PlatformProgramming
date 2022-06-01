
public class MyExceptionTest {
	static void callException() throws MyException {
		// Create an instance of MyException and throw it by itself
		throw new MyException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			callException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Program will be terminated!! ");
		}
	}

}
