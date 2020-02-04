package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lab6_First {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6_First obj = new Lab6_First();
		obj.showSum();
	}

	public void showSum() {
		System.out.println("Enter space seperated numbers:");
		String st = null;
		try {
			st = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		StringTokenizer str = new StringTokenizer(st, " ");
		int sum = 0;
		while (str.hasMoreTokens()) {
			String str1 = str.nextToken();
			System.out.println(str1);
			sum += Integer.parseInt(str1);
		}
		System.out.println("Sum is:" + sum);
	}

}
