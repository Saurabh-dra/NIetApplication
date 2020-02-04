package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6_Fourth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab6_Fourth obj = new Lab6_Fourth();
		System.out.println("Enter your String:");
		String str = null;
		try {
			str = obj.br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj.alterString(str));
	}

	public String alterString(String str) {
		int len = str.length();
		char ch;
		String result = "";
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				result = result + str.charAt(i);
			} else {
				ch = (char) (str.charAt(i)+1);
				result = result + ch;
			}
		}

		return result;

	}

}
