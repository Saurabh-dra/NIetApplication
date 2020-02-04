package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Lab6_Ninth {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		Lab6_Ninth obj=new Lab6_Ninth();
		obj.difference();
	}
	public void difference() {
		String str=null;
		System.out.println("Enter date is DD.MM.YYYY format:");
		try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ar[]=str.split("/");	
		LocalDate date=LocalDate.of(Integer.parseInt(ar[2]),Integer.parseInt(ar[1]), Integer.parseInt(ar[0]));
		LocalDate today=LocalDate.now();
		
		Period diff=Period.between(date, today);
		
		System.out.printf("Difference:%d years %d months %d days",diff.getYears(),diff.getMonths(),diff.getDays());
		
	}

}
