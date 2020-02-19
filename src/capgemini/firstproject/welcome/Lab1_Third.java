package capgemini.firstproject.welcome;

public class Lab1_Third {
	int number = 134468;

	public static void main(String[] args) {
		Lab1_Third mObject = new Lab1_Third();
		System.out.println(mObject.checkNumber(mObject.number));
	}

	public boolean checkNumber(int number) {
		int temp, last, prev, flag = 0;
		temp = number;
		while (temp > 0) {
			last = temp % 10;
			temp = temp / 10;
			prev = temp % 10;
			if (prev <= last)
				flag = 1;
			else {
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			return true;
		else
			return false;

	}
}
