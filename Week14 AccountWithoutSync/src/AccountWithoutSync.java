import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithoutSync {
	
	private static Account account = new Account();
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for (int i=0; i<100 ; i++)
		{
			executor.execute(new addPennyTask());
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated())
		{
		
			
		}
		System.out.println("what is balance? " + account.getBalance());
		
	}
	private static class addPennyTask implements Runnable {

		@Override
		public void run() {
			account.deposit(1);
			
		}
		
	}
	private static class Account {
		private int balance = 0;
		private static Lock lock = new ReentrantLock();
		public int getBalance() {
			return balance;
		}
		public void deposit(int amount) {
			lock.lock();
			int   = balance + amount;
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = newBalance;
			lock.unlock();
		}
	}
}
