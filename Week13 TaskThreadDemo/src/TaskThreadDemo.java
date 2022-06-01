
public class TaskThreadDemo {

	public static void main(String[] args) {
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new Printnum(100);
		
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);

		thread1.start();
		thread2.start();
		thread3.start();
	}

}

// Create task
class PrintChar implements Runnable {
	private char charToPrint; // The character to print
	private int times; // The times to repeat
	
	// Constructor
	public PrintChar(char c, int t)
	{
		charToPrint = c;
		times = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<times;i++)
			System.out.print(charToPrint);
		
	}
	
}

class Printnum implements Runnable {
	private int lastNum; 

	public Printnum(int n)
	{
		lastNum = n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<lastNum;i++) {
			System.out.print(" "+i);
			Thread.yield();   // 0 b b b b b b b b b a a a a b b b b 1 bb a a b b
							// printnum�ؼ� 0 ��� �׸��� yeild�ؼ� print b �׸����� printa  rm ekdmadp printnum �ѵڿ� print b, print a .... 
		}
		
	}
	
}