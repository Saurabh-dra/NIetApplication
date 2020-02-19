package capgemini.firstproject.welcome;

public class Lab1_Second {
	int natural_number = 10;

	public static void main(String[] args) {
		Lab1_Second mObject = new Lab1_Second();
		System.out.println("Difference is :" + mObject.calculateDifference(mObject.natural_number));

	}

	public int calculateDifference(int number) {
		int sum_of_square, square_of_sum, sum = 0;
		sum = number * (number - 1) / 2;
		sum_of_square = number * (number + 1) * (2 * number + 1) / 6;
		square_of_sum = sum * sum;
		return sum_of_square - square_of_sum;
	}

}
