import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ThreadCooperation {
	private static Account account = new Account();
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new DepositTask());
		executor.execute(new WithdrawTask());
		executor.shutdown();
		
	}
	
	public static class DepositTask implements Runnable {

		@Override
		public void run() {
			
			try {
				while(true) {
				account.deposit((int)(Math.random() * 10) + 1);
				Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		
		
	}
	
	public static class WithdrawTask implements Runnable {

		@Override
		public void run() {
			while(true) {
				account.withdraw((int)(Math.random() * 10) + 1);		
				}	
		}

	}
	// An inner class for account
	private static class Account {
		private static Lock lock = new ReentrantLock();
		
		private static Condition newDeposit = lock.newCondition();
		
		private int balance = 0;
		public int getBalance() {
			return balance;
		}
		public void withdraw(int amount) {
			/*
			//lock.lock();
			System.out.println("Withdrawing : " + amount + "         balance : "+getBalance());
		
			while(balance < amount) {
				//lock.unlock(); // 이 부분 좀 중요하긴 할듯    => 여기에서 갇힌다!! 
				// we need to wake up thread 2 and check the condition 
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			lock.lock();
			balance -= amount;
			
			System.out.println("Withdraw : " + amount + "         balance : "+getBalance());
			lock.unlock(); // 이렇게 필요하구나
			*/
			lock.lock();
			System.out.println("Withdrawing : " + amount + "         balance : "+getBalance());
		
			try {
				while(balance < amount) {
					System.out.println("wait for a deposit");
					newDeposit.await();
				}
				balance -= amount;
				System.out.println("Withdraw : " + amount + "         balance : "+getBalance());
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				}
		
			finally {
				lock.unlock();
			}
		}
		
		public void deposit(int amount){
			lock.lock();
			try {
				balance += amount;
				System.out.println("Deposit : " + amount + "         balance : "+getBalance());
				newDeposit.signalAll();
			}
			finally {
				lock.unlock(); // 이렇게 필요하구나
			}
			
		}
	}
}
