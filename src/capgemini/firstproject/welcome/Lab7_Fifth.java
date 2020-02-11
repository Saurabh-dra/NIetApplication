package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab7_Fifth {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab7_Fifth obj = new Lab7_Fifth();
		System.out.println(obj.getSecondSmallest(obj.getArray()));
	}
	
	public int[] getArray() {
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
		System.out.println("Enter Array Elements:");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			try {
				array[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return array;
	}
	
	public int getSecondSmallest(int arr[]){
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i:arr) {
			list.add(i);
		}
		Collections.sort(list);
		
		List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
		
		return list1.get(1);
//		int i=0,len;len=list.size();
//		{
//			for(int j=i+1;j<len;j++)
//			{
//				if(list.get(i)==list.get(j)) {
//					i++;
//				}
//				else
//					return list.get(j);
//			}
//		}
//		return list.get(0);
	}

}
