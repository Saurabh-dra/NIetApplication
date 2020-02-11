package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab10_Fifth {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		Lab10_Fifth obj = new Lab10_Fifth();
		math m = obj::fact;
		m.fact();

	}

	void fact() {
		System.out.println("Enter a number:");
		int a = 0;
		try {
			a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int fact = 1;
		while (a != 0) {
			fact = fact * a;
			a--;
		}
		System.out.println("Factorial:"+fact);
	}

}

interface math {
	void fact();
}
