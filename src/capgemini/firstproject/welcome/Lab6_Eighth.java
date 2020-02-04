package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6_Eighth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab6_Eighth obj = new Lab6_Eighth();
		obj.show();
	}
	public void show() {
		
		System.out.println("Enter the string");
		String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int len=str.length(),flag=0;
		str=str.toLowerCase();
		for(int i=0;i<len-1;i++)
		{
			if(str.charAt(i)<str.charAt(i+1))
				flag=1;
			else {
				flag=0;break;
				}
		}
		if(flag==1)
			System.out.println("Positive String");
		else
			System.out.println("Negative String");
	}
}
