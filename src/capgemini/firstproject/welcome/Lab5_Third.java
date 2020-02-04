package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5_Third {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab5_Third obj = new Lab5_Third();
		obj.displayPrime();
	}

	public void displayPrime() {
		int num = 0;
		System.out.println("Enter the number:");
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 2; i <= num; i++) {
			if (getPrime(i) == true)
				System.out.print(i + ",");

		}
	}

	boolean getPrime(int number) {
		if (number <= 1)
			return false;
		for (int j = 2; j < number; j++) {
			if (number % j == 0)
				return false;
		}
		return true;

	}

}
