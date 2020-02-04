package capgemini.firstproject.welcome;

public class Labbook1_Forth {
	int number = 1024;

	public static void main(String[] args) {
		Labbook1_Forth obj = new Labbook1_Forth();
		System.out.println(obj.checkNumber(obj.number));

	}

	public boolean checkNumber(int number) {
		int flag = 0;
		while (number > 1) {
			if (number % 2 == 0) {
				number = number / 2;
				flag = 1;
			} else {
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
