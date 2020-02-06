package capgemini.bank.rbi1;

public class Customer {
	
		String name, bankname;
		double balance;

		public Customer(String name2, double balance2, String bank) {
			// TODO Auto-generated constructor stub
			name=name2;
			balance=balance2;
			bankname=bank;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}


		public String getBankname() {
			return bankname;
		}

		public void setBankname(String bankname) {
			this.bankname = bankname;
		}


}
