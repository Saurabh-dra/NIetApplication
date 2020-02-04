package capgemini.firstproject.welcome;

public class Labbook_Second {
	int natural_number = 10;

	public static void main(String[] args) {
		Labbook_Second mObject = new Labbook_Second();
		System.out.println("Difference is :" + mObject.calculateDifference(mObject.natural_number));

	}

	public int calculateDifference(int number) {
		int sum_of_square, square_of_sum, sum = 0;
		/*
		 * for(int i=1;i<=number;i++) { sum_of_square+=i*i; square_of_sum+=i; }
		 */
		sum = number * (number - 1) / 2;
		sum_of_square = number * (number + 1) * (2 * number + 1) / 6;
		square_of_sum = sum * sum;
		return sum_of_square - square_of_sum;
	}

}
