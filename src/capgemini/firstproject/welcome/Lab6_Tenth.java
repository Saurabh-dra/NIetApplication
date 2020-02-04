package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6_Tenth {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab6_Tenth obj = new Lab6_Tenth();
		System.out.println(obj.validate());
	}

	boolean validate() {
		System.out.println("Enter the username:");
		String str = null;
		try {
			str = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int flag=1;
		String s1 = null, s2 = null;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '_') {
				s1 = str.substring(0, i);
				s2 = str.substring(i);
				flag=0;
			}
			else flag=1;
		}
		System.out.println(s1);
		System.out.println(s2);
		if (s1.length() >= 8 && s2.contains("_job")&&flag==0)
			return true;
		else
			return false;
	}

}
