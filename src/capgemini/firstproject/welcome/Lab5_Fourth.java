package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5_Fourth {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab5_Fourth obj = new Lab5_Fourth();
		obj.getString();
	}

	void getString() {
		String first="",last="";
		System.out.println("Enter the name");
		
		try {
			first=br.readLine();
			last=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			validate(first,last);
		}
		catch(MyException e) {
			System.out.println(e);
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	void validate(String first,String last) throws MyException{
		if(first.isBlank()||last.isBlank())
			throw new MyException("First or Last name is Blank");
			
	}
}
