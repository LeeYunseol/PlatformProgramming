
public class Exceptiontest2 {
	static void callDriver() throws ClassNotFoundException { // declarion�� ���⼭ �ع����� main���� try catch
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
	public static void main(String[] args) throws ClassNotFoundException { // �̰� �ȵǴµ��� ������?
		// TODO Auto-generated method stub
		//callDriver();
		
		try {
			callDriver();
		}
		catch (ClassNotFoundException e ) { // �̰� �켱 
			System.out.println("oracle.jdbc.driver.OracleDriver is not found");
		}
		catch (Exception e ) {
			System.out.println("oracle.jdbc.driver.OracleDriver is not found2");
		}
		
	}

}
