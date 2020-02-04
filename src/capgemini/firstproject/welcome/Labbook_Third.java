package capgemini.firstproject.welcome;

public class Labbook_Third {
	int number = 134468;

	public static void main(String[] args) {
		Labbook_Third mObject = new Labbook_Third();
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
