package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab4_First {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab4_First obj=new Lab4_First();
		System.out.println("Sum="+obj.getSum());
	}
	
	public int getSum() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		int num=0;
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum+=Math.pow(rem,3);
			num/=10;
		}
		return sum;

	}

}
