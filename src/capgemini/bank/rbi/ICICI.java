package capgemini.bank.rbi;

import java.util.Scanner;

public class ICICI extends RBI {

	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		super.displayBalance();
	}

	@Override
	public void addAmount(Scanner scan) {
		// TODO Auto-generated method stub
		setAddInterest(2.3);
		super.addAmount(scan);
	}

	@Override
	public void withdrawAmount(Scanner scan) {
		// TODO Auto-generated method stub
		setWithdrawInterest(1.5);
		setMinBalance(3000);
		super.withdrawAmount(scan);
	}
}
