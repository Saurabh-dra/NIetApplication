package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab10_Third {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab10_Third obj = new Lab10_Third();
		obj.auth();
	}

	public void auth() {
		String uName="",pWord="";
		try {
			System.out.println("Enter username:");
			uName = br.readLine();
			System.out.println("Enter Password:");
			pWord = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Authenticate at = (user, pw) -> {
			if (user.equals("admin") && pw.equals("admin"))
				return true;
			else
				return false;
		};
		System.out.println(at.validate(uName, pWord));
	}

}

interface Authenticate {
	boolean validate(String user, String pw);
}