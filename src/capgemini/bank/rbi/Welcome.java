package capgemini.bank.rbi;

import java.util.*;

public class Welcome {
	Scanner scan = new Scanner(System.in);
	RBI iRBI;

	public static void main(String args[]) {
		Welcome mObject = new Welcome();
		mObject.selectBank();
		System.out.println();
	}

	public void selectBank() {
		System.out.println("Welcome to IBS");
		int flag = 1;
		while (flag == 1) {
			System.out.println("1. ICICI \n2. HDFC \n3. SC \n4. Axis");
			int number = scan.nextInt();
			switch (number) {
			case 1:
				iRBI = (ICICI) new ICICI();
				selectOperation(iRBI);
				break;
			case 2:
				iRBI = (HDFC) new HDFC();
				selectOperation(iRBI);
				break;
			case 3:
				iRBI = (SC) new SC();
				selectOperation(iRBI);
				break;
			case 4:
				iRBI = (AXIS) new AXIS();
				selectOperation(iRBI);
				break;
			default:
				break;
			}
		}
	}

	public void selectOperation(RBI Obj) {
		int flag = 1;
		while (flag == 1) {
			System.out.println("Select Operation: \n1. Add Money 2. Withdraw 3. Display 4.End");
			int operation = scan.nextInt();
			switch (operation) {
			case 1:
				Obj.addAmount(scan);
				break;
			case 2:
				Obj.withdrawAmount(scan);
				break;
			case 3:
				Obj.displayBalance();
				break;
			case 4:
				flag = 0;
				break;
			default:
				System.out.println("Wrong Operation!");
				break;
			}
		}
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

}
