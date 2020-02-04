package capgemini.firstproject.welcome;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab5_Fifth {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
			Lab5_Fifth object=new Lab5_Fifth();
			object.getAge();
		}

		void getAge() {
			System.out.println("Enter the age");
			int age=0;
			try {
				age=Integer.parseInt(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try{
				validate(age);
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
		void validate(int age) throws MyException{
			if(age<=15)
				throw new MyException("Age should be above 15");			
				
		}
	}

