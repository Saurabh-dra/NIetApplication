package capgemini.firstproject.welcome;

import java.util.Scanner;
public class Lab1_Banking {
	int number,amount,addCount=0,withdrawCount=0,minBalance=1000,balance=0;
	Scanner scan=new Scanner(System.in);
	public static void main(String args[])
	{
		Lab1_Banking mObject=new Lab1_Banking();
		mObject.selectBank();
		System.out.println();
	}
	public void selectBank() {
		System.out.println("Welcome to IBS");
		System.out.println("1. ICICI \n2. HDFC \n3. SC \n4. Axis");
		int number=scan.nextInt();
		switch(number)
		{
		case 1: selectOperation(1.5,2.5);
				break;
		case 2: selectOperation();
				break;
		case 3: selectOperation();
				break;		
		case 4: selectOperation();
				break;
		default : break;
		}	
	}
	/*public void icici(int addrate) {
		
	}
	public void hdfc(int addrate) {
		
	}
	public void sc(int addrate) {
		
	}
	public void axis(int addrate) {
		
	}**/
	
	public void selectOperation(double addRate,double wtdRate)
	{	
		System.out.println("Select Operation: 1. Add Money 2. Withdraw 3. End");
		int operation=scan.nextInt();
		switch(operation)
		{
		case 1: addMoney(addRate);
				break;
		case 2: withdrawMoney(wtdRate);
				break;
		case 3: break;
		default : break;
		}	
	}
	public void addMoney()
	{	
		System.out.println("Enter Amount for Adding");
		addCount++;
		amount=scan.nextInt();
		if(addCount<=3) {
			balance=balance+amount;
		}
		else {
			balance=balance+amount;
			balance+=(1.5*balance/100);
		}
		System.out.println("Balance after adding ="+balance);
		selectOperation();
	}
	public void withdrawMoney()
	{	
		System.out.println("Enter Amount for Withdrawing");
		withdrawCount++;
		amount=scan.nextInt();
		if((balance-amount)>minBalance) {
		if(withdrawCount<=3) {
			balance=balance-amount;
		}
		else {
			balance=balance-amount;
			balance-=(2.5*balance/100);
		}
		System.out.println("Balance after withdrawing ="+balance);
		}
		else
		{
			System.out.println("Sorry can't withdraw money!");
		}
		selectOperation();
	}
}
