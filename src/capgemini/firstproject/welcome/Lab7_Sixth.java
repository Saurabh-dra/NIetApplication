package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Lab7_Sixth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab7_Sixth obj = new Lab7_Sixth();
		System.out.println(obj.getStudent(obj.getValues()));

	}

	public HashMap<Integer, String> getValues() {
		System.out.println("Enter Number of Entries:");
		int size = 0;
		try {
			size = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int key[] = new int[size];
		String values[] = new String[size];
		for (int i = 0; i < size; i++) {
			try {
				System.out.println("Enter ID:");
				key[i] = Integer.parseInt(br.readLine());
				System.out.println("Enter date is DD/MM/YYYY format");
				values[i] = br.readLine();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = 0; i < size; i++) {
			hm.put(key[i], values[i]);
		}
		return hm;
	}

	public ArrayList<Integer> getStudent(HashMap<Integer, String> hm) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) itr.next();
			if(difference(me.getValue())==true)
			{
				list.add(me.getKey());
			}
		}
		return list;
	}
	public boolean difference(String str) {
		
		String ar[]=str.split("/");	
		LocalDate date=LocalDate.of(Integer.parseInt(ar[2]),Integer.parseInt(ar[1]), Integer.parseInt(ar[0]));
		LocalDate today=LocalDate.now();
		
		Period diff=Period.between(date, today);
		
		if(diff.getYears()>=18)
			return true;
		else
			return false;
		
		//System.out.printf("Difference:%d years %d months %d days",diff.getYears(),diff.getMonths(),diff.getDays());
		
	}
}
