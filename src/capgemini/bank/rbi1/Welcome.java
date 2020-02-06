package capgemini.bank.rbi1;

import java.util.*;
import java.util.Map.Entry;

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

		HashMap<String, Customer> hMap = CustomerData.Customer_data();

		System.out.println("Enter account number:");
		String accno = scan.nextLine();

		Iterator<Entry<String, Customer>> i = hMap.entrySet().iterator();
		System.out.println("Account Details are:");
		String flag = "";
		Map.Entry<String, Customer> me = null;
		while (i.hasNext()) {
			me = (Map.Entry<String, Customer>) i.next();
			if (me.getKey().equals(accno)) {
				System.out.println("Name:" + me.getValue().getName() + "\n Bank:" + me.getValue().getBankname()
						+ "\n Balance:" + me.getValue().getBalance());
				flag = me.getValue().getBankname();
				break;
			}
		}

		// System.out.println("1. ICICI \n2. HDFC \n3. SC \n4. Axis");
		// int number = scan.nextInt();
		switch (flag) {
		case "ICICI":
			iRBI = (ICICI) new ICICI();
			selectOperation(iRBI,hMap,accno);
			break;
		case "HDFC":
			iRBI = (HDFC) new HDFC();
			selectOperation(iRBI,hMap,accno);
			break;
		case "SC":
			iRBI = (SC) new SC();
			selectOperation(iRBI,hMap,accno);
			break;
		case "AXIS":
			iRBI = (AXIS) new AXIS();
			selectOperation(iRBI,hMap,accno);
			break;
		default:
			break;
		}
	}

	public void selectOperation(RBI Obj,HashMap<String, Customer> me,String accno) {
		int flag = 1;
		while (flag == 1) {
			System.out.println("Select Operation: \n1. Add Money 2. Withdraw 3. Display 4.End");
			int operation = scan.nextInt();
			switch (operation) {
			case 1:
				Obj.addAmount(scan,me,accno);
				break;
			case 2:
				Obj.withdrawAmount(scan,me,accno);
				break;
			case 3:
				Obj.displayBalance(me,accno);
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
