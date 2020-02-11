package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lab7_First {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		Lab7_First obj=new Lab7_First();
		ArrayList<Integer> list=obj.getValues();
		System.out.println(list);
	}
	public ArrayList<Integer> getValues() {
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
		System.out.println("Enter Keys and Values:");
		int key[]= new int[size];
		int values[]= new int[size];
		for(int i=0;i<size;i++) {
			try {
				key[i]=Integer.parseInt(br.readLine());
				values[i]=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<size;i++) {
			hm.put(key[i], values[i]);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(hm.values());
		
		Collections.sort(list);
		return list;
		
		
	}

}
