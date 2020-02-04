package capgemini.bank.rbi;

import java.util.Scanner;

public class HDFC extends RBI {
	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		super.displayBalance();
	}

	@Override
	public void addAmount(Scanner scan) {
		// TODO Auto-generated method stub
		super.addAmount(scan);
		setAddInterest(2.75);
	}

	@Override
	public void withdrawAmount(Scanner scan) {
		// TODO Auto-generated method stub
		super.withdrawAmount(scan);
		setWithdrawInterest(2);
		setMinBalance(2000);
	}
}
