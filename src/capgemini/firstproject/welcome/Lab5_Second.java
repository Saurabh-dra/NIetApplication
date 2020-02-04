package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5_Second {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab5_Second obj = new Lab5_Second();
		obj.getNumber();
	}

	public void getNumber() {
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
		System.out.println("Without Reccursion:" + getFibb(num));
		System.out.println("With Reccursion:" + getRecFibb(num));

	}

	public int getFibb(int num) {
		int fibb = 0, a = 1, b = 1, i = 0;
		while (i < num - 2) {
			fibb = a + b;
			a = b;
			b = fibb;
			i++;
		}
		return fibb;
	}

	public int getRecFibb(int num) {
		if (num <= 1)
			return num;
		else
			return getRecFibb(num - 1) + getRecFibb(num - 2);
	}
}
