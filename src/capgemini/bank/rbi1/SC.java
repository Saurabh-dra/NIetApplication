package capgemini.bank.rbi1;

import java.util.Scanner;

public class SC extends RBI {
	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		super.displayBalance();
	}

	@Override
	public void addAmount(Scanner scan) {
		// TODO Auto-generated method stub
		setAddInterest(3.8);
		super.addAmount(scan);
	}

	@Override
	public void withdrawAmount(Scanner scan) {
		// TODO Auto-generated method stub
		setWithdrawInterest(3);
		setMinBalance(5000);
		super.withdrawAmount(scan);
	}

}
