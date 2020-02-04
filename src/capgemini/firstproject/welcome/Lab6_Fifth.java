package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6_Fifth {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab6_Fifth obj = new Lab6_Fifth();
		System.out.println("Enter the number");
		int number = 0;
		try {
			number = Integer.parseInt(obj.br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj.modifyNumber(number));

	}

	public StringBuffer modifyNumber(int number1) {

		String str = "" + number1;
		StringBuffer str2 = new StringBuffer();
		int len = str.length();
		for (int i = 0; i < len - 1; i++) {
			str2.append(Math.abs((int) str.charAt(i) - str.charAt(i + 1)));
		}
		str2.append(str.charAt(len - 1));
		return str2;

	}
}
