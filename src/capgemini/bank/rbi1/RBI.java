package capgemini.bank.rbi1;

import java.util.HashMap;
import java.util.Scanner;

public class RBI {
	double addInterest, withdrawInterest, minBalance, Balance;
	int addCounter, withdrawCounter;
	// Scanner scan = new Scanner(System.in);

	public void displayBalance(HashMap<String, Customer> me, String accno) {
		Customer mCustomer=me.get(accno);
		System.out.println("Your balance is:" + mCustomer.getBalance());
	}

	public void addAmount(Scanner scan, HashMap<String, Customer> me, String accno) {
		setAddCounter(getAddCounter() + 1);
		System.out.println("Enter the amount to add:");
		double amount = scan.nextInt();
		Customer mCustomer = me.get(accno);

		// setAddInterest(2.75);
		if (getAddCounter() <= 3) {
			mCustomer.setBalance(mCustomer.getBalance() + amount);
			me.put(accno, mCustomer);

		} else {
			mCustomer.setBalance(mCustomer.getBalance() + amount);
			me.put(accno, mCustomer);
			mCustomer.setBalance(mCustomer.getBalance() + (mCustomer.getBalance() * getAddInterest() / 100));
			me.put(accno, mCustomer);
		}

	}

	public void withdrawAmount(Scanner scan, HashMap<String, Customer> me, String accno) {
		setWithdrawCounter(getWithdrawCounter() + 1);
		System.out.println("Enter the amount to withdraw:");
		double amount = scan.nextInt();
		Customer mCustomer = me.get(accno);

		if (mCustomer.getBalance() - amount >= getMinBalance()) {
			if (getWithdrawCounter() <= 3) {
				mCustomer.setBalance(mCustomer.getBalance() - amount);
			} else {
				mCustomer.setBalance(mCustomer.getBalance() - amount);
				me.put(accno, mCustomer);
				mCustomer.setBalance(mCustomer.getBalance() - (getWithdrawInterest() * mCustomer.getBalance()) / 100);
				me.put(accno, mCustomer);
			}
		} else
			System.out.println("Not Enough Balance");
	}

	public double getAddInterest() {
		return addInterest;
	}

	public void setAddInterest(double addInterest) {
		this.addInterest = addInterest;
	}

	public double getWithdrawInterest() {
		return withdrawInterest;
	}

	public void setWithdrawInterest(double withdrawInterest) {
		this.withdrawInterest = withdrawInterest;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public int getAddCounter() {
		return addCounter;
	}

	public void setAddCounter(int addCounter) {
		this.addCounter = addCounter;
	}

	public int getWithdrawCounter() {
		return withdrawCounter;
	}

	public void setWithdrawCounter(int withdrawCounter) {
		this.withdrawCounter = withdrawCounter;
	}

}
