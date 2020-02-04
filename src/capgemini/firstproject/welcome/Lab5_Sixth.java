package capgemini.firstproject.welcome;

import com.cg.eis.exception.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5_Sixth {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		
		Lab5_Sixth obj=new Lab5_Sixth();
			obj.check();
	}
	void check() {
		System.out.println("Enter the salary:");
		int salary=0;
		try {
			salary=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EmployeeException o=new EmployeeException(null);
			try {
				o.checked(salary);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
	}

}
