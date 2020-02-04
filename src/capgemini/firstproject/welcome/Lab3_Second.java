package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lab3_Second {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader buff = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab3_Second m = new Lab3_Second();
		m.getInput();
	}

	public void getInput() {
		String str1 = "";
		try {

			System.out.println("enter the string:");
			str1 = buff.readLine();
			char str[] = str1.toCharArray();
			Arrays.sort(str);
			str1 = String.valueOf(str);

			int mid = (str1.length() + 1) / 2;
			String part[] = { str1.substring(0, mid), str1.substring(mid) };

			part[0] = part[0].toUpperCase();

			part[1] = part[1].toLowerCase();

			System.out.println(part[0] + "" + part[1]);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buff.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
