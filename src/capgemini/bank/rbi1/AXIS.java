package capgemini.bank.rbi1;

import java.util.Scanner;

public class AXIS extends RBI {
	@Override
	public void displayBalance() {
		// TODO Auto-generated method stub
		super.displayBalance();
	}

	@Override
	public void addAmount(Scanner scan) {
		// TODO Auto-generated method stub
		super.addAmount(scan);
		setAddInterest(2);
	}

	@Override
	public void withdrawAmount(Scanner scan) {
		// TODO Auto-generated method stub
		super.withdrawAmount(scan);
		setWithdrawInterest(1.7);
		setMinBalance(4000);
	}

}
