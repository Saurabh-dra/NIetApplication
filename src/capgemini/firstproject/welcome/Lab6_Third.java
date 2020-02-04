package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6_Third {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6_Third obj = new Lab6_Third();
		System.out.println(obj.getImage());
	}
	public String getImage() {
		String str=null;
		System.out.println("Enter the string");
		try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuffer sbuff=new StringBuffer(str);
		String strev=sbuff.reverse().toString();
		str=str.concat("|");
		str=str.concat(strev);
		return str;
	}
	

}
