package capgemini.bank.rbi;

import java.util.Scanner;

public class RBI {
	double addInterest, withdrawInterest, minBalance, Balance;
	int addCounter, withdrawCounter;
	// Scanner scan = new Scanner(System.in);

	public void displayBalance() {
		System.out.println("Your balance is:" + Balance);
	}

	public void addAmount(Scanner scan) {
		setAddCounter(getAddCounter() + 1);
		System.out.println("Enter the amount to add:");
		int amount = scan.nextInt();
		// setAddInterest(2.75);
		if (getAddCounter() <= 3) {
			setBalance(getBalance() + amount);
		} else {
			setBalance(getBalance() + amount);
			setBalance(getBalance() + (getAddInterest() * getBalance()) / 100);
		}

	}

	public void withdrawAmount(Scanner scan) {
		setWithdrawCounter(getWithdrawCounter() + 1);
		System.out.println("Enter the amount to withdraw:");
		int amount = scan.nextInt();
		if (getBalance() - amount >= getMinBalance()) {
			if (getWithdrawCounter() <= 3) {
				setBalance(getBalance() - amount);
			} else {
				setBalance(getBalance() - amount);
				setBalance(getBalance() - (getWithdrawInterest() * getBalance()) / 100);
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
