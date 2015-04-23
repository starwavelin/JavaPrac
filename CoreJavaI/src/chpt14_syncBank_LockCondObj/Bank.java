package chpt14_syncBank_LockCondObj;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
	
	private final double[] accounts;
	
	// Added
	private Lock bankLock;
	private Condition sufficientFunds;
	
	public Bank(int n, double initialBalance) {
		accounts = new double[n];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = initialBalance;
		}
		
		// Added
		bankLock = new ReentrantLock();
		sufficientFunds = bankLock.newCondition();
	}
	
	public void transfer(int from, int to, double amount) {
		
		bankLock.lock();
		try {
			/*if (accounts[from] < amount) {
				return;
			}*/
			
			// Replaced by 
			while (accounts[from] < amount) {
				sufficientFunds.await();
			}
			
			System.out.print(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf(" %10.2f from %d to %d", amount, from , to);
			accounts[to] += amount;
			System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
			
			// Add
			sufficientFunds.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			bankLock.unlock();
		}
	}

	public double getTotalBalance() {
		
		bankLock.lock();
		try {
			double sum = 0;
			for (double a : accounts) {
				sum += a;
			}
			return sum;
		} finally {
			bankLock.unlock();
		}
		
	}
	
	/**
	 * Get the number of accounts in the bank.
	 * @return the number of accounts.
	 */
	public int size() {
		return accounts.length;
	}
	
}
