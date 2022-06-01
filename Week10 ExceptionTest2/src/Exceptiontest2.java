
public class Exceptiontest2 {
	static void callDriver() throws ClassNotFoundException { // declarion을 여기서 해버리면 main에서 try catch
		Class.forName("oracle.jdbc.driver.OracleDriver");
		/*
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("oracle.jdbc.driver.OracleDriver is not found");
		}
		*/
	}
	public static void main(String[] args) throws ClassNotFoundException { // 이거 안되는데요 선생님?
		// TODO Auto-generated method stub
		//callDriver();
		
		try {
			callDriver();
		}
		catch (ClassNotFoundException e ) { // 이게 우선 
			System.out.println("oracle.jdbc.driver.OracleDriver is not found");
		}
		catch (Exception e ) {
			System.out.println("oracle.jdbc.driver.OracleDriver is not found2");
		}
		
	}

}
