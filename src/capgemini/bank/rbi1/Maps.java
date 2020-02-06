package capgemini.bank.rbi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class Maps {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		Maps obj = new Maps();
		obj.setMap();
	}

	void setMap() {
		int flag = 0;
		HashMap<String, Customer> mMap = new HashMap<String, Customer>();

		while (flag == 0) {
			System.out.println("Enter Customer details:");
			String name = null;
			String bank = null;
			double balance = 0;
			try {
				System.out.print("Name:");
				name = br.readLine();
				System.out.print("BankName:");
				bank = br.readLine();
				System.out.print("Balance:");
				balance = Double.parseDouble(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Customer c = new Customer(name, balance, bank);
			String accno = "" + (long) (Math.random() * ((900000000 - 100000000) + 1));
			mMap.put(accno, c);

			System.out.println("Want to continue? Press 0 to continue or 1 to STOP");
			int s = -1;
			try {
				s = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (s == 0)
				flag = 0;
			else
				flag = 1;
		}
		Iterator<Entry<String, Customer>> i = mMap.entrySet().iterator();
		System.out.println("Result");
		while (i.hasNext()) {
			Map.Entry<String, Customer> me = (Map.Entry<String, Customer>) i.next();
			System.out.println("Account Number=" + me.getKey());
			System.out.println("Name:" + me.getValue().getName() + "\n Bank:" + me.getValue().getBankname()
					+ "\n Balance:" + me.getValue().getBalance());
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
